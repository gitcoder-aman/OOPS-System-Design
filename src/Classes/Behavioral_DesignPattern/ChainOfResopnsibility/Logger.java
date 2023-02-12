package Classes.Behavioral_DesignPattern.ChainOfResopnsibility;

public abstract class Logger {
    public static int OUTPUT_INFO = 1;
    public static int ERROR_INFO = 2;
    public static int DEBUG_INFO = 3;

    protected int levels;
    protected Logger nextLevelLogger;
    
    public void setNextLevelLogger(Logger nextLevelLogger){
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String msg){
        if(this.levels <= levels){
            System.out.println("this level value is : "+this.levels);
            displayLogInfo(msg);
        }

        if(nextLevelLogger != null){
            nextLevelLogger.logMessage(levels, msg);
        }
    }

    protected abstract void displayLogInfo(String msg);

}
