package homecmdl;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=3) {
			System.out.println("Invalid");
		}else {
			int P=Integer.parseInt(args[0]);
			int R=Integer.parseInt(args[1]);
			int T=Integer.parseInt(args[2]);
			System.out.println("Simple Interest is:"+(P*R*T/100));
    }
	}

}
