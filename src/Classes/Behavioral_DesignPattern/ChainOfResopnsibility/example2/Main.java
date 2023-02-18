package Classes.Behavioral_DesignPattern.ChainOfResopnsibility.example2;

//client
public class Main {
    
    public static void main(String[] args) {
        //chaining

        LogProcessor logObject = new InfoLogProcessor(new DebugProcessor(new ErrorLogProcessor(null)));

        // LogProcessor logErrorObject = new ErrorLogProcessor(null);

        // LogProcessor logInfoObject = new InfoLogProcessor(logErrorObject);

        // LogProcessor logDebugObject = new DebugProcessor(logInfoObject);

        logObject.log(LogProcessor.INFO, "just for info.");
        logObject.log(LogProcessor.DEBUG, "need to debug this.");
        logObject.log(LogProcessor.ERROR, "Exception happens.");

    }
}
