package cc;

import java.util.Scanner;

public class ArrayFunctions {
	
	public static int SecondLargest(int n , int a[]) {
		
		 for (int i = 0; i < n; i++) {
			 for (int j = i + 1; j < n; j++) {
	            	int temp = 0;
	                if (a[j] < a[i]) {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
		
		}
		 return a[n-2];	

   }
	
	public static int SecondLarWithoutSort(int n , int a[]) {
		
		int l1 = a[0];
		int l2 = a[1];
		int temp =0;
		if(l1<l2) {
			temp = l1;
            l1 = l2;
            l2 = temp;
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]>l1) {
				l2=l1;
				l1=a[i];
			}
			else if(a[i]>l2) {
				l2=a[i];
			}
		}
		return l2;
		
	}
	
	public static void OddElements(int n , int a[]) {
		System.out.println("odd elements.");
		for (int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static void reverse(int n, int a[]) {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array.");
		int n = sc.nextInt();
		int x[] = new int[n];
		System.out.println("enter array: ");
		for (int i = 0; i < n; i++) {
			x[i]= sc.nextInt();
		}
		System.out.println(SecondLargest(n, x));
		System.out.println(SecondLarWithoutSort(n, x));
		OddElements(n, x);
	}
}
