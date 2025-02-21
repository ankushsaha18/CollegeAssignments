package Assignment1.Q4;

public class Image {
    private int imageHeight;
    private int imageWidth;
    private String colorCode;
    public Image(){
        this.imageHeight = 0;
        this.imageWidth = 0;
        this.colorCode = "#000000";
    }
    public Image(int imageHeight,int imageWidth,String colorCode){
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        this.colorCode = colorCode;
    }

    public int getImageHeight() {
        return imageHeight;
    }
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getColorCode() {
        return colorCode;
    }
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return "Image[Width: " + this.imageWidth + ",Height: " + this.imageHeight
                + ",colorCode: " + this.colorCode + "]";
    }

    public static void main(String[] args) {
        Image i1 = new Image();
        Image i2 = new Image(1920,1080,"#FFFFAA");
        i1.setImageHeight(1280);
        i1.setImageWidth(720);
        i1.setColorCode("#AAAABB");
        System.out.println("Image 1 Details ---");
        System.out.println(i1.toString());
        System.out.println("Image 2 Details ---");
        System.out.println(i2.toString());
    }
}
