package sample.assignment.tree.traversal.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class InorderStackExam {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(100);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
	/*	root.left.left.left = new TreeNode(8);
		root.left.left.right = new TreeNode(9);
		root.left.right.left = new TreeNode(0);
		root.left.right.right = new TreeNode(1);
		root.right.left.left = new TreeNode(2);
		root.right.left.right = new TreeNode(3);
	    root.right.right.left = new TreeNode(4);
	    root.right.right.right = new TreeNode(5); */
		BTreePrinter.printNode(root);	
		InorderStackExam stk = new InorderStackExam();
		
/*		LinkedList results = stk.InOrder(root, new LinkedList());
		
		Iterator resultIterator = results.iterator();
		
		while(resultIterator.hasNext()){
			TreeNode node	= (TreeNode)resultIterator.next();
			System.out.print(" "+node.val);
		}

		*/
		
	System.out.println("Insdie the preorder");	
	LinkedList results1 = stk.preOrderStack(root, new LinkedList());
		
		Iterator resultIterator1 = results1.iterator();
		
		while(resultIterator1.hasNext()){
			Integer node	= (Integer)resultIterator1.next();
			System.out.print(" "+node);
		}
		
		System.out.println("");
		System.out.println("Insdie the Inorder");	
		 results1 = stk.InOrderStack(root, new LinkedList());
			
			 resultIterator1 = results1.iterator();
			
			while(resultIterator1.hasNext()){
				Integer node	= (Integer)resultIterator1.next();
				System.out.print(" "+node);
			}
			System.out.println("");
			System.out.println("Insdie the post");	
			 results1 = stk.postOrderStack(root, new LinkedList());
				
				 resultIterator1 = results1.iterator();
				
				while(resultIterator1.hasNext()){
					Integer node	= (Integer)resultIterator1.next();
					System.out.print(" "+node);
				}
	  
	}
	
	public  LinkedList  InOrder(TreeNode root, LinkedList travesalqueue){
		if(root==null){
			return travesalqueue;
		}
		
		InOrder(root.left,travesalqueue);
		travesalqueue.add(root);
		
		InOrder(root.right,travesalqueue);
		return travesalqueue;
	
	}
	
	
	public  LinkedList  InOrderStack(TreeNode root, LinkedList travesalqueue){
		if(root==null){
			return travesalqueue;
		}
		
		Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
		
		TreeNode cur = root;
		
		while(cur!= null || !stack.isEmpty()) {
			if(cur!=null){
				stack.push(cur);
				cur = cur.left;
			} else {
				cur =stack.pop();
				travesalqueue.add(cur.val);
				cur = cur.right;
			}
			
		}
		
		return travesalqueue;
	}
	
	
	public  LinkedList  preOrderStack(TreeNode root, LinkedList travesalqueue){
		if(root==null){
			return travesalqueue;
		}
		
		Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
		TreeNode cur = root;
		while (cur != null || !stack.isEmpty()) { 
			if(cur != null) {
				stack.push(cur);
				travesalqueue.add(cur.val); 
				cur = cur.left;				
			} else {
				cur = stack.pop(); 
				cur = cur.right;  				
			}
			
		}
		return travesalqueue;
	}
	
	// Todo Reviwed
	public  LinkedList  postOrderStack(TreeNode root, LinkedList travesalqueue){
		if(root==null){
			return travesalqueue;
		}
		
		 Deque<TreeNode> stack = new ArrayDeque<>();
		TreeNode cur = root;
		while (cur != null || !stack.isEmpty()) { 
			if(cur != null) {
				stack.push(cur);
				travesalqueue.addFirst(cur.val); 
				cur = cur.right;				
			} else {
				cur = stack.pop(); 
				cur = cur.left;  				
			}
			
		}
		return travesalqueue;
	}
	
	

}
