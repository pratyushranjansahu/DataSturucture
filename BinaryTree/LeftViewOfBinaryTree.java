import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {

	public static void main(String[] args) {
		BinaryTree root = createTree();
		leftView(root);

	}

	private static void leftView(BinaryTree root) {
		Queue<BinaryTree> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int queueSize = queue.size();
			for (int i = 1; i <= queueSize; i++) {
				BinaryTree tempNode = queue.poll();
				if (i == 1) {
					System.out.println(tempNode.data);
				}
				if (tempNode.left != null)
					queue.offer(tempNode.left);
				if(tempNode.right!=null)
					queue.offer(tempNode.right);
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
