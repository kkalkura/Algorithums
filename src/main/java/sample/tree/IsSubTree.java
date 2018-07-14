package sample.tree;

public class IsSubTree {
	
	
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
		
		TreeNode root2 = new TreeNode(2);
		 root2.left = new TreeNode(4);
		 root2.right = new TreeNode(5);
	//     root2.left.left = new TreeNode(4);
		BTreePrinter.printNode(root2);
		System.out.println("Tree is idential"+isSubTree( root,root2));
	
		
	}
	
	
	public static boolean isSubTree(TreeNode node1, TreeNode node2) {
		if(node2==null){
			return true;
		}
		
		if(node1==null){
			return false;
		}
		
		if(isIdentical(node1, node2)){
			
			return true;
		}
		
		if(isSubTree(node1.left, node2)){
			return true;
		}
		if(isSubTree(node1.right, node2)){
			return true;
		}
		
		return false;
	}
	
	
	
	public static boolean isIdentical(TreeNode node1, TreeNode node2) {
		if(node1==null && node2==null){
			return true;
		}
		if(node1!=null & node2==null){
			return false;
		}
		if(node1==null & node2!=null){
			return false;
		}
		
		// Pre order Traversal 
		if(node1.val==node2.val){
			if(isIdentical( node1.left,node2.left)) {
				if(isIdentical( node1.right,node2.right)) {
					return true;
				}
				}
			}
		return false;
		}
	}


