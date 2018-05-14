import javax.swing.JComponent;
public class DisplayObject extends JComponent{
    private boolean isRendered;
    public DisplayObject(){
        
    }
    
    public boolean checkIsValid(){
        return isRendered;
    }
}
