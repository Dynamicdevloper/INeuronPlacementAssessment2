package in.ineuron;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		
		FastScanner fs=new FastScanner();
		int n=fs.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		
		int ans=maxProduct(arr,n);
		System.out.println(ans);
	}

	private static int maxProduct(int[] arr,int n) {
		
		Arrays.sort(arr);
		int p1= arr[n-1]*arr[n-2]*arr[n-3];
		int p2=arr[0]*arr[1]*arr[n-1];
		
		int max=Math.max(p1, p2);
		return max;
	}

}
