/*
 * Copyright (c) 2001, 2023, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

/*
 * This source code is provided to illustrate the usage of a given feature
 * or technique and has been deliberately simplified. Additional steps
 * required for a production-quality application, such as security checks,
 * input validation and proper error handling, might not be present in
 * this sample code.
 */


package com.sun.tools.example.debug.tty;

/**
 * <p> This class represents the <code>ResourceBundle</code>
 * for the following package(s):
 *
 * <ol>
 * <li> com.sun.tools.example.debug.tty
 * </ol>
 *
 */
public class TTYResources_de extends java.util.ListResourceBundle {


    /**
     * Returns the contents of this <code>ResourceBundle</code>.
     *
     * <p>
     *
     * @return the contents of this <code>ResourceBundle</code>.
     */
    @Override
    public Object[][] getContents() {
        Object[][] temp = new Object[][] {
        // NOTE: The value strings in this file containing "{0}" are
        //       processed by the java.text.MessageFormat class.  Any
        //       single quotes appearing in these strings need to be
        //       doubled up.
        //
        // LOCALIZE THIS
        {"** classes list **", "** Klassenliste **\n{0}"},
        {"** fields list **", "** Feldliste **\n{0}"},
        {"** methods list **", "** Methodenliste **\n{0}"},
        {"*** Reading commands from", "*** Befehle aus {0} werden gelesen"},
        {"All threads resumed.", "Alle Threads fortgesetzt."},
        {"All threads suspended.", "Alle Threads unterbrochen."},
        {"Argument is not defined for connector:", "Argument {0} ist f\u00FCr Connector {1} nicht definiert"},
        {"Arguments match no method", "Argumente entsprechen keiner Methode"},
        {"Array:", "Array: {0}"},
        {"Array element is not a method", "Arrayelement ist keine Methode"},
        {"Array index must be a integer type", "Arrayindex muss eine Ganzzahl sein"},
        {"base directory:", "Basisverzeichnis: {0}"},
        {"Breakpoint hit:", "Breakpoint erreicht: "},
        {"breakpoint", "Breakpoint {0}"},
        {"Breakpoints set:", "Breakpoints festgelegt:"},
        {"Breakpoints can be located only in classes.", "Breakpoints k\u00F6nnen sich nur in Klassen befinden. {0} ist eine Schnittstelle oder ein Array."},
        {"Can only trace", "Kann nur \"methods\" oder \"method exit\" oder \"method exits\" tracen"},
        {"cannot redefine existing connection", "{0} kann keine vorhandene Verbindung neu definieren"},
        {"Cannot assign to a method invocation", "Zuweisung zu einem Methodenaufruf nicht m\u00F6glich"},
        {"Cannot specify command line with connector:", "Befehlszeile kann nicht mit Connector: {0} angegeben werden"},
        {"Cannot specify target vm arguments with connector:", "Ziel-VM-Argumente k\u00F6nnen nicht mit Connector {0} angegeben werden"},
        {"Class containing field must be specified.", "Klasse, die das Feld enth\u00E4lt, muss angegeben werden."},
        {"Class:", "Klasse: {0}"},
        {"Classic VM no longer supported.", "Klassische VM wird nicht mehr unterst\u00FCtzt."},
        {"classpath:", "Classpath: {0}"},
        {"colon mark", ":"},
        {"colon space", ": "},
        {"Command is not supported on the target VM", "Befehl \"{0}\" wird in der Ziel-VM nicht unterst\u00FCtzt"},
        {"Command is not supported on a read-only VM connection", "Befehl \"{0}\" wird bei einer schreibgesch\u00FCtzten VM-Verbindung nicht unterst\u00FCtzt"},
        {"Command not valid until the VM is started with the run command", "Befehl \"{0}\" ist erst g\u00FCltig, wenn die VM mit dem Befehl \"run\" gestartet wurde"},
        {"Condition must be boolean", "Bedingung muss ein boolescher Wert sein"},
        {"Connector and Transport name", "  Connector: {0}  Transport: {1}"},
        {"Connector argument nodefault", "    Argument: {0} (kein Standard)"},
        {"Connector argument default", "    Argument: {0} Standardwert: {1}"},
        {"Connector description", "    Beschreibung: {0}"},
        {"Connector required argument nodefault", "    Erforderliches Argument: {0} (kein Standard)"},
        {"Connector required argument default", "    Erforderliches Argument: {0} Standardwert: {1}"},
        {"Connectors available", "Verf\u00FCgbare Connectors:"},
        {"Constant is not a method", "Konstante ist keine Methode"},
        {"Could not open:", "\u00D6ffnen nicht m\u00F6glich: {0}"},
        {"Current method is native", "Aktuelle Methode ist nativ"},
        {"Current thread died. Execution continuing...", "Aktueller Thread {0} abgebrochen. Ausf\u00FChrung wird fortgesetzt..."},
        {"Current thread isnt suspended.", "Aktueller Thread ist nicht unterbrochen."},
        {"Current thread not set.", "Aktueller Thread nicht festgelegt."},
        {"dbgtrace flag value must be an integer:", "dbgtrace-Kennzeichenwert muss eine Ganzzahl sein: {0}"},
        {"dbgtrace command value must be an integer:", "dbgtrace-Befehlswert muss eine Ganzzahl sein: {0}"},
        {"Deferring.", "{0} wird verz\u00F6gert.\nWird nach Laden der Klasse festgelegt."},
        {"End of stack.", "Stackende."},
        {"EOF", "EOF"},
        {"Error popping frame", "Fehler bei Anzeige von Frame - {0}"},
        {"Error reading file", "Fehler beim Lesen von \"{0}\" - {1}"},
        {"Error redefining class to file", "Fehler beim Neudefinieren von {0} als {1} - {2}"},
        {"exceptionSpec all", "alle {0}"},
        {"exceptionSpec caught", "abgefangene {0}"},
        {"exceptionSpec uncaught", "nicht abgefangene {0}"},
        {"Exception in expression:", "Ausnahme in Ausdruck: {0}"},
        {"Exception occurred caught", "Ausnahme aufgetreten: {0} (abzufangen bei: {1})"},
        {"Exception occurred uncaught", "Ausnahme aufgetreten: {0} (nicht abgefangen)"},
        {"Exceptions caught:", "Break bei diesen Ausnahmen:"},
        {"Expected at, in, or an integer <thread_id>:", "\"at\", \"in\" oder ganzzahlige <thread_id> erwartet: {0}"},
        {"expr is null", "{0} = Null"},
        {"expr is value", "{0} = {1}"},
        {"expr is value <collected>", "  {0} = {1} <erfasst>"},
        {"Expression cannot be void", "Ausdruck darf nicht \"void\" sein"},
        {"Expression must evaluate to an object", "Auswertung des Ausdrucks muss ein Objekt ergeben"},
        {"extends:", "erweitert: {0}"},
        {"Extra tokens after breakpoint location", "Zus\u00E4tzliche Token nach Breakpoint-Ort"},
        {"Failed reading output", "Ausgabe des untergeordneten Java-Interpreters konnte nicht gelesen werden."},
        {"Fatal error", "Schwerwiegender Fehler:"},
        {"Field access encountered before after", "Feld ({0}) ist {1}, wird {2} sein: "},
        {"Field access encountered", "Feldzugriff ({0}) aufgetreten: "},
        {"Field to unwatch not specified", "Feld f\u00FCr Ende der \u00DCberwachung nicht angegeben."},
        {"Field to watch not specified", "Feld f\u00FCr \u00DCberwachung nicht angegeben."},
        {"GC Disabled for", "GC deaktiviert f\u00FCr {0}:"},
        {"GC Enabled for", "GC aktiviert f\u00FCr {0}:"},
        {"grouping begin character", "{"},
        {"grouping end character", "}"},
        {"Illegal Argument Exception", "Ausnahme wegen ung\u00FCltigen Arguments"},
        {"Illegal connector argument", "Ung\u00FCltiges Connector-Argument: {0}"},
        {"Illegal thread state", "Unzul\u00E4ssiger Threadstatus"},
        {"Illegal thread state (virtual thread not suspended)", "Unzul\u00E4ssiger Threadstatus (virtueller Thread nicht unterbrochen)"},
        {"implementor:", "Implementierer: {0}"},
        {"implements:", "implementiert: {0}"},
        {"Initializing progname", "{0} wird initialisiert..."},
        {"Input stream closed.", "Inputstream geschlossen."},
        {"Interface:", "Schnittstelle: {0}"},
        {"Internal debugger error.", "Interner Debuggerfehler."},
        {"Internal error: null ThreadInfo created", "Interner Fehler: Null-ThreadInfo erstellt"},
        {"Internal error; unable to set", "Interner Fehler: {0} konnte nicht festgelegt werden"},
        {"Internal exception during operation:", "Interne Ausnahme bei Vorgang:\n    {0}"},
        {"Internal exception:", "Interne Ausnahme:"},
        {"Invalid argument type name", "Ung\u00FCltiger Argumenttypname"},
        {"Invalid assignment syntax", "Ung\u00FCltige Zuweisungssyntax"},
        {"Invalid command syntax", "Ung\u00FCltige Befehlssyntax"},
        {"Invalid connect type", "Ung\u00FCltiger Verbindungstyp"},
        {"Invalid consecutive invocations", "Ung\u00FCltige aufeinander folgende Aufrufe"},
        {"Invalid exception object", "Ung\u00FCltiges Ausnahmeobjekt"},
        {"Invalid line number specified", "Ung\u00FCltige Zeilennummer angegeben"},
        {"Invalid <method_name> specification:", "Ung\u00FCltige <method_name>-Spezifikation: {0}"},
        {"Invalid option on class command", "Ung\u00FCltige Option in Klassenbefehl"},
        {"invalid option", "Ung\u00FCltige Option: {0}"},
        {"Invalid thread status.", "Ung\u00FCltiger Threadstatus."},
        {"Invalid <thread_id>:", "<thread_id> ung\u00FCltig: {0}"},
        {"Invalid transport name:", "Ung\u00FCltiger Transportname: {0}"},
        {"Invalid <class>.<method_name> specification", "Ung\u00FCltige <class>.<method_name>-Spezifikation"},
        {"I/O exception occurred:", "I/O-Ausnahme aufgetreten: {0}"},
        {"is an ambiguous method name in", "\"{0}\" ist ein mehrdeutiger Methodenname in \"{1}\""},
        {"is an invalid line number for",  "{0,number,integer} ist eine ung\u00FCltige Zeilennummer f\u00FCr {1}"},
        {"is not a valid class name", "\"{0}\" ist kein g\u00FCltiger Klassenname."},
        {"is not a valid field name", "\"{0}\" ist kein g\u00FCltiger Feldname."},
        {"is not a valid id or class name", "\"{0}\" ist keine g\u00FCltige ID oder kein g\u00FCltiger Klassenname."},
        {"is not a valid line number or method name for", "\"{0}\" ist keine g\u00FCltige Zeilennummer oder kein g\u00FCltiger Methodenname f\u00FCr Klasse \"{1}\""},
        {"is not a valid method name", "\"{0}\" ist kein g\u00FCltiger Methodenname."},
        {"is not a valid thread id", "\"{0}\" ist keine g\u00FCltige Thread-ID."},
        {"is not a valid threadgroup name", "\"{0}\" ist kein g\u00FCltiger Threadgruppenname."},
        {"jdb prompt with no current thread", "> "},
        {"jdb prompt thread name and current stack frame", "{0}[{1,number,integer}] "},
        {"killed", "{0} abgebrochen"},
        {"killing thread:", "Thread wird abgebrochen: {0}"},
        {"Line number information not available for", "F\u00FCr diese Position sind keine Quellenzeilennummern verf\u00FCgbar."},
        {"line number", ":{0,number,integer}"},
        {"list field typename and name", "{0} {1}\n"},
        {"list field typename and name inherited", "{0} {1} (geerbt von {2})\n"},
        {"list field typename and name hidden", "{0} {1} (ausgeblendet)\n"},
        {"Listening at address:", "Listening-Adresse: {0}"},
        {"Local variable information not available.", "Keine lokalen Variableninformationen verf\u00FCgbar. Kompilieren Sie mit -g, um Variableninformationen zu generieren"},
        {"Local variables:", "Lokale Variablen:"},
        {"<location unavailable>", "<Ort nicht verf\u00FCgbar>"},
        {"location", "\"Thread={0}\", {1}"},
        {"locationString", "{0}.{1}(), Zeile={2,number,integer} BCI={3,number,integer}"},
        {"Main class and arguments must be specified", "Hauptklasse und Argumente m\u00FCssen angegeben werden"},
        {"Method arguments:", "Methodenargumente:"},
        {"Method entered:", "Methode gestartet: "},
        {"Method exited:",  "Methode beendet"},
        {"Method exitedValue:", "Methode beendet: R\u00FCckgabewert = {0}, "},
        {"Method is overloaded; specify arguments", "Methode {0} ist \u00FCberladen. Geben Sie Argumente an"},
        {"minus version", "Diese Version ist {0} {1,number,integer}.{2,number,integer} (Java SE Version {3})"},
        {"Missing at or in", "\"at\" oder \"in\" fehlt"},
        {"Monitor information for thread", "\u00DCberwachungsinformationen f\u00FCr Thread {0}:"},
        {"Monitor information for expr", "\u00DCberwachungsinformationen f\u00FCr {0} ({1}):"},
        {"More than one class named", "Mehrere Klassen mit dem Namen: \"{0}\""},
        {"native method", "native Methode"},
        {"nested:", "verschachtelt: {0}"},
        {"No attach address specified.", "Keine Anhangsadresse angegeben."},
        {"No breakpoints set.", "Keine Breakpoints festgelegt."},
        {"No class named", "Keine Klasse namens \"{0}\""},
        {"No class specified.", "Keine Klasse angegeben."},
        {"No classpath specified.", "Kein Classpath angegeben."},
        {"No code at line", "Kein Code bei Zeile {0,number,integer} in {1}"},
        {"No connect specification.", "Keine Verbindungsspezifikation."},
        {"No connector named:", "Kein Connector namens: {0}"},
        {"No current thread", "Kein aktueller Thread"},
        {"No default thread specified:", "Kein Standardthread angegeben: Verwenden Sie zun\u00E4chst den Befehl \"thread\"."},
        {"No exception object specified.", "Kein Ausnahmeobjekt angegeben."},
        {"No exceptions caught.", "Keine Ausnahmen abgefangen."},
        {"No expression specified.", "Kein Ausdruck angegeben."},
        {"No field in", "Kein Feld {0} in {1}"},
        {"No frames on the current call stack", "Keine Frames im aktuellen Aufrufstack"},
        {"No linenumber information for", "Keine Zeilennummerninformationen f\u00FCr {0}. F\u00FChren Sie die Kompilierung mit aktiviertem Debugging aus."},
        {"No local variables", "Keine lokalen Variablen"},
        {"No method in", "Keine Methode {0} in {1}"},
        {"No method specified.", "Keine Methode angegeben."},
        {"No monitor numbered:", "Kein Monitor mit Nummer: {0}"},
        {"No monitors owned", "  Keine Monitore im Eigentum"},
        {"No object specified.", "Kein Objekt angegeben."},
        {"No objects specified.", "Keine Objekte angegeben."},
        {"No save index specified.", "Kein Speicherindex angegeben."},
        {"No saved values", "Keine gespeicherten Werte"},
        {"No source information available for:", "Keine Quellinformationen f\u00FCr {0} verf\u00FCgbar"},
        {"No sourcedebugextension specified", "Keine SourceDebugExtension angegeben"},
        {"No sourcepath specified.", "Kein Quellpfad angegeben."},
        {"No thread specified.", "Kein Thread angegeben."},
        {"No VM connected", "Keine VM verbunden"},
        {"No waiters", "  Keine Waiter"},
        {"not a class", "{0} ist keine Klasse"},
        {"Not a monitor number:", "Keine Monitornummer: \"{0}\""},
        {"not found (try the full name)", "{0} nicht gefunden (verwenden Sie den vollst\u00E4ndigen Namen)"},
        {"Not found:", "Nicht gefunden: {0}"},
        {"not found", "{0} nicht gefunden"},
        {"Not owned", "  Nicht im Eigentum"},
        {"Not waiting for a monitor", "  Nicht auf einen Monitor wartend"},
        {"Nothing suspended.", "Nichts unterbrochen."},
        {"object description and id", "({0}){1}"},
        {"Operation is not supported on the current frame", "Vorgang wird im aktuellen Frame nicht unterst\u00FCtzt"},
        {"operation not yet supported", "Vorgang noch nicht unterst\u00FCtzt"},
        {"Owned by:", "  Eigent\u00FCmer: {0}, Anzahl Eintr\u00E4ge: {1,number,integer}"},
        {"Owned monitor:", "  Monitor im Eigentum: {0}"},
        {"Parse exception:", "Parseausnahme: {0}"},
        {"printclearcommandusage", "Verwendung: clear <class>:<line_number> oder\n      clear <class>.<method_name>[(argument_type,...)]"},
        {"printstopcommandusage",
         "Verwendung: stop [go|thread] [<thread_id>] <at|in> <Position>\n  Wenn \"go\" angegeben ist, wird der Thread nach dem Stoppen sofort fortgesetzt\n  Wenn \"thread\" angegeben ist, wird nur der Thread unterbrochen, in dem der Stopp ausgef\u00FChrt wird\n  Wenn weder \"go\" noch \"thread\" angegeben ist, werden alle Threads unterbrochen\n  Wenn eine ganzzahlige <thread_id> angegeben ist, wird nur der angegebene Thread gestoppt\n  \"at\" und \"in\" haben dieselbe Bedeutung\n  <Position> kann eine Zeilennummer oder eine Methode sein:\n    <class_id>:<line_number>\n    <class_id>.<Methode>[(argument_type,...)]"
        },
        {"Removed:", "Entfernt: {0}"},
        {"repeat is on", "Wiederholung ist aktiviert"},
        {"repeat is off", "Wiederholung ist deaktiviert"},
        {"repeat usage", "Verwendung: repeat <on|off>"},
        {"Requested stack frame is no longer active:", "Angeforderter Stackframe ist nicht mehr aktiv: {0,number,integer}"},
        {"run <args> command is valid only with launched VMs", "Der Befehl \"run <args>\" ist nur mit gestarteten VMs g\u00FCltig"},
        {"run", "{0} ausf\u00FChren"},
        {"saved", "{0} gespeichert"},
        {"Set deferred", "{0} mit Verz\u00F6gerung festlegen"},
        {"Set", "{0} festlegen"},
        {"Source file not found:", "Quelldatei nicht gefunden: {0}"},
        {"source line number and line", "{0,number,integer}    {1}"},
        {"source line number current line and line", "{0,number,integer} => {1}"},
        {"sourcedebugextension", "SourceDebugExtension -- {0}"},
        {"Specify class and method", "Klasse und Methode angeben"},
        {"Specify classes to redefine", "Klassen f\u00FCr Neudefinition angeben"},
        {"Specify file name for class", "Dateinamen f\u00FCr Klasse {0} angeben"},
        {"stack frame dump with pc", "  [{0,number,integer}] {1}.{2} ({3}), PC = {4}"},
        {"stack frame dump", "  [{0,number,integer}] {1}.{2} ({3})"},
        {"Step completed:", "Schritt abgeschlossen: "},
        {"Stopping due to deferred breakpoint errors.", "Stoppen aufgrund von verz\u00F6gerten Breakpoint-Fehlern.\n"},
        {"subclass:", "Unterklasse: {0}"},
        {"subinterface:", "Unterschnittstelle: {0}"},
        {"tab", "\t{0}"},
        {"Target VM failed to initialize.", "Ziel-VM konnte nicht initialisiert werden."},
        {"The application exited", "Anwendung beendet"},
        {"The application has been disconnected", "Die Anwendung wurde getrennt"},
        {"The gc command is no longer necessary.", "Der Befehl \"gc\" ist nicht mehr erforderlich.\nDie Garbage Collection wird wie gew\u00F6hnlich f\u00FCr alle Objekte durchgef\u00FChrt. Verwenden Sie die Befehle \"enablegc\" und \"disablegc\",\num die Garbage Collection einzelner Objekte zu steuern."},
        {"The load command is no longer supported.", "Der Befehl \"load\" wird nicht mehr unterst\u00FCtzt."},
        {"The memory command is no longer supported.", "Der Befehl \"memory\" wird nicht mehr unterst\u00FCtzt."},
        {"The VM does not use paths", "Die VM verwendet keine Pfade"},
        {"Thread is not running (no stack).", "Thread wird nicht ausgef\u00FChrt (kein Stack)."},
        {"Thread number not specified.", "Threadnummer nicht angegeben."},
        {"Thread:", "{0}:"},
        {"Thread Group:", "Gruppe {0}:"},
        {"Thread description name unknownStatus BP",  "  {0} {1} unbekannt (bei Breakpoint)"},
        {"Thread description name unknownStatus",     "  {0} {1} unbekannt"},
        {"Thread description name zombieStatus BP",   "  {0} {1} Zombie (bei Breakpoint)"},
        {"Thread description name zombieStatus",      "  {0} {1} Zombie"},
        {"Thread description name runningStatus BP",  "  {0} {1} wird ausgef\u00FChrt (bei Breakpoint)"},
        {"Thread description name runningStatus",     "  {0} {1} wird ausgef\u00FChrt"},
        {"Thread description name sleepingStatus BP", "  {0} {1} inaktiv (bei Breakpoint)"},
        {"Thread description name sleepingStatus",    "  {0} {1} inaktiv"},
        {"Thread description name waitingStatus BP",  "  {0} {1} wartet in einem Monitor (bei Breakpoint)"},
        {"Thread description name waitingStatus",     "  {0} {1} wartet in einem Monitor"},
        {"Thread description name condWaitstatus BP", "  {0} {1} wartet bedingt (bei Breakpoint)"},
        {"Thread description name condWaitstatus",    "  {0} {1} wartet bedingt"},
        {"Thread has been resumed", "Thread wurde wiederaufgenommen"},
        {"Thread not suspended", "Thread nicht unterbrochen"},
        {"thread group number description name", "{0,number,integer}. {1} {2}"},
        {"<thread_id> option not valid until the VM is started with the run command",
         "<thread_id>-Option ist erst g\u00FCltig, wenn die VM mit dem Befehl \"run\" gestartet wurde"},
        {"Threads must be suspended", "Threads m\u00FCssen unterbrochen sein"},
        {"trace method exit in effect for", "\"trace method exit\" in Kraft f\u00FCr {0}"},
        {"trace method exits in effect", "\"trace method exits\" in Kraft"},
        {"trace methods in effect", "\"trace methods\" in Kraft"},
        {"trace go method exit in effect for", "\"trace go method exit\" in Kraft f\u00FCr {0}"},
        {"trace go method exits in effect", "\"trace go method exits\" in Kraft"},
        {"trace go methods in effect", "\"trace go methods\" in Kraft"},
        {"trace not in effect", "\"trace\" nicht in Kraft"},
        {"Unable to attach to target VM.", "Anh\u00E4ngen an Ziel-VM nicht m\u00F6glich."},
        {"Unable to display process output:", "Prozessausgabe kann nicht angezeigt werden: {0}"},
        {"Unable to launch target VM.", "Ziel-VM kann nicht gestartet werden."},
        {"Unable to set deferred", "{0} mit Verz\u00F6gerung kann nicht festgelegt werden: {1}"},
        {"Unable to set main class and arguments", "Hauptklasse und Argument k\u00F6nnen nicht festgelegt werden"},
        {"Unable to set", "{0} kann nicht festgelegt werden: {1}"},
        {"Unexpected event type", "Unerwarteter Ereignistyp: {0}"},
        {"unknown", "unbekannt"},
        {"Unmonitoring", "\u00DCberwachung von {0} aufheben"},
        {"Unrecognized command.  Try help...", "Nicht erkannter Befehl: \"{0}\". Rufen Sie \"help\" auf..."},
        {"Usage: catch exception", "Verwendung: catch [uncaught|caught|all] <Klassen-ID>|<Klassenmuster>"},
        {"Usage: ignore exception", "Verwendung: ignore [uncaught|caught|all] <Klassen-ID>|<Klassenmuster>"},
        {"Usage: down [n frames]", "Verwendung: down [n frames]"},
        {"Usage: kill <thread id> <throwable>", "Verwendung: kill <Thread-ID> <Throwable>"},
        {"Usage: read <command-filename>", "Verwendung: read <Befehlsdateiname>"},
        {"Usage: unmonitor <monitor#>", "Verwendung: unmonitor <Monitornummer>"},
        {"Usage: up [n frames]", "Verwendung: up [n frames]"},
        {"Use java minus X to see", "Verwenden Sie \"java -X\", um die verf\u00FCgbaren nicht standardm\u00E4\u00DFigen Optionen anzuzeigen"},
        {"VM already running. use cont to continue after events.", "VM wird bereits ausgef\u00FChrt. Verwenden Sie \"cont\", um nach Ereignissen fortzufahren."},
        {"VM Started:", "VM gestartet: "},
        {"vmstartexception", "VM-Startausnahme: {0}"},
        {"Waiting for monitor:", "   Warten auf Monitor: {0}"},
        {"Waiting thread:", " Wartender Thread: {0}"},
        {"watch accesses of", "Zugriffe von {0}.{1} \u00FCberwachen"},
        {"watch modification of", "\u00C4nderung von {0}.{1} \u00FCberwachen"},
        {"zz help text",
             "** Befehlsliste **\nconnectors                -- Listet verf\u00FCgbare Connectors und Transporte in dieser VM auf\n\nrun [class [args]]        -- Startet die Ausf\u00FChrung der Hauptklasse der Anwendung\n\nthreads [threadgroup]     -- Listet Threads in der Threadgruppe auf. Verwendet die aktuelle Threadgruppe, wenn Sie keine Gruppe angeben.\nthread <Thread-ID>        -- Legt den Standardthread fest\nsuspend [thread id(s)]    -- Unterbricht Threads (Standard: all)\nresume [thread id(s)]    -- Nimmt Threads wieder auf (Standard: all)\nwhere [<Thread-ID> | all] -- Gibt den Stack eines Threads aus\nwherei [<Thread-ID> | all] -- Gibt den Stack eines Threads mit PC-Informationen aus\nup [n frames]             -- Verschiebt den Stack eines Threads nach oben\ndown [n frames]             -- Verschiebt den Stack eines Threads nach unten\nkill <Thread-ID> <Ausdruck>   -- Bricht einen Thread mit dem angegebenen Ausnahmeobjekt ab\ninterrupt <Thread-ID>     -- Unterbricht einen Thread\n\nprint <Ausdruck>              -- Gibt den Wert eines Ausdrucks aus\ndump <Ausdruck>               -- Gibt alle Objektinformationen aus\neval <Ausdruck>               -- Bewertet einen Ausdruck (wie \"print\")\nset <lvalue> = <Ausdruck>     -- Weist einem Feld/einer Variablen/einem Arrayelement einen neuen Wert zu\nlocals                    -- Gibt alle lokalen Variablen im aktuellen Stackframe aus\n\nclasses                   -- Listet derzeit bekannte Klassen auf\nclass <Klassen-ID>          -- Zeigt Details einer benannten Klasse an\nmethods <Klassen-ID>        -- Listet die Methoden einer Klasse auf\nfields <Klassen-ID>        -- Listet die Felder einer Klasse auf\n\nthreadgroups              -- Listet Threadgruppen auf\nthreadgroup <name>        -- Setzt die aktuelle Threadgruppe auf <name>\nthreadgroup               -- Setzt die aktuelle Threadgruppe wieder auf die Threadgruppe der obersten Ebene zur\u00FCck\n\nstop [go|thread] [<thread_id>] <at|in> <Position>\n                          -- Legt einen Breakpoint fest\n                          -- Wenn Sie keine Optionen angeben, wird die aktuelle Breakpoint-Liste ausgegeben\n                          -- Wenn Sie \"go\" angeben, wird der Vorgang nach dem Stoppen sofort wiederaufgenommen\n                          -- Wenn Sie \"thread\" angeben, wird nur der Thread unterbrochen, in dem gestoppt wurde\n                          -- Wenn Sie weder \"go\" noch \"thread\" angeben, werden alle Threads unterbrochen\n                          -- Wenn Sie eine ganzzahlige <thread_id> angeben, wird der Vorgang nur im angegebenen Thread gestoppt\n                          -- \"at\" und \"in\" haben die gleiche Bedeutung\n                          -- <Position> kann eine Zeilennummer oder eine Methode sein:\n                          --   <class_id>:<line_number>\n                          --   <class_id>.<Methode>[(argument_type,...)]\nclear <class id>.<Methode>[(argument_type,...)]\n                          -- L\u00F6scht einen Breakpoint in einer Methode\nclear <Klassen-ID>:<Zeile>   -- L\u00F6scht einen Breakpoint bei einer Zeile\nclear                     -- Listet Breakpoints auf\ncatch [uncaught|caught|all] <Klassen-ID>|<Klassenmuster>\n                          -- Break bei der angegebenen Ausnahme\nignore [uncaught|caught|all] <Klassen-ID>|<Klassenmuster>\n                          -- Bricht \"catch\" f\u00FCr die angegebene Ausnahme ab\nwatch [access|all] <Klassen-ID>.<Feldname>\n                          -- \u00DCberwacht Zugriffe/\u00C4nderungen eines Feldes\nunwatch [access|all] <Klassen-ID>.<Feldname>\n                          -- Hebt die \u00DCberwachung der Zugriffe/\u00C4nderungen eines Feldes auf\ntrace [go] methods [thread]\n                          -- Verfolgt Methodenstarts und -beendigungen.\n                          -- Alle Threads werden unterbrochen, es sei denn, \"go\" ist angegeben\ntrace [go] method exit | exits [thread]\n                          -- Verfolgt die Beendigung der aktuellen Methode oder die Beendigungen aller Methoden\n                          -- Alle Threads werden unterbrochen, es sei denn, \"go\" ist angegeben\nuntrace [methods]         -- Stoppt das Tracing von Methodenstarts und/oder -beendigungen\nstep                      -- F\u00FChrt die aktuelle Zeile aus\nstep up                   -- Ausf\u00FChren, bis die aktuelle Methode an den Aufrufer zur\u00FCckgegeben wird\nstepi                     -- F\u00FChrt die aktuelle Anweisung aus\nnext                      -- Eine Zeile weiter (Aufrufe auslassen)\ncont                      -- Setzt die Ausf\u00FChrung ab dem Breakpoint fort\n\nlist [line number|method] -- Gibt den Quellcode aus\nuse (or sourcepath) [source file path]\n                          -- Zeigt den Quellpfad an oder \u00E4ndert diesen\nexclude [<Klassenmuster>, ... | \"none\"]\n                          -- Meldet keine Schritt- oder Methodenereignisse f\u00FCr angegebene Klassen\nclasspath                 -- Gibt Classpath-Informationen aus der Ziel-VM aus\n\nmonitor <Befehl>         -- F\u00FChrt bei jedem Programmstopp einen Befehl aus\nmonitor                   -- Listet Monitore auf\nunmonitor <Monitornummer>      -- L\u00F6scht einen Monitor\nread <Dateiname>           -- Liest eine Befehlsdatei und f\u00FChrt diese aus\n\nlock <Ausdruck>               -- Gibt Sperrinformationen f\u00FCr ein Objekt aus\nthreadlocks [thread id]   -- Gibt Sperrinformationen f\u00FCr einen Thread aus\n\npop                       -- Holt den Stack bis zum aktuellen Frame (einschlie\u00DFlich)\nreenter                   -- Wie \"pop\", aber der aktuelle Frame wird wieder eingegeben\nredefine <Klassen-ID> <Klassendateiname>\n                          -- Definiert den Code f\u00FCr eine Klasse neu\n\ndisablegc <Ausdruck>          -- Verhindert die Garbage Collection eines Objekts\nenablegc <Ausdruck>          -- L\u00E4sst die Garbage Collection eines Objekts zu\n\n!!                        -- Wiederholt den letzten Befehl\n<n> <Befehl>             -- Wiederholt einen Befehl n-mal\nrepeat                    -- Zeigt an, ob die Wiederholung durch leeren Befehl im GDB-Stil aktiviert ist\nrepeat <on|off>           -- Aktiviert/deaktiviert die Wiederholung im GDB-Stil\n# <Befehl>               -- Verwerfen (kein Vorgang)\nhelp (oder ?)               -- Listet Befehle auf\ndbgtrace [flag]           -- Identisch mit der Befehlszeilenoption \"dbgtrace\"\nversion                   -- Gibt Versionsinformationen aus\nexit (oder quit)            -- Beendet den Debugger\n\n<Klassen-ID>: Ein vollst\u00E4ndiger Klassenname mit Package-Qualifiers\n<Klassenmuster>: Ein Klassenname mit einem Platzhalter am Anfang oder Ende (\"*\")\n<Thread-ID>: Threadnummer aus dem Befehl \"threads\"\n<Ausdruck>: Ein Ausdruck der Java(TM)-Programmiersprache.\nDer Gro\u00DFteil der g\u00E4ngigen Syntax wird unterst\u00FCtzt.\n\nStartbefehle k\u00F6nnen in \"jdb.ini\" oder \".jdbrc\" abgelegt werden\nin user.home oder user.dir"},
        {"zz usage text",
             "Verwendung: {0} <Optionen> <Klasse> <Argumente>\n\nVerf\u00FCgbare Optionen:\n    -? -h --help -help Gibt diese Hilfemeldung aus und beendet den Vorgang\n    -sourcepath <durch \"{1}\" getrennte Verzeichnisse>\n                      Verzeichnisse, in denen nach Quelldateien gesucht werden soll\n    -attach <Adresse>\n                      Anh\u00E4ngen an aktive VM unter der angegebenen Adresse mit Standard-Connector\n    -listen <Adresse>\n                      Wartet auf Verbindung einer aktiven VM unter der angegebenen Adresse mit Standard-Connector\n    -listenany\n                      Wartet auf Verbindung einer aktiven VM unter einer beliebigen verf\u00FCgbaren Adresse mit Standard-Connector\n    -launch\n                      Startet die VM sofort, anstatt auf den Befehl \"run\" zu warten\n    -listconnectors   Listet die in dieser VM verf\u00FCgbaren Connectors auf\n    -connect <connector-name>:<name1>=<value1>,...\n                      Stellt die Verbindung zur Ziel-VM mit dem benannten Connector und den aufgelisteten Argumentwerten her\n    -dbgtrace [flags] Gibt Informationen zum Debugging von {0} aus\n    -trackallthreads  Verfolgt alle Threads, einschlie\u00DFlich virtueller Threads.\n    -tclient          F\u00FChrt die Anwendung im HotSpot(TM) Client Compiler aus\n    -tserver          F\u00FChrt die Anwendung im HotSpot(TM) Server Compiler aus\n     -R<Option>        Leitet <Option> an den zu debuggenden Prozess weiter, wenn von JDB gestartet. Wird andernfalls ignoriert.\n\nOptionen, die an den zu debuggenden Prozess weitergeleitet werden, wenn von JDB gestartet (K\u00FCrzel anstelle von -R):\n    -v -verbose[:class|gc|jni]\n                      Aktiviert den Verbose-Modus\n    -D<Name>=<Wert>  Legt eine Systemeigenschaft fest\n    -classpath <durch \"{1}\" getrennte Verzeichnisse>\n                      Listet Verzeichnisse auf, in denen nach Klassen gesucht werden soll\n    -X<Option>        Nicht standardm\u00E4\u00DFige Ziel-VM-Option\n\n<Klasse> ist der Name der Klasse zum Start des Debuggings\n<Argumente> sind die Argumente, die an die main()-Methode der <Klasse> \u00FCbergeben werden\n\nGeben Sie \"help\" beim {0}-Prompt ein, um Befehlshilfe anzuzeigen"},
        // END OF MATERIAL TO LOCALIZE
        };

        return temp;
    }
}
