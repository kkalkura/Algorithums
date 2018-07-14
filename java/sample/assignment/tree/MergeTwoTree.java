package sample.assignment.tree;

public class MergeTwoTree {

	public static void main(String[] arguments){
		System.out.println("Insdie main");
		
	
			TreeNode root = new TreeNode(1);
			root.left = new TreeNode(2);
			root.right = new TreeNode(3);
			root.left.left = new TreeNode(4);
			root.left.right = new TreeNode(5);
			root.right.left = new TreeNode(6);
			root.right.right = new TreeNode(7);
			root.right.right.right = new TreeNode(9);
			BTreePrinter.printNode(root);
			
			
			TreeNode root1 = new TreeNode(1);
			root1.left = new TreeNode(2);
			root1.right = new TreeNode(3);
			root1.left.left = new TreeNode(4);
			root1.left.right = new TreeNode(5);
			root1.right.left = new TreeNode(6);
			root1.right.right = new TreeNode(7);
			root1.right.right.left = new TreeNode(9);
			BTreePrinter.printNode(root1);
			BTreePrinter.printNode(mergeTrees(root, root1));
			
		}
	
	
	
	
	
	 public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		 if(t1==null){
	            return t2;
	        }
	        if(t2== null){
	            return t1;
	        }
	        
	        t1.val += t2.val;
	        t1.left = mergeTrees(t1.left,t2.left);
	        t1.right = mergeTrees(t1.right,t2.right);
	        return t1;
	        
	    }
	 
}
