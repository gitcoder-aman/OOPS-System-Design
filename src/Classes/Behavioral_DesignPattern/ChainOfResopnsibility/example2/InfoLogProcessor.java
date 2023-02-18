package Classes.Behavioral_DesignPattern.ChainOfResopnsibility.example2;

public class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int loglevel, String message) {
        if (loglevel == INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(loglevel, message); //tell to the parent you go to the next.
        }
    }

}
