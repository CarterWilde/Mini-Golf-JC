import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class LevelEditor extends JComponent {
    BufferedImage img;
    World map;
    public LevelEditor(String ip) {
        try{
            img = ImageIO.read(new File(ip));
            map = new JFrame(img.getWidth(), img.getHeight());
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
    public World loadLevel(){
        for(int x = 0; x < img.getWidth(); x++){
            for(int y = 0; y < img.getHeight(); y++){
                //Stone
                if(getPixel(x,y).getB() == 255){
                    map.setGridPoint(x, y,"Stone.png","Stone");
                }
                //Dirt
                if(getPixel(x,y).getR() == 255 && getPixel(x,y).getB() == 255){
                    map.setGridPoint(x, y,"Dirt.png","Dirt");
                }
                //Grass
                if(getPixel(x,y).getG() == 255){
                    map.setGridPoint(x, y,"Grass.png","Grass");
                }
            }
        }
        return map;
    }
    
    public boolean checkCollision(){
        return map.checkCollision();
    }
    public static void main(String[] args) {
        LevelEditor image = new LevelEditor("World1.png");
        JFrame win = new JFrame("Test");
        win.add(image.loadLevel(),0);
        win.setVisible(true);
        win.setBounds(0,0,600,600);
    }
}
