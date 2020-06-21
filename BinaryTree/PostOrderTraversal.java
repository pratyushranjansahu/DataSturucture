import java.util.Stack;

public class PostOrderTraversal {

	public static void main(String[] args) {
		BinaryTree root = createTree();
		postOrderTraversal(root);

	}

	private static void postOrderTraversal(BinaryTree root) {
		Stack<BinaryTree> stack = new Stack();
		stack.push(root);
		while (!stack.isEmpty()) {
			BinaryTree current = stack.peek();
			if (current.isLeaf()) {
				BinaryTree temp = stack.pop();
				System.out.println(temp.data);
			} else {
				if(current.right!=null) {
					stack.push(current.right);
					current.right=null;
				}
				if(current.left!=null) {
					stack.push(current.left);
					current.left=null;
				}
			}

		}
	}

	private static BinaryTree createTree() {
		BinaryTree tree = new BinaryTree("40");
		tree.root = tree;
		// tree.root = root;
		tree.root.left = new BinaryTree("20");
		tree.root.left.left = new BinaryTree("10");
		tree.root.left.left.left = new BinaryTree("5");

		tree.root.left.right = new BinaryTree("30");
		tree.root.right = new BinaryTree("50");
		tree.root.right.right = new BinaryTree("60");
		tree.root.left.right.left = new BinaryTree("67");
		tree.root.left.right.right = new BinaryTree("78");

		return tree;

	}
}
