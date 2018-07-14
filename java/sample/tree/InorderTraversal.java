package sample.tree;



public class InorderTraversal {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
    	root.left.left.left= new TreeNode(6);
	    root.left.right.right = new TreeNode(7);
	    root.left.right.left = new TreeNode(8); 
		BTreePrinter.printNode(root);
		 inorderTraversal(root);
//	 preorderTraversal(root);
		
	//	System.out.println();
	}
	
	
	 public static void  inorderTraversal(TreeNode root) {
		 if(root==null){
			 return ; 
		 } 
		 inorderTraversal(root.left);
		 System.out.print(root.val);
		 inorderTraversal(root.right);
		
	 	}
	 
	 


public static void  preorderTraversal(TreeNode root) {
	 if(root==null){
		 return ; 
	 }
	 System.out.print(root.val);
	 preorderTraversal(root.left);	
	 preorderTraversal(root.right);
	
	}

}


