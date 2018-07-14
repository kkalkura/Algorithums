package sample.assignment.tree.traversal.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class ZigzagTraversalExam {
	
	
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
		TreeNode cur = root;
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
		stack1.push(cur);
		
		while(!stack1.isEmpty() || !stack2.isEmpty()){
			List<Integer> tempList = new ArrayList<Integer>();
			
			while(!stack1.isEmpty()){
				TreeNode temp = stack1.pop();
				tempList.add(temp.val);
				if(temp.left!=null){
					stack2.push(temp.left);
				}
				if(temp.right!=null){
					stack2.push(temp.right);
				}
				
				
			}
			results.add(tempList);
			tempList = new ArrayList<Integer>();
			while(!stack2.isEmpty()){
				TreeNode temp = stack2.pop();
				tempList.add(temp.val);
				if(temp.left!=null){
					stack1.push(temp.right);
				}
				if(temp.right!=null){
					stack1.push(temp.left);
				}
		
				
			}
			 if(!tempList.isEmpty())
				 results.add(tempList);
		
			
		}
		
		return results;
	
	}
}
