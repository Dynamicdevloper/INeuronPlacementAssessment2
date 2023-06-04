package in.ineuron;

import java.util.HashMap;
import java.util.Map;

public class Question3 {

	public static void main(String[] args) {
		
		FastScanner fs =new FastScanner();
		int n=fs.nextInt();
		
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		
		int ans=longestSequence(n, arr);
		System.out.println(ans);
	}

	private static int longestSequence(int n, int[] arr) {
		
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0; i<n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int maxLen=0;
		 for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            int num = entry.getKey();
	            int count = entry.getValue();
	            
	            if (map.containsKey(num + 1)) {
	                int subsequenceLen = count + map.get(num + 1);
	                maxLen = Math.max(maxLen, subsequenceLen);
	            }
	        }
	        
		return maxLen;
	}

}
