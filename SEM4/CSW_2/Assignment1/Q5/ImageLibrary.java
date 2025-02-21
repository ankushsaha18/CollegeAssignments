package Assignment1.Q5;
import Assignment1.Q4.Image;

public class ImageLibrary {
    private Image[] images;
    private int size;
    public ImageLibrary(int capacity){
        this.images = new Image[capacity];
        this.size = 0;
    }

    public Image searchImage(String colorCode){
        for(int i = 0 ; i < size ; i++){
            if(images[i].getColorCode() == colorCode){
                System.out.println("Image found!!");
                return images[i];
            }
        }
        System.out.println("Image not found");
        return null;
    }

    public void insertImage(Image i){
        if(size >= images.length){
            System.out.println("Capacity full!!");
        }else{
            images[size++] = i;
            System.out.println("Image inserted successfully");
        }
    }

    public Image getImage(int index){
        if(index < 0 || index >= size){
            return null;
        }
        return images[index];
    }
}
