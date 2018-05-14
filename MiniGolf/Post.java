 

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

class Post extends JComponent{
  private JLabel[] cols;
  public Post(String str1, String str2, String str3){
    setBounds(0, 0, 150, 50);
    this.setBackground(Color.blue);
    cols = new JLabel[]{
      new JLabel(str1, (int)CENTER_ALIGNMENT),
      new JLabel(str2, (int)CENTER_ALIGNMENT),
      new JLabel(str3, (int)CENTER_ALIGNMENT),
    };
    for (int i = 0; i < cols.length; i++) {
      cols[i].setBounds(i * 100, 0, 100, 50);
      add(cols[i]);
    }
  }
  public void setPost(String str1, String str2, String str3){
    cols[0].setText(str1);
    cols[1].setText(str2);
    cols[2].setText(str3);
  }

  public String[] getPost(){
    String[] returnArray = new String[3];
    for (int i = 0; i < returnArray.length; i++) {
      returnArray[i] = cols[i].getText();
    }
    return returnArray;
  }
}
