package sample.assignment.tree.traversal.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class LevelOrderTraversalQueueExam {
	
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		List<List<Integer>> results = LevelOrderTraversal(root);
		System.out.println(results);
	//	System.out.println("Size of the Tree"+ size(root));
		BTreePrinter.printNode(root);
	}
	
	public static List<List<Integer>> LevelOrderTraversal(TreeNode root){
		 List<List<Integer>> wrapList = new ArrayList<List<Integer>>();
		 LinkedList<TreeNode> travelQueue = new LinkedList<TreeNode>();
		 if(root==null){
			 return wrapList;
		 }
		 
		 travelQueue.add(root);
		 
		 while(!travelQueue.isEmpty()){
			 int size = travelQueue.size();
			
			 List<Integer> tempList = new ArrayList<Integer>();
			 for(int i=0;i<size;i++){
				 TreeNode temp = travelQueue.pop();
				 if(temp.left!=null){
					 travelQueue.add(temp.left);
				 }
				 if(temp.right!=null){
					 travelQueue.add(temp.right);
				 }
				 tempList.add(temp.val);
			 }
			 wrapList.add(tempList);
		 }
		
		return wrapList;
		
		}
	
	
	
	public static List<List<Integer>> LevelOrderTraversal1(TreeNode root){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		LinkedList<TreeNode> traveQueue= new LinkedList<TreeNode>();
		if(root==null) {
			return result;
		}
		
		traveQueue.add(root);
		
		while(!traveQueue.isEmpty()){
			int size = traveQueue.size();
			List<Integer> tempList = new ArrayList<Integer>();
			for(int i=0;i<size;i++){
				TreeNode temp = traveQueue.pop();
				if(temp.left!=null){
					traveQueue.add(temp.left);
				} else if(temp.right!=null){
					traveQueue.add(temp.right);
				}
				tempList.add(root.val);
			}
			
			result.add(tempList);
		}
		
		return result;
		
		
		}

}
