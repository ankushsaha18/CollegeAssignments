package classasscmdl;

public class Q4 {

		// TODO Auto-generated method stub
		public static void main(String[] args) { 
			if(args.length!=1) {
				System.out.println("Invalid");
			}else {
				double t=Double.parseDouble(args[0]);
				double sum=Math.cos(5*t)+Math.sin(7*t);
				
	        System.out.println(sum);
	    }
	}
}


