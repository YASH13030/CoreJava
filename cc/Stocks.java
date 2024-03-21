package cc;

public class Stocks {
	
	public static void pricep(int a[],int n) {
	
		int s=0;
		for(int i =0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				s=a[i]-a[j];
				
			}
		}
}
}
