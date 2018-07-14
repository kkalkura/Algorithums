package sample.tree;

public class MirrorNode {
	
	public static void main(String[] args){
	System.out.println("Inside main");
	TreeNode root = new TreeNode(1);
	root.left = new TreeNode(2);
	root.right = new TreeNode(3);
	root.left.right = new TreeNode(4);
	root.right.right = new TreeNode(5);
	root.left.right.left= new TreeNode(6);
    root.left.right.right = new TreeNode(7);
    root.right.right.left = new TreeNode(8); 
	BTreePrinter.printNode(root);
	
	BTreePrinter.printNode(mirror(root));
	

	}
	
	
	public static TreeNode mirror(TreeNode root){
		if(root==null){
			return null;
		}
		
	
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
		
		mirror(root.left);
		mirror(root.right);
		
	
		
		return root;
		
		
	}
	
	

}
