package in.ineuron;

public class Question7 {

	public static void main(String[] args) {
		FastScanner fs= new FastScanner();
		int n=fs.nextInt();
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		
		boolean output= checkMonotonic(arr, n);
		System.out.println(output);
	}

	private static boolean checkMonotonic(int[] arr, int n) {
		
		boolean isDecreasing=true;
		boolean isIncreasing=true;
		
		
		for(int i=1; i<n; i++) {
			if(arr[i]<arr[i-1]) {
				isIncreasing=false;
			}else if(arr[i]>arr[i-1]) {
				isDecreasing=false;
			}
			
			if(!isDecreasing && !isIncreasing) return false;
		}
		return true;
	}

}
