package src;

import java.util.TimerTask;
import java.util.Timer;

import javax.swing.JComponent;

public class MiniGolf extends Game{
    public MiniGolf(boolean sb){
        super(sb);
    }

    public static void main(String[]args){
      MiniGolf mg = new MiniGolf(false);
      JComponent r = new Rectangle(300,100,25,100);
      Golfball gb = new Golfball(mg.getUI());
      mg.getUI().add(r);
      mg.getUI().add(gb);
      mg.getUI().addMouseListener(gb);
      Timer timer = new Timer();
      timer.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {
          gb.move();
          if(gb.collides(r)){
              gb.setDeltaY(gb.deltaY * -1);
              gb.setDeltaX(gb.deltaX * -1);
          }
        }
      }, 25, 25);
    }
}
