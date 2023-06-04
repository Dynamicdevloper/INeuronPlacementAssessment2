package in.ineuron;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FastScanner fs=new FastScanner();
		int n=fs.nextInt();
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		
		int ans =maximizedSum(arr, n);
		System.out.println(ans);
		
	}

	private static int maximizedSum(int[] arr, int n) {
		
		Arrays.sort(arr);
		int ans=0;
		for(int i=0; i<n; i+=2) {
			ans+=arr[i];
		}
		return ans;
	}

}
