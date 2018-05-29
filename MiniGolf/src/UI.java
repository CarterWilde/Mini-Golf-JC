 

import javax.swing.*;
import java.awt.event.*;

public class UI extends JFrame{
  JButton close;
  Scoreboard scoreBoard;
  public UI(boolean sb){
    setBounds(0,0,1000,700);
    setVisible(true);
    setLayout(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Scoreboard
    if(sb){
      scoreBoard = new Scoreboard(this, sb);
      add(scoreBoard);
    }
    //Close Button
    close = new JButton("X");
    close.setBounds(0,0,45,45);
    close.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
      }
    });
    add(close,0);
  }
  public void addGameObject(JComponent jc){
    add(jc);
  }
  public Scoreboard getScoreBoard() {
    return scoreBoard;
  }
}
