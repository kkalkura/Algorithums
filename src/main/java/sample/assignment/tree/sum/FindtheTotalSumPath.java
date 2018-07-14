package sample.assignment.tree.sum;

import  sample.assignment.tree.TreeNode;
import java.util.ArrayList;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class FindtheTotalSumPath {
	
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
		int[] results = {0};
		maxTotalsumPath(root,results,37);
		System.out.println(results[0]);
	}
	
	
	
	
	
	public static  void maxTotalsumPath(TreeNode root, int[] results, int sum){
			
		if(root==null){
			return ;
		}
		
		   DFS( root,results,sum);
		   maxTotalsumPath(root.left,  results, sum);
		   maxTotalsumPath(root.right,  results, sum);

		  
	}
	
	
	
	public static void DFS(TreeNode root,int[] results, int sum){
		if(root==null){
			return;
		}
		
		
		if( sum == root.val){
			int counter = results[0];
			counter ++;
			results[0] =counter;
			
		}
			DFS(root.left,results, sum-root.val); 
			DFS(root.right,results, sum-root.val);
			
			
		}
}
	
	

	
	


