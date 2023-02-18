package Classes.Behavioral_DesignPattern.ChainOfResopnsibility.example1;

public class Main {

    public static Logger doChaining(){

        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUT_INFO);

        Logger errorLogger = new ErrorBasedLogger(Logger.ERROR_INFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUG_INFO);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }
    public static void main(String[] args) {
        Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.OUTPUT_INFO,"Enter the sequence of the value.");
        System.out.println();
        chainLogger.logMessage(Logger.ERROR_INFO, "An Error is Occured Now.");
        System.out.println();
        chainLogger.logMessage(Logger.DEBUG_INFO, "This was the error now debuging is completed.");
        System.out.println();
    }
}
