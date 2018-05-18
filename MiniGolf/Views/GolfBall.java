package Views;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class GolfBall extends JPanel implements MouseListener, MouseMotionListener {
  /*
   * We need to make sure we have entered the area of the ball and then figure
   * use that
   */
  private boolean hasEntered;
  private boolean mouseDown;

  private double power;
  private double powerRatio;
  
  private int deltaX, deltaY;

  public GolfBall() {
    hasEntered = false;
    setSize(50, 50);
    setLocation(125, 125);
    setBackground(Color.GREEN);
    setVisible(true);
    power = 0D;
    powerRatio = 4D;
    deltaX = 0;
    deltaY = 0;
  }

  //MouseMotionListener
  public void mouseMoved(MouseEvent e) {
    power = calcPower(e.getX(), e.getY());
    deltaX = (int)calcDeltaX(e.getX(), (getX()));
    deltaY = (int)calcDeltaY(e.getY(), (getY()));
    System.out.println("Power:" + power + "\t\tdeltaX:" + deltaX + "\tdeltaY:" + deltaY);
  }
  
  double calcPower(int X2, int Y2){
    /*
     * Power is calculated with the distance formula(aka Pythagorean Theorem)
     * The formula is power = sqrt((x2 - x1)^2 + (y1 - y2)^2)
     */
    double output = Math.sqrt(
            Math.pow((getX()/2) - X2, 2) +
            Math.pow((getY()/2) - Y2, 2))
            /*^ Distance | Power Ratio ->*/ / powerRatio;
    return output;
  }
  
  double calcHyp(){
      return power * powerRatio;
  }
  
  double calcDeltaY(double X1, double X2){
      return X1 - X2;
  }
  
  double calcDeltaX(double Y1, double Y2){
      return Y1 - Y2;
  }
  
  //Should we use this to calculate power?
  public void mouseDragged(MouseEvent e) {}

  //MouseListener
  public void mouseClicked(MouseEvent e) {}

  public void mouseReleased(MouseEvent e) {
    mouseDown = false;
    System.out.println("Hello Mouse Released");
  }

  public void mousePressed(MouseEvent e) {
    mouseDown = true;
    System.out.println("Mouse Pressed");
  }

  public void mouseEntered(MouseEvent e) {
    hasEntered = true;
    System.out.println("Mouse Entered");
  }

  public void mouseExited(MouseEvent e) {
    hasEntered = false;
    System.out.println("Mouse Exited");
  }
  
  public void move(){
  }
  
  public static void main(String[] args) {
    UI win = new UI(true);
    win.setVisible(true);
    win.setBounds(0, 0, 500, 500);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GolfBall ball = new GolfBall();
    win.addMouseListener(ball);
    win.addMouseMotionListener(ball);
    win.add(ball);
    win.repaint();
  }
}
