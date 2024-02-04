package classass;

import java.util.*;
public class Q4{
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		Random rr=new Random();
		System.out.println("Enter use number:");
		int user =sc.nextInt();
		int com= rr.nextInt(1,9);
		System.out.println("Computer guesses:" +com);
		System.out.println("Your guess:" +user);
		if (com==user){
			System.out.println("You got it right");
		}else if (Math.abs(com-user)==1){
			System.out.println("Almost got it");
		}else{
			System.out.println("You got it wrong");
		}
	}
}