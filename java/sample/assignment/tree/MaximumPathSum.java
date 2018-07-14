package sample.assignment.tree;

public class MaximumPathSum {
	int maxValue;
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(9);
		BTreePrinter.printNode(root);
		
	}
	
	
	private int maxPathDown(TreeNode root){
		if(root==null) {
			return 0;
		}
		
		int leftSum = Math.max(0, maxPathDown(root.left));
		int rightSum = Math.max(0,maxPathDown(root.right));
		maxValue = Math.max(maxValue, leftSum+rightSum+root.val);
		return  Math.max(leftSum, rightSum) + root.val;
	}

}
