package homecmdl;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("Invalid");
		}else if(args[0].length()<4){
			System.out.println("Enter four digit number");
		}else {
			int num=Integer.parseInt(args[0]);
			int last=num%10;
			int first=num/1000;
			int sum=first+last;
			System.out.println("Sum of first and last digit is:"+sum);
    }
	}

}
