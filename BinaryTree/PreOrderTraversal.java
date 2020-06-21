import java.util.Stack;

public class PreOrderTraversal {

	public static void main(String[] args) {
		BinaryTree root = createTree();
		preOrderTraversal(root);

	}

	private static void preOrderTraversal(BinaryTree root) {
		Stack<BinaryTree> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			BinaryTree temp = stack.pop();
			System.out.println(temp.data);
			if (temp.right != null)
				stack.push(temp.right);
			if (temp.left != null)
				stack.push(temp.left);

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
