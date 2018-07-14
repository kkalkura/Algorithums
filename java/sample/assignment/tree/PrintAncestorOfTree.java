package sample.assignment.tree;

public class PrintAncestorOfTree {
	
	
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
		printAncesstor(root,7);
	}
	
	
	public static boolean printAncesstor(TreeNode root, int val){
		
		if(root==null) {
			return false;
		}
		
		if(root.val ==val) {
			return true;
		}
		if((printAncesstor(root.left,val) || printAncesstor(root.right,val))) {
			System.out.println(root.val);
			return true;			
		}
		
		return false;
		
	}

}
