package cc;

import java.util.Scanner;

public class Lecture1 {
	
	public static int SecondL(int a[],int n) {
	int l1=a[0];
	int l2=a[1];
	int temp;
	if(l1<l2) {
		temp = l1;
        l1 = l2;
        l2 = temp;
	}
	for(int i=0;i<n;i++) {
		if(l1<a[i]) {
			temp = l1;
            l1 = l2;
            l2 = temp;
		}
		else if(a[i]>l2) {
			l2=a[i];
		}
		
		}
	return l2;
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
		System.out.println("second largest element : "+SecondL(arr, n));
	}
	

}
