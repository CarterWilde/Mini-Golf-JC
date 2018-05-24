package src;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Scoreboard extends JComponent{
    private boolean isScoreBoardVisible;
    private ArrayList<Post> posts;

    public Scoreboard(JFrame win, boolean sb){
        isScoreBoardVisible = sb;
        Rectangle borderLine = new Rectangle(295,0,5,700);
        Rectangle borderLineTwo = new Rectangle(0,0,300,5);
        posts = new ArrayList<Post>();
        setBounds(0,50,300,700);
        add(borderLine);
        add(borderLineTwo);
        isVisible();
    }

    public void reDisplayPosts(JComponent win){
        for (int i = 0; i < posts.size(); i++) {
            Post tmp = posts.get(i);
            tmp.setBounds(0, i * 50, 300, 50);
            posts.set(i, tmp);
            win.add(posts.get(i));
        }
    }

    public void setScoreBoardVisible(boolean b){
        isScoreBoardVisible = b;
    }

    public boolean getScoreBoardVisible(){
        return isScoreBoardVisible;
    }

    public void setPost(Post p, int i){
        posts.set(i, p);
    }

    public void addPost(Post p){
        posts.add(p);
    }

    public void getPost(int i){
        posts.get(i);
    }

    public static void main(String[] args) {
        JFrame main = new JFrame();
        main.setBounds(0,0,1000,700);
        main.setVisible(true);
        Scoreboard sb = new Scoreboard(main, true);
        main.add(sb);
    }
}
