package sample.assignment.tree;
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
		BTreePrinter.printNode(root);
	System.out.println("Height of a Tree"+heightofTree(root));  
 
	//	BTreePrinter.printNode(root);
		
	}
	
	public static int diameterofTree(TreeNode root){
		if(root==null){
			return 0;
		}
		
		int leftheight = heightofTree(root.left);
		int rightheight =  heightofTree(root.right);
		
		int diameterleft = diameterofTree(root.left);
		int diameterright = diameterofTree(root.right);
		
		int maxDiamter = Math.max(diameterleft,diameterright);
		
		return Math.max((leftheight+rightheight+1),maxDiamter);
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
