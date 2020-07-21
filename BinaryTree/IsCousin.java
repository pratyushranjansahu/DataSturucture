class IsCousin {
	public boolean isCousins(TreeNode root, int x, int y) {
		AtomicInteger pX = new AtomicInteger(0);
		AtomicInteger pY = new AtomicInteger(0);
		AtomicInteger dX = new AtomicInteger(-1);
		AtomicInteger dY = new AtomicInteger(-1);
		parentAndDepth(root, x, y, 0, dX, dY, pX, pY);
		return ((dX.get() == dY.get()) && (pX.get() != pY.get()));
	}

	private void parentAndDepth(TreeNode root, int x, int y, int d, AtomicInteger dX, AtomicInteger dY,
			AtomicInteger pX, AtomicInteger pY) {

		if (root == null)
			return;
		if (root.left != null) {
			if (root.left.val == x) {
				pX.set(root.val);
				dX.set(d + 1);
			} else if (root.left.val == y) {
				pY.set(root.val);
				dY.set(d + 1);
			}
		}
		if (root.right != null) {
			if (root.right.val == x) {
				pX.set(root.val);
				dX.set(d + 1);
			} else if (root.right.val == y) {
				pY.set(root.val);
				dY.set(d + 1);
			}
		}

		if (dX.get() != -1 && dY.get() != -1)
			return;
		parentAndDepth(root.left, x, y, d + 1, dX, dY, pX, pY);
		parentAndDepth(root.right, x, y, d + 1, dX, dY, pX, pY);
	}

}
