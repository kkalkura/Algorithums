package sample.assignment.tree;

public class WidthOfBinaryTree {
	
	 int right_max_level =0;
	 int left_max_level =0;
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		//root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		WidthOfBinaryTree wtree = new WidthOfBinaryTree();
		int result =1;
		int exponent = heightofTree(root)-1;
		System.out.println(exponent);
		while (exponent != 0)
        {
            result *= 2;
            --exponent;
        }


		System.out.println(result);
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
