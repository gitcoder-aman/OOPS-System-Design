package Classes.Behavioral_DesignPattern.ChainOfResopnsibility.example2;

public class DebugProcessor extends LogProcessor {

    DebugProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }
    @Override
    public void log(int loglevel, String message) {
        if (loglevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(loglevel, message); //tell to the parent you go to the next.
        }
    }
    
}
