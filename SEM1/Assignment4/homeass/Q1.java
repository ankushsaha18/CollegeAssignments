package homeass;
public class Q1 {

	public static void main(String[] args) {
		int num=10;
		int ssq=0;
		int sqs=0;
		for(int i=1;i<=num;i++) {
			ssq+=(int)Math.pow(i, 2);
			sqs+=i;
		}
		sqs=(int)Math.pow(sqs, 2);
		System.out.println("Sum of the squares is:"+ssq);
		System.out.println("Square of the sum is:"+sqs);
		System.out.println("Difference is: ("+ssq+" - "+sqs+")="+(sqs-ssq));
	}

}
