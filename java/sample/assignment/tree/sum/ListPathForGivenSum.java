package sample.assignment.tree.sum;

import java.util.ArrayList;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class ListPathForGivenSum {

	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		System.out.println("Inside main");
		TreeNode root = new TreeNode(100);
		root.left = new TreeNode(40);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(50);
		root.left.right = new TreeNode(5);
	//	root.right.left = new TreeNode(10);
	//	root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		System.out.println(pathSum(root,190));

	
}
	
	
	public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum){
		
		 ArrayList<ArrayList<Integer>>res = new ArrayList();
		 ArrayList<Integer> path = new ArrayList();
		  DFS( root,res,sum,path);
		  return res;
       
	}
	
	public static void DFS(TreeNode root,ArrayList<ArrayList<Integer>>  results, int sum,  ArrayList<Integer> path){
		if(root==null){
			return;
		}
		
		path.add(root.val);
		if(root.val==sum){
			results.add(new ArrayList<Integer>(path));
		}
		DFS(root.left,results, sum-root.val, path);
		DFS(root.right,results, sum-root.val, path);
		path.remove(path.size()-1);
	}

}
