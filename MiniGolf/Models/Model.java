package Models;

 

public interface Model{
    public void setStrings(String[] s);
    public void setInts(int[] i);
    public void setBool(boolean[] b);
    public void setList(Model[] m);
    public String[] getStrings();
    public int[] getInts();
    public boolean[] getBool();
    public Model[] getList();
}