package homecmdl;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2) {
			System.out.println("Invalid");
		}else {
			double r=Double.parseDouble(args[0]);
			double h=Double.parseDouble(args[1]);
			double sa=(Math.PI*r*r)+(2*Math.PI*r*h);
			System.out.println("Surface area of the cylinder is:"+sa);
    }
	}

}
