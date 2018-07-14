package sample.assignment.tree.traversal.test;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class distancebetween2Nodes {
	
	
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
		int results = levelofaNodeRec(root, 2,0);  
		System.out.println("the level is"+results);
		BTreePrinter.printNode(root);
		System.out.println("The distance between nodes using method1 is"+findDist2(root,4,9));
	//	System.out.println("The distance between nodes using method2 is"+findDist(root,4,9));
		
	}
	
	
/*	 public static int findDist(TreeNode root, int a, int b){
		 
		 int levelofNode1 =  levelofaNodeRec(root,a,0);
		 System.out.println("The level of Node1 is"+levelofNode1);
		 int levelofNode2 =  levelofaNodeRec(root,b,0);
		 System.out.println("The level of Node2 is"+levelofNode2);
		 TreeNode LCANode = LCAoftwoNodes(root,a,b);
		 System.out.println("The LCA of Node is"+LCANode.val);
		 int distanceofLCANode = levelofaNodeRec(root,LCANode.val,1);
		 
		 int distance = levelofNode1+levelofNode2 -2 * (distanceofLCANode);
		 return distance;
	 }
	 */
	 
 public static int findDist2(TreeNode root, int a, int b){
	 	 TreeNode LCANode = LCAoftwoNodes(root,a,b);
	 	 System.out.println("The LCA of Node is"+LCANode.val);
		 int levelofNode1 =  levelofaNodeRec( LCANode,a,0);
		 System.out.println("The level of Node1 is from LCA"+levelofNode1);
		 int levelofNode2 =  levelofaNodeRec(LCANode,b,0);
		 System.out.println("The level of Node2 is from LCA"+levelofNode2);
		 
		 int distance = levelofNode1+levelofNode2 ;
		 return distance;
	 }
	 
	 
	
	public static int levelofaNodeRec(TreeNode root,int val,int level){
		if(root==null){
			return 0;
		}
		
		if(root.val == val){
			return level;
		}
		
		int downlevel = levelofaNodeRec(root.left,val,level+1);
		
		if(downlevel!=0){
			return downlevel;
		}
		
		downlevel = levelofaNodeRec(root.right,val,level+1);
		return downlevel;
		

} 
	
	
	public static TreeNode LCAoftwoNodes(TreeNode root,int val1,int val2){
	
		if(root==null){
			return null;
		}
		if(root.val==val1 || root.val==val2){
			return root;
		}
		
		TreeNode left = LCAoftwoNodes(root.left,val1,val2);
		TreeNode right = LCAoftwoNodes(root.right,val1,val2);
		if(left != null && right != null)   return root;
        return left != null ? left : right;
		
		
} 

}
