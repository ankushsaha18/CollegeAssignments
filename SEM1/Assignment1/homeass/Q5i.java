package homeass;

public class Q5i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=20;
		int G=30;
		int K=40;
		int A=50;
		System.out.println("Initial values of W,G,K,A:"+W+" "+G+" "+K+" "+A);
		int temp=W;
		W=G;
		G=K;
		K=A;
		A=temp;
		System.out.println("Final values of W,G,K,A:"+W+" "+G+" "+K+" "+A);
		
		
	}

}
