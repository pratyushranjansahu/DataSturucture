import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] arr= {5,3,2,10,6,8,1,4,12,7,4};
		nextGreaterElement(arr);

	}
	
	private static void nextGreaterElement(int[] arr) {
		int[] nge=new int[arr.length];
		Stack<Integer> stack=new Stack();
		for (int i = arr.length-1; i >=0; i--) {
			if (!stack.isEmpty()) {
				while(!stack.isEmpty() && arr[i]>=stack.peek())
					stack.pop();				
			}
		nge[i]= stack.isEmpty()?-1:stack.peek();
		stack.push(arr[i]);
		}
		
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+"  ------------>  "+nge[i]);
	}
	}

}
