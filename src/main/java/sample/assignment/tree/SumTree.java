package sample.assignment.tree;



public class SumTree {
	
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
		 Sum(root);
		BTreePrinter.printNode(root);
	}
	
	public static void  Sum(TreeNode root) {
		if(root==null){
			return ;
		}
		
		int Sum = 0;
		if(root.left!=null){
			Sum = root.left.val;
		}
		if(root.right!=null){
			Sum = Sum+root.right.val;
		}
		 root.val= Sum+ root.val;
		Sum(root.left);
		Sum(root.right);
	}

}
