package homeass;

public class Q5ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=20;
		int G=30;
		int K=40;
		int A=50;
		System.out.println("Initial values of W,G,K,A:"+W+" "+G+" "+K+" "+A);
		W=W+G;
		G=W-G;
		W=W-G;
		G=G+K;
		K=G-K;
		G=G-K;
		K=K+A;
		A=K-A;
		K=K-A;
		System.out.println("Final values of W,G,K,A:"+W+" "+G+" "+K+" "+A);
		
		
	}

}
