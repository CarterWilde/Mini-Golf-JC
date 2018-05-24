public class Tile extends CollisionObj {
  public Tile(int x, int y, String p){
    setImage(p);
    setBounds(x, y);
  }
  public void move(){}
}
