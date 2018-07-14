package sample.tree;

public class InvertNode {
	
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		
		BTreePrinter.printNode(root);
		
	 BTreePrinter.printNode(invert(root));
		

		}
	
	
	public static TreeNode invert(TreeNode root){
		if(root==null){
			return null;
		}
		
		invert(root.left);
		invert(root.right);
	
	
	   TreeNode temp =null;
		
		if(root.left!=null && root.right!=null){
			temp = root.left;
			root.left=root.right;
			root.right=temp;		
		} else if(root.left==null && root.right!=null) {
			root.left = root.right;
			root.right = null;
		} else if(root.right==null && root.left!=null) {
			root.right= root.left;
			root.left=null;
		 }

		
		return root;
		
		
	}
	

}
