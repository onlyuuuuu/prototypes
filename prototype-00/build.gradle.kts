import java.io.BufferedReader
import java.io.InputStreamReader

plugins {
    id("java")
    id("war")
    id("maven-publish")
}

group = "com.onlyu"
version = "1.0"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.13")
    implementation("ch.qos.logback:logback-classic:1.5.6")
    implementation("ch.qos.logback:logback-core:1.5.6")
    implementation("org.apache.tomcat:tomcat-jasper:11.0.0-M20")
    implementation("org.apache.tomcat:tomcat-jasper-el:11.0.0-M20")
    implementation("jakarta.servlet:jakarta.servlet-api:6.1.0")
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.war {
    version = ""
}

tasks.test {
    useJUnitPlatform()
}

tasks.compileJava {
    options.release = project.property("compile.java.version").toString().toInt()
}

abstract class CommandExecutingTask : DefaultTask() {
    init {
        println("Executing command from task $name from workdir [./bin/] command [./$name.sh]")
    }

    @TaskAction
    fun exec() {
        var command = "./$name.sh"
        var process = ProcessBuilder(command)
            .directory(File("bin"))
            .redirectOutput(ProcessBuilder.Redirect.INHERIT)
            .redirectError(ProcessBuilder.Redirect.INHERIT)
            .start()
        var result = String(process.inputStream.readAllBytes())
        var exit = process.waitFor()
        println("Command output:")
        println(result)
        println("Exit with $exit")
    }
}

tasks.register<CommandExecutingTask>("upgradeGradleWrapper")

tasks.register<CommandExecutingTask>("cleanGradleAndAnt")

tasks.register<CommandExecutingTask>("buildForTomcat") {
    dependsOn(":cleanGradleAndAnt")
}
