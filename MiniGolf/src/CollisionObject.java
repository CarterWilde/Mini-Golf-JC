package src;

import javax.swing.JComponent;
public abstract class CollisionObject extends Sprite
{
    int thistop, thisbottom, thisleft, thisright;
    int top, bottom, left, right;
    public CollisionObject(){

    }

    public abstract void move();

    public boolean collides (JComponent co){
        thistop = getY();
        thisbottom = getY() + getHeight();
        thisleft = getX();
        thisright = getX() + getWidth();
        top = co.getY();
        bottom = co.getY() + co.getHeight();
        left = co.getX();
        right = co.getX() + co.getWidth();
        if(thisleft<right&&thisleft>left&&thisbottom>top&&thisbottom<bottom){
            return true;
        }
        if(thisright>left&&thisright<right&&thisbottom>top&&thisbottom<bottom){
            return true;
        }
        if(thisleft<right&&thisleft>left&&thistop<bottom&&thistop>top){
            return true;
        }
        if(thisright>left&&thisright<right&&thistop<bottom&&thistop>top){
            return true;
        }
        return false;
    }
}
