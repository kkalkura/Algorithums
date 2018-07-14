package sample.assignment.tree.traversal.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class LevelOrderTravesal {
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		System.out.println("Inside main");
		TreeNode root = new TreeNode(140);
		root.left = new TreeNode(30);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(60);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
	List<List<Integer>> results = LevelOrderTravelsal(root);
		System.out.println(results);
		}
	
	public static List<List<Integer>> LevelOrderTravelsal(TreeNode root){
		List<List<Integer>> wrapList = new ArrayList<List<Integer>>();
		LinkedList<TreeNode> travesalQueue = new LinkedList<TreeNode>();
		if(root==null){
			return wrapList;
		}
		travesalQueue.add(root);
		
		while(travesalQueue.isEmpty()==false){
			int levelSize = travesalQueue.size();
			List<Integer> sublist = new ArrayList<Integer>();
			for(int i=0;i<levelSize;i++){
				TreeNode node = travesalQueue.pop();
				if(node.left!=null){
					travesalQueue.add(node.left);
				} 
				
				if(node.right!=null){
					travesalQueue.add(node.right);
				}
				sublist.add(node.val);				
			}
			wrapList.add(sublist);
		
		}
		
		return wrapList;
	
		
		
	}

}
