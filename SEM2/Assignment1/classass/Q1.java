package classass;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("Enter exactly one Integer");
		}else {
			int n=Integer.parseInt(args[0]);
			if(n<=2) {
				System.out.println("Enter an Integer greater than 2");
			}else {
				int count=0;
				while(n>2) {
					n/=2;
					count++;
				}
				System.out.println("The number of times one must repeatedly divide this number by 2 \r\n"
						+ "before getting a value less than 2 is: "+count);
			}
		}
	}

}
