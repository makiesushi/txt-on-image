import java.io.File;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Write {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\user\\Desktop\\image.jpg");
            BufferedImage img = ImageIO.read(file);
            Graphics g = img.getGraphics();
            g.setFont(g.getFont().deriveFont(25f));
            g.drawString("Marko", 500, 400);
            g.dispose();
            ImageIO.write(img, "jpg", new File("C:\\Users\\user\\Desktop\\img2.jpg"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
