import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main{
public static void main(String []args){
  File imageFile = new File("C:\\Users\\kevli\\Downloads\\1a.jpg");
  BufferedImage bufferedImage = null;
  BufferedImage bufferedImage2 = null;
  try
      {
      bufferedImage = ImageIO.read(imageFile);
      BufferedImage image=bufferedImage.getSubimage(0,bufferedImage.getHeight()/2,600,600);
      File pathFile = new File("C:\\Users\\kevli\\Downloads\\imgg.png");
      ImageIO.write(image,"jpeg", pathFile);
    }
  catch (IOException e) 
      {
          System.out.println(e);
      }   
  try
  {
	  int i = 0;
	  bufferedImage2 = ImageIO.read(imageFile);
	  BufferedImage image=bufferedImage2.getSubimage(0,0,600,600);
	  String str = String.format("C:\\Users\\kevli\\Documents\\img%d.jpg", i);
	  File pathFile = new File(str);
	  ImageIO.write(image,"jpeg", pathFile);
	  i++;
}
catch (IOException e) 
  {
      System.out.println(e);
  }    
  }
}