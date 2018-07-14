 package sample.assignment.tree.sum;

// https://leetcode.com/problems/sum-root-to-leaf-numbers/description/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class ListAllPathFromRootSum {

	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(0);
	    root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
	 	root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		 System.out.println(pathSum(root));
	
}
	
	
	public static int pathSum(TreeNode root){
		
		 ArrayList<String>res = new ArrayList();
		 ArrayList<Integer> path = new ArrayList();
		  DFS( root,res,path);
		  System.out.println(res);
		  Iterator result = res.iterator();
		  int Sum=0;
		  while(result.hasNext()){
			 String items = (String) result.next();
			 Integer item = new Integer(items);
			 Sum = Sum+item.intValue();
		  }
		  return Sum;
       
	}
	
	public static String StringConverter(ArrayList<Integer> input){
		Iterator<Integer> result =  input.iterator();
		StringBuilder results = new StringBuilder();
		while(result.hasNext()){
			results.append(result.next().intValue());
		}
		return results.toString();
	}


	public static void DFS(TreeNode root,ArrayList<String>  results, ArrayList<Integer> path){
		if(root==null){
			return;
		}
		 path.add(root.val);
		
		if( root.left==null && root.right==null){
			results.add(StringConverter(new ArrayList<Integer>(path)));
		}
			DFS(root.left,results,path);
			DFS(root.right,results,path);
			path.remove(path.size() - 1);
		}

}
