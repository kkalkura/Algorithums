package sample.tree;

public class SumTeeeNode {
	
	
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
		SumTree(root);
		BTreePrinter.printNode(root);
		
	}
	
	private static void SumTree(TreeNode root) {
		if(root==null){
			return ;
		}
		
		if(root.right!=null && root.left!=null){
			root.val = root.right.val +root.left.val;
		} else if(root.right!=null){
			root.val = root.right.val;
		} else if(root.left!=null ){
			root.val = root.left.val;
		}
		SumTree(root.left);
		SumTree(root.right);
	
		
	}
		
	

}
