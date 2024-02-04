package classasscmdl;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=3) {
			System.out.println("Invalid");
		}else {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			if(a<0 || b<0 || c<0) {
				System.out.println("Enter positive Integers");
			}else {
				boolean bol;
				int p1=a*b;
				int p2=b*c;
				int p3=c*a;
				if(c<=p1 && b<=p3 && a<=p2) {
					bol=true;
				}else {
					bol=false;
				}
				System.out.println(bol);
			}
		}
	}

}
