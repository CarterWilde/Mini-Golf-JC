package Views;

public class ImageEditor{
	private BufferedImage img;
	private File f;
	public ImageEditor(String s){
		//read image
		try{
		  f = new File(s);
		  img = ImageIO.read(f);
		}catch(IOException e){
		  System.out.println(e);
		}
		//get image width and height
		int width = img.getWidth();
		int height = img.getHeight();
	}
	
	private Pixel getPixelObject(int p){
		return new Pixel(p);
	}
}