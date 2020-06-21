import java.util.Stack;

public class InOrderTraversal {

	public static void main(String[] args) {
		BinaryTree root = createTree();
		inOrderTraversal(root);
	}

	private static void inOrderTraversal(BinaryTree root) {
		BinaryTree current = root;
		Stack<BinaryTree> stack = new Stack();
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				BinaryTree temp=stack.pop();
				System.out.println(temp.data);
				current=temp.right;
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
