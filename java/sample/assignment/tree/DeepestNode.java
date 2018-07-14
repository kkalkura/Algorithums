package sample.assignment.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;



public class DeepestNode {
	
	
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
	//	LevelOrderTraversal(root);
		System.out.println();
	/*	LinkedList<TreeNode> travesalqueue = new LinkedList();
		travesalqueue = PrepOrder(root,travesalqueue);
	    System.out.println("Size of the Tree"+ travesalqueue.size());
	    Iterator<TreeNode> i = travesalqueue.iterator();
	    while(i.hasNext()){
	    	TreeNode node = i.next();
	        System.out.print(node.val+"\t");
	    }
	    System.out.println();
	    */
		LinkedList<TreeNode> travesalqueue = new LinkedList();
	    travesalqueue = InOrder(root,travesalqueue);
	    System.out.println("Size of the Tree"+ travesalqueue.size());
	    Iterator<TreeNode> p = travesalqueue.iterator();
	    while(p.hasNext()){
	    	TreeNode node = p.next();
	        System.out.print(node.val+"\t");
	    } 
	    System.out.println();
	    inorderTraversal(root);
	//	BTreePrinter.printNode(root);
	}
	
	public static LinkedList PrepOrder(TreeNode root,LinkedList travesalqueue){
		if(root==null){
			return travesalqueue;
		}
		
		travesalqueue.add(root);
		PrepOrder(root.left,travesalqueue);
		PrepOrder(root.right,travesalqueue);
		return travesalqueue;
	
	}
	
	
	
	public static LinkedList  InOrder(TreeNode root, LinkedList travesalqueue){
		if(root==null){
			return travesalqueue;
		}
		
		InOrder(root.left,travesalqueue);
		travesalqueue.add(root);
		
		InOrder(root.right,travesalqueue);
		return travesalqueue;
	
	}
	
	
	 public static void  inorderTraversal(TreeNode root) {
		 if(root==null){
			 return ; 
		 } 
		 inorderTraversal(root.left);
		 System.out.print(root.val);
		 inorderTraversal(root.right);
		
	 	}
	 
	 


public static void  preorderTraversal(TreeNode root) {
	 if(root==null){
		 return ; 
	 }
	 System.out.print(root.val);
	 preorderTraversal(root.left);	
	 preorderTraversal(root.right);
	
	}

}
