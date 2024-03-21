package cc;

import java.util.Scanner;

public class Lecture2 {
	
	public static int max_sum(int a[],int n) {
		
		int maxs =0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				
			}
		}
		return maxs;
	}
	
	
	
	public static int max_Sum3(int a[],int n) {
		//kadane's algorithm
		
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here =0;
		for(int i=0;i<n;i++) {
			max_ending_here = max_ending_here + a[i];
		if(max_so_far < max_ending_here)
			max_so_far = max_ending_here;
		if(max_ending_here<0)
			max_ending_here=0;
	}
		return max_so_far;
}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n =sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array elements.");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Maximum sum  : "+max_Sum3(arr,n));
		
	}
	
}
