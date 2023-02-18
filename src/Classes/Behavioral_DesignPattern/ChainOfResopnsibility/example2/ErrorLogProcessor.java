package Classes.Behavioral_DesignPattern.ChainOfResopnsibility.example2;

public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }
    @Override
    public void log(int loglevel, String message) {
        if (loglevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(loglevel, message); //tell to the parent you go to the next.
        }
    }
    
}
