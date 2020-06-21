import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		BinaryTree root = createTree();
		levelOrderTraversal(root);

	}

	private static void levelOrderTraversal(BinaryTree root) {
		Queue<BinaryTree> queue=new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			BinaryTree temp=queue.poll();
			System.out.print(temp.data+" ");
			if (temp.left!=null) {
				queue.offer(temp.left);
			}
			if(temp.right!=null) {
				queue.offer(temp.right);
			}
			
		}
	}

	private static BinaryTree createTree() {
		BinaryTree tree = new BinaryTree("40");
		tree.root=tree;
		//tree.root = root;
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
