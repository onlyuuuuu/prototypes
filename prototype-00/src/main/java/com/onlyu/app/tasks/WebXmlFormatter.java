package com.onlyu.app.tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class WebXmlFormatter
{
    public static void main(String[] args)
    {
        System.out.println("web.xml is being reformatted for OCD people...");
        final String WEB_XML_ABSOLUTE_PATH = args[0];
        final File WEB_XML_FILE = new File(WEB_XML_ABSOLUTE_PATH);
        try (BufferedReader reader = Files.newBufferedReader(WEB_XML_FILE.toPath()))
        {
            StringBuffer buffer = new StringBuffer("");
            String line = "";
            while ((line = reader.readLine()) != null)
            {
                if (line.contains("<!-- JSPC servlet mappings start -->"))
                {
                    buffer.append("\n");
                    buffer.append("    " + line.trim() + "\n");
                }
                else if (line.contains("<!-- JSPC servlet mappings end -->") ||
                         line.contains("<welcome-file-list>"))
                    buffer.append("    " + line.trim() + "\n");
                else
                    buffer.append(line + "\n");
                System.out.println(line);
            }
            System.out.println("\nAfter formatting: \n\n" + buffer);
            FileWriter writer = new FileWriter(WEB_XML_FILE, StandardCharsets.UTF_8);
            writer.write(buffer.toString());
            writer.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
