package src;

import java.util.TimerTask;
import java.util.Timer;

import javax.swing.JComponent;
import java.awt.event.WindowEvent;

public class MiniGolf extends Game{
    public MiniGolf(boolean sb){
        super(sb);
    }

    public static void main(String[]args){
        MiniGolf mg = new MiniGolf(false);
        mg.getUI().setBounds(0, 0, 1600, 1600);
        JComponent r1 = new Rectangle(75,70,1435,25);
        JComponent r2 = new Rectangle(75,70,25,1000);
        JComponent r3 = new Rectangle(1495,70,25,1000);
        JComponent r4 = new Rectangle(75,1065,1445,25);
        JComponent r5 = new Rectangle(300,75, 25, 700);
        JComponent r6 = new Rectangle(315,750, 700, 25);
        JComponent h = new EzImage(400, 400, 75, 75, "GolfBallHole.png");
        Golfball gb = new Golfball(100, 100, 50, 50,mg.getUI());
        mg.getUI().add(r1);
        mg.getUI().add(r2);
        mg.getUI().add(r3);
        mg.getUI().add(r4);
        mg.getUI().add(r5);
        mg.getUI().add(r6);
        mg.getUI().add(h);
        mg.getUI().add(gb);
        mg.getUI().addMouseListener(gb);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    gb.move();
                    if(gb.collides(r1) || gb.collides(r2) || gb.collides(r3) || gb.collides(r4) || gb.collides(r5) || gb.collides(r6)){
                        gb.setDeltaY(gb.deltaY * -1);
                        gb.setDeltaX(gb.deltaX * -1);
                    }
                    if(gb.collides(h)){
                        System.out.println("You win!!!");
                        mg.getUI().dispatchEvent(new WindowEvent(mg.getUI(), WindowEvent.WINDOW_CLOSING));
                    }
                }
            }, 25, 25);
    }
}
