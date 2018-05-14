public class CollisionObject extends DisplayObject{
    int thistop, thisbottom, thisright, thisleft;
    public CollisionObject(){
        thistop = getY();
        thisbottom = getY() + getHeight();
        thisleft = getX();
        thisright = getX() + getWidth();
    }
    
    public boolean collides(int top, int bottom, int left, int right){
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
