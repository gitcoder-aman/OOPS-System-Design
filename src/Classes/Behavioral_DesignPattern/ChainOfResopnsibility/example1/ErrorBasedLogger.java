package Classes.Behavioral_DesignPattern.ChainOfResopnsibility.example1;

public class ErrorBasedLogger extends Logger {

    public ErrorBasedLogger(int levels){
        this.levels = levels;
    }
    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("ERROR LOGGER INFO : "+msg);
    }
}
