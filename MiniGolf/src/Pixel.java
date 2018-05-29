public class Pixel{
	private short r, g, b, a;
	public Pixel(int r, int g, int b, int a){
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}
	public Pixel(int p){
		r = p & 0xff;
		g = (p>>8) & 0xff;
		b = (p>>16) & 0xff;
		a = (p>>24) & 0xff;
	}
	public int getR(){ return r; }
	public int getG(){ return g; }
	public int getB(){ return b; }
	public int getA(){ return a; }
}
