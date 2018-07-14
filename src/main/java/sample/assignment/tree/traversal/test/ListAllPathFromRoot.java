package sample.assignment.tree.traversal.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class ListAllPathFromRoot {

	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		 pathSum(root);
	
}
	
	
	public static ArrayList<String> pathSum(TreeNode root){
		
		 ArrayList<String>res = new ArrayList();
		 ArrayList<Integer> path = new ArrayList();
		  DFS( root,res,path);
		  System.out.println(res);
		  return res;
       
	}
	
	public static String StringConverter(ArrayList<Integer> input){
		Iterator<Integer> result =  input.iterator();
		StringBuilder results = new StringBuilder();
		while(result.hasNext()){
			results.append(result.next().intValue()+"->");
		}
		results = results.delete(results.length()-2, results.length());
		return results.toString();
	}


	public static void DFS(TreeNode root,List<String> result,List<Integer> path){
		if(root==null){
			return;
		}
		path.add(root.val);
		
		if(root.left==null && root.right==null){
			result.add(StringConverter((ArrayList<Integer>) path));
		}
		
		DFS(root.left,result,path);
		DFS(root.right,result,path);
		path.remove(path.size() - 1);
		
		
	}
		

}
