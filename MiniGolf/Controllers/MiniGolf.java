package Controllers;

import Views.*;
public class MiniGolf extends Game{
    public MiniGolf(boolean sb){
        super(sb);
        Rectangle r = new Rectangle(300,100,25,100);
        ui.addGameObject(r);
    }
}