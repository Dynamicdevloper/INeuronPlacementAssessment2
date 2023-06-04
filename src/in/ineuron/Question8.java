package in.ineuron;

public class Question8 {

	public static void main(String[] args) {
		
		FastScanner fs= new FastScanner();
		int n=fs.nextInt();
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		
		int ans= minimumScore(arr, n);
		System.out.println(ans);
	}

	public static int minimumScore(int[] nums, int k) {
       
		int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        
        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }
        
        if (maxNum - minNum <= 2 * k) {
            return 0;
        } else {
            int newMin = minNum + k;
            int newMax = maxNum - k;
            return newMax - newMin;
        }
    }
    
}
