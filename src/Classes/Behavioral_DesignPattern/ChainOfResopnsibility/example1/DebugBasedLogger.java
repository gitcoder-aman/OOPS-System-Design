package Classes.Behavioral_DesignPattern.ChainOfResopnsibility.example1;

public class DebugBasedLogger extends Logger {

    public DebugBasedLogger(int levels){
        this.levels = levels;
    }
    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("DEBUG LOGGER INFO : "+msg);
    }
}
