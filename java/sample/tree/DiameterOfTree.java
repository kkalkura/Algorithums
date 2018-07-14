package sample.tree;

public class DiameterOfTree {
	
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
		//root.right.right.right.right = new TreeNode(10);
	
		BTreePrinter.printNode(root);
		System.out.println("Diameter of a tree"+diameter(root));
		
	}
	
	
	public static int diameter(TreeNode node) {
		
		if(node==null){
			return 0;
		}
		
		int lh = heightofTree(node.left);
		int rh = heightofTree(node.right);
		
		int ld = diameter(node.left);
		int rd = diameter(node.right);
		
		return Math.max(1+lh+rh,Math.max(ld, rd));
	}
	
	
	public static int heightofTree(TreeNode node){
		if(node==null){
			return 0;
		}
		
		int lh =  heightofTree(node.left);
		 int rh = heightofTree(node.right);
		 return (lh>rh)?lh+1: rh+1;
	}

}
