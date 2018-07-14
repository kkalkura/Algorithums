package sample.assignment.tree;



public class SizeOfTree {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		System.out.println("Size of the Tree"+ size(root));
		BTreePrinter.printNode(root);
	}
	
	public static int size(TreeNode root) {
		if(root==null){
			return 0;
		}
		
		int ls = size(root.left);
		int rs= size(root.right);
		root.val = ls+rs+1;
		return ls+rs+1;
	}

}
