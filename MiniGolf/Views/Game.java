package Views;

import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Component;
import Views.*;
import Models.*;
public class Game extends FileManager{
    protected UI ui;
    public Game(boolean sb){
        ui = new UI(sb);
    }
    
    public UI getUI(){
        return ui;
    }
}
