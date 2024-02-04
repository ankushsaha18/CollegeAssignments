package classasscmdl;
public class Q1 {

	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("Invalid");
		}else {
		int div=Integer.parseInt(args[0]);
		int ddent=Integer.parseInt(args[1]);
		int Q=div/ddent;
		int R=div%ddent;
		System.out.println("Quotient is:"+Q);
		System.out.println("Remainder is:"+R);
		
	}

}
}
