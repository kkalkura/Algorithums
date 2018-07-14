package sample.assignment.tree.sum;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class SumPathBoolean {
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		System.out.println("Inside main");
		TreeNode root = new TreeNode(140);
		root.left = new TreeNode(-40);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(50);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(60);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		System.out.println(singlePath(root,150));
	}
	
	public static boolean singlePath(TreeNode root, int sum){
		 return  DFS( root,sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean  DFS(TreeNode root, int pathSum){
		if(root==null){
		  return false;
		}
		 if(pathSum==root.val && root.left==null && root.right==null){
			 return true;
		 }
		 
		 boolean leftSum = DFS(root.left, pathSum-root.val); 
		 boolean rightSum = DFS(root.right, pathSum-root.val);
		
		 if(leftSum==true || rightSum==true){
			 return true;
		 }
		 return false;
		}
	
	

}
