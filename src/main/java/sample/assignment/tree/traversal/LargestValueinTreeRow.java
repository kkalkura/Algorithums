package sample.assignment.tree.traversal;

import java.util.ArrayList;
import java.util.List;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class LargestValueinTreeRow {
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
	//	root.right.right.right = new TreeNode(9);
		BTreePrinter.printNode(root);
		LargestValueinTreeRow largest = new LargestValueinTreeRow();
		System.out.println(largest.largestValues(root));
		}
		
	
	 public List<Integer> largestValues(TreeNode root) {
		 List<Integer> results = new ArrayList<Integer>();
		 largestValueshelper(root, 0, results);
		 return results;
	 }
	 
	 private void largestValueshelper(TreeNode root, int level,List<Integer> result){
		 if(root==null){
			 return ;
		 }
		 
		 if(result.size()== level){
			 result.add(root.val);
		 } else {
			 result.set(level,Math.max(result.get(level),root.val));
		 }
		 largestValueshelper(root.left,level+1, result);
		 largestValueshelper(root.right,level+1, result); 
		 
	 }
}
