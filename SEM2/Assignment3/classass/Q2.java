package classass;

public class Q2 {
    public static void main(String[] args) {
        String[] colors = {"Red","Blue","Green"};
        try{
            colors[3] = "white";
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        try{
            int a = Integer.parseInt(colors[0]);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        try {
            colors = null;
            System.out.println(colors[0]);
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
