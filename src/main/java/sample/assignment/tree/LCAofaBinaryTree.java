package sample.assignment.tree;

public class LCAofaBinaryTree {
	
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
		TreeNode results = LCAoftwoNodes(root, 4,5);  
		System.out.println("the LCA  is"+results.val);
	}
	
	
	public static TreeNode LCAoftwoNodes(TreeNode root,int val1,int val2){
		
		if(root==null){
			return null;
		}
		if(root.val==val1 || root.val==val2){
			return root;
		}
		
		TreeNode left = LCAoftwoNodes(root.left,val1,val2);
		TreeNode right = LCAoftwoNodes(root.right,val1,val2);
		if(left != null && right != null)   return root;
		if(left!=null){
			return left;
		} else {
			return right;
		}
    
		
		
} 

}
