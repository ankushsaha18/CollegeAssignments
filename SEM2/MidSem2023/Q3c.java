public class Q3c {
    public static void main(String[] args) {
        String[] Animals = {"Lion","Tiger","Elephant","Rhino"};
        try{
            Animals[4] = "Giraffe";
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        try{
            int a = Integer.parseInt(Animals[0]);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        try {
            Animals = null;
            System.out.println(Animals[0]);
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
