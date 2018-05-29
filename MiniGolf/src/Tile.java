package src;

public class Tile extends CollisionObj {
  public Tile(int x, int y, int w, int h, String p){
    setImage(p);
    setBounds(x, y, w, h);
  }
  public void move(){}
}