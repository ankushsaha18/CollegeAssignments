package classasscmdl;

public class Q5 {

	public static void main(String[] args) {{ 
			if(args.length!=3) {
				System.out.println("Invalid");
			}else {
				int a=Integer.parseInt(args[0]);
				int b=Integer.parseInt(args[1]);
				int c=Integer.parseInt(args[2]);
				int temp=a+b+c;
				int max=Math.max(Math.max(a, b), c);
				int min=Math.min(Math.min(a, b), c);
				int mid=temp-(max+min);
				System.out.println(min+" "+mid+" "+max);
	    }
	}

	}
	}
