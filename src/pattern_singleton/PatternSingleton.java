package pattern_singleton;

public class PatternSingleton {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());

        ProgramLogger.getProgramLogger().addLogInfo("1..");
        ProgramLogger.getProgramLogger().addLogInfo("2..");
        ProgramLogger.getProgramLogger().addLogInfo("3..");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}

class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logfile = "This is logfile.\n\n";
    public static synchronized ProgramLogger getProgramLogger() {
        if(programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }
    private ProgramLogger() {

    }

    public void addLogInfo(String logInfo) {
        logfile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logfile);
    }
}
