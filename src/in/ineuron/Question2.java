package in.ineuron;

import java.util.HashSet;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FastScanner fs=new FastScanner();
		int n=fs.nextInt();
		
		int[] arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		
		int ans=maximumCandies(arr, n);
		System.out.println(ans);
	}

	private static int maximumCandies(int[] arr, int n) {
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0; i<n; i++) {
			if(!hs.contains(arr[i]))
				hs.add(arr[i]);
		}
		
		
		return Math.min(hs.size(),n/2);
	}

}
