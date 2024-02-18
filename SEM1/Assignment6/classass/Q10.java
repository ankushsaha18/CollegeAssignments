package classass;

public class Q10 {
	public static void main(String args[]) {
		System.out.println("Area of triangle:"+Area(2,3));
		System.out.println("Area of circle:"+Area(5));
		System.out.println("Area of rectangle:"+Area(3.7,9.6));
		System.out.println("Area of square:"+Area(3.3));
	}
	 public static double Area(int base, int height) {
	        return 0.5 * base * height;
	    }
	    public static double Area(double side) {
	        return side * side;
	    }
	    public static double Area(int radius) {
	        return Math.PI * radius * radius;
	    }
	    public static double Area(double length, double width) {
	        return length * width;
	    }
}
