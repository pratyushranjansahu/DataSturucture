public class BinaryTree {
	BinaryTree root = null;
	String data;
	BinaryTree left, right;

	BinaryTree(String value) {
		this.data = value;
		left = right = null;
	}

	boolean isLeaf() {
		return left == null ? right == null : false;
	}

}
