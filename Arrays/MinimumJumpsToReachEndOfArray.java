
public class MinimumJumpsToReachEndOfArray {

	public static void main(String[] args) {
		int[] arr= {2,1,3,2,3,4,5,1,2,8};
		System.out.println(minimumJump(arr));

	}
	
	private static int minimumJump(int[] arr) {
		int[] jumpPathArray=new int[arr.length];
		int[] minimumjump=new int[arr.length];
		for(int i=1;i<arr.length;i++) {
			minimumjump[i]=Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {
				if(i<=j+arr[j] && minimumjump[j]!=Integer.MAX_VALUE) {
					//int minValue=Math.min(minimumjump[i], minimumjump[j]+1);
					//minimumjump[i]=minValue;
					//break;
					if(minimumjump[i]<=minimumjump[j]+1) {
						minimumjump[i]=minimumjump[i];
						jumpPathArray[i]=j;
						break;
					}else {
						minimumjump[i]=minimumjump[j]+1;
						jumpPathArray[i]=j;
						break;
					}
				}
			}
		}
		
		return minimumjump[minimumjump.length-1];
		
	}

}
