import java.io.File;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Write {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\user\\Desktop\\image.jpg"); //makes a variable with the path to the image
            BufferedImage img = ImageIO.read(file); //makes the image from the path into a variable
            Graphics g = img.getGraphics(); //gets the graphics from the image
            g.setFont(g.getFont().deriveFont(25f)); //sets the font that will be written on top of the image
            g.drawString("Marko", 500, 400); //writes the text at x=500 y=400
            g.dispose(); //when you know that you will not use the graphics again you can call this method (sorta like "in.close()" for Scanner)
            ImageIO.write(img, "jpg", new File("C:\\Users\\user\\Desktop\\img2.jpg")); //saves the new image as jpg to the path in new File()
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
