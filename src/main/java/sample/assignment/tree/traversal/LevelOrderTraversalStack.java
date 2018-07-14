package sample.assignment.tree.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class LevelOrderTraversalStack {
	
	
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
		
		LinkedList<TreeNode> travesalQueue = new LinkedList<TreeNode>();
		Stack<List<Integer>> wrapList = new Stack<List<Integer>>();
		if(root==null){
			return wrapList;
		}
		travesalQueue.add(root);
		
		while(travesalQueue.isEmpty()==false){
			
			int levelsize = travesalQueue.size();
			List<Integer> sublist = new ArrayList<Integer>();
			for(int i=0;i<levelsize;i++){
				TreeNode node = travesalQueue.pop();
				if(node.left!=null){
					travesalQueue.add(node.left);
				}
				if(node.right!=null){
					travesalQueue.add(node.right);					
				}
				sublist.add(node.val);
			}
			wrapList.push(sublist);
			
		}
		return convertStacktoList(wrapList);
		
	}
	
	public static List<List<Integer>> convertStacktoList(Stack<List<Integer>> list){
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		while(list.isEmpty()==false)
		{
			results.add(list.pop());
		}
		return results;
	}

}
