package sample.tree;

public class AnestorTree {
	
	
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
		printAnecstor(root ,7);
//		BTreePrinter.printNode(mirror(root));
		}
	
	
	public static boolean printAnecstor(TreeNode root , int target){
		
		if(root==null){
			return false;
		}
		if(root.val==target){
			return true;
		}
		
		if(printAnecstor(root.left,target) || printAnecstor(root.right,target)){
			System.out.println(root.val);
			return true;
		}
		
		return false;
	}


}
