package in.ineuron;

public class Question4 {

	public static void main(String[] args) {
		
		FastScanner fs= new FastScanner();
		int n=fs.nextInt();
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		
		int flowers= fs.nextInt();
		
		boolean ans= isPossible(n, arr, flowers);
		System.out.println(ans);
	}

	private static boolean isPossible(int n, int[] arr, int flowers) {
		
		
		for(int i=0; i<n; i++) {
			if(i==0 && arr[i]!= 0 && arr[i+1]==0) {
				flowers--;
				arr[i]=1;
			}else if(i!=0 && i!=n-1) {
				if(arr[i-1] ==0 && arr[i+1]==0) {
					flowers--;
					arr[i]=1;
				}
			}else if(i==n-1) {
				if(arr[i-1]==0) {
					flowers--;
					arr[i]=1;
				}
			}
		}
		if(flowers==0) return true;
		return false;
	}
}
