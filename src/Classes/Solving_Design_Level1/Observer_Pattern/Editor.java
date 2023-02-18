package Classes.Solving_Design_Level1.Observer_Pattern;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor(){
        this.events = new EventManager("open","save");
    }

    public void openFile(String fileName){
        this.file = new File(fileName);
        events.notify("open",file);
    }

    public void saveFile() throws Exception{
        if(this.file != null){
            events.notify("save",file);
        }else{
            throw new Exception("Please Open a file first.");
        }
    }
    
}
