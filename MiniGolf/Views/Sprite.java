package Views;

import java.awt.*;

public abstract class Sprite extends EzImage {
    protected int dx, dy;//variables for speed, for x and y
    protected Rectangle rect;//the hitbox

    //constructor, takes in speed and filepath for the icon
    public Sprite(int deltax, int deltay, String fpath){
        super();
        this.changeImage(fpath);
        dx = deltax;
        dy = deltay;
        rect = new Rectangle();
    }

    //default constructor.  if used, all variables need to be added manually with setters
    public Sprite(){
        super();
        rect = new Rectangle();
    }

    //sets location
    public void setLocation(int x, int y)
    {
        super.setLocation(x,y);
        rect.setLocation(x,y);
    }

    //sets the speed
    public void setSpeed(int deltax, int deltay)
    {
        dx=deltax;
        dy=deltay;
    }

    //sets the image, takes in filepath string
    public void changeImage(String path){
        this.setImage(path);
    }

    //sets the size of the image, may need to be changed if you're changing the picture
    public void setSize(int w, int h){
        super.setSize(w,h);
        rect.setSize(w,h);
    }

    //moves the sprite, called every frame from the game
    public abstract void move();

    //gets the hitbox for collision
    public Rectangle getRect()
    {
        return rect;
    }

    //checks collision between two sprites (this sprite and the parameter sprite
    public boolean collides (Sprite s)
    {
        return rect.intersects(s.getRect());
    }
}
