package classass;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the Array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=findMax(arr);
		int min=findMin(arr);
		System.out.println("Maximum element of Array is " + max + " and occurs " + countOccurence(arr,max) + " times");
		System.out.println("Minimum element of Array is " + min + " and occurs " + countOccurence(arr,min) + " times");
		System.out.println("First occurrence of maximum element is at position " + firstPosition(arr,max));
		System.out.println("Last occurrence of minimum element is at position " + lastPosition(arr,min));
	}
	static int findMax(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	static int findMin(int arr[]) {
		int min=Integer.MAX_VALUE;
		for(int i:arr) {
			if(i<min) {
				min=i;
			}
		}
		return min;
	}
	static int countOccurence(int arr[],int n) {
		int ans=0;
		for(int i: arr) {
			if(i==n) {
				ans++;
			}
		}
		return ans;
	}
	static int firstPosition(int arr[],int n) {
		for(int i=0;i< arr.length;i++) {
			if(arr[i]==n) {
				return i+1;
			}
		}
		return -1;
	}
	static int lastPosition(int arr[],int n) {
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==n) {
				return i+1;
			}
		}
		return -1;
	}

}
