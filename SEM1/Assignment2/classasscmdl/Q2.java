package classasscmdl;
public class Q2 {
	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("Invalid");
		}else if(Integer.parseInt(args[0])<0 || Integer.parseInt(args[1])<0){
		System.out.println("Please Enter Positive numbers!!");}else {
		int num=Integer.parseInt(args[0]);
		int pow=Integer.parseInt(args[1]);
		int res=1;
		for(int i=1;i<=pow;i++) {
			res*=num;
		}
		System.out.println(num+" raised to the power "+pow+" is:"+res);
		
	}

}
}
