package Assignment1.Q5;
import Assignment1.Q4.Image;

public class ImageController {
    public static void main(String[] args) {
        ImageLibrary il = new ImageLibrary(5);
        il.insertImage(new Image(1920,1080,"#FFFFFF"));
        il.insertImage(new Image(1280,720,"#AABBCC"));
        il.insertImage(new Image());
        System.out.println("Searching image with color code #000000 ....");
        System.out.println(il.searchImage("#000000"));
        System.out.println("Getting image at index 1 ....");
        System.out.println(il.getImage(1));
    }
}
