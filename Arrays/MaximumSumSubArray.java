
public class MaximumSumSubArray {

	public static void main(String[] args) {
		int[] arr= {4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
		kadneAlgorithm(arr);

	}
	
	private static void kadneAlgorithm(int[] arr) {
		int max_so_far=arr[0];
		int max_ending_here=0;
		int start=0;
		int end=0;
		int s=0;
		for(int i=0;i<arr.length;i++) {
			max_ending_here+=arr[i];
			if(max_so_far<max_ending_here) {
				max_so_far=max_ending_here;
				start=s;end=i;
			}
			if(max_ending_here<0) {
				max_ending_here=0;
				s=i+1;
			}
		}
		System.out.println("Max So far : "+max_so_far);
		System.out.println("Start and End index is : "+start +" , "+end);
	}

}
