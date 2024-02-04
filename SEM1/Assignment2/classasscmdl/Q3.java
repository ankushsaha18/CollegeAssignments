package classasscmdl;

import java.util.Random;

public class Q3 {
	public static void main(String[] args) { 
		if(args.length!=2) {
			System.out.println("Invalid");
		}else {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int random1, random2;
        Random rr=new Random();
        random1=(int)Math.random()*b;
        random2=rr.nextInt(a,b);
        int sum = random1 + random2;
        System.out.println("Random Number:" +(int)sum);
    }

}
}
