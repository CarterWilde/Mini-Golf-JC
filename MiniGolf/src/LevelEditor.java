package src;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;

public class LevelEditor extends JComponent {
  private static final long serialVersionUID = 42l;
  BufferedImage img;
  ArrayList<JComponent> items;
  public LevelEditor(String ip, JFrame win) {
    items = new ArrayList<JComponent>();
    try{
        img = ImageIO.read(new File(ip));
        loadLevel();
    }
    catch(IOException e){
        System.out.println(e);
    }
  }
  public Pixel getPixel(int x, int y){
      int p = img.getRGB(x,y);
      //get alpha
      int a = (p>>24) & 0xff;
      //get red
      int r = (p>>16) & 0xff;
      //get green
      int g = (p>>8) & 0xff;
      //get blue
      int b = p & 0xff;
      return new Pixel(a,r,g,b);
  }
  public void loadLevel(){
    for(int x = 0; x < img.getWidth(); x++){
      for(int y = 0; y < img.getHeight(); y++){
        //Grass
        if(getPixel(x,y).getG() == 255){
        }
      }
    }
    return map;
  }

  public boolean checkCollision(){
      return map.checkCollision();
  }
}
