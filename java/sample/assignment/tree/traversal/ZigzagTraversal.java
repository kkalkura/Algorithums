package sample.assignment.tree.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class ZigzagTraversal {
	
	
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
		System.out.println(LevelOrderTravelsal(root));
		
	}
	
	public static List<List<Integer>> LevelOrderTravelsal(TreeNode root){
		TreeNode item = root;
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		
		if(root==null) 	return results;
		
		
		Stack<TreeNode> travesalStack1 = new Stack<TreeNode>();
		Stack<TreeNode> travesalStack2 = new Stack<TreeNode>();
		travesalStack1.push(root);
		
		while(!travesalStack1.isEmpty() || !travesalStack2.isEmpty()){
			List<Integer> sublist = new ArrayList<Integer>();
			
			while(!travesalStack1.isEmpty() )
			{				
				item  = travesalStack1.pop();
				sublist.add(item.val);	
				if(item.left!=null) travesalStack2.push(item.left);
				if(item.right!=null) travesalStack2.push(item.right);
			}			
			results.add(sublist);
			sublist = new ArrayList<Integer>();			 
			 while(!travesalStack2.isEmpty())
			 {				
				item = travesalStack2.pop();
				sublist.add(item.val);
				if(item.right!=null) travesalStack1.push(item.right);
				if(item.left!=null) travesalStack1.push(item.left);
			}
			 if(!sublist.isEmpty())
				 results.add(sublist);
		}
		
		return results;
	
	}
}
