package sample.assignment.tree.traversal;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.BTreePrinter2;
import sample.assignment.tree.TreeNode2;

public class FillNextPointer {
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		TreeNode2 root = new TreeNode2(1);
		root.left = new TreeNode2(2);
		root.right = new TreeNode2(3);
		root.left.left = new TreeNode2(4);
		root.left.right = new TreeNode2(5);
		root.right.left = new TreeNode2(6);
		root.right.right = new TreeNode2(7);
		root.right.right.right = new TreeNode2(9);
		BTreePrinter2.printNode(root);
		}
	
	public void connect(TreeNode2 root){
		root.next=null;
		connectcur(root);
	}
	
	public void connectcur(TreeNode2 p){
		if(p==null){
			return;
		}
		// Fill all the nodes of that level 
		if(p.next!=null){
			connectcur(p.next);
		}
		// Fill left child recursively
		if(p.left!=null){
			if(p.right!=null){
				p.left.next = p.right;
				p.right.next = getNextPointer(p);
			} else {
				p.left.next = getNextPointer(p);
			}
			connectcur(p.left);
			
		} else if(p.right!=null){ // Fill right child recursively
			p.right.next = getNextPointer(p);
			connectcur(p.right);
		 }else { // Fill the nodes next pointer
			 connectcur(getNextPointer(p));
		 }
		
	}
	
	
	public TreeNode2 getNextPointer(TreeNode2 p){
		TreeNode2 temp =p.next;
		while(temp !=null){
			if(temp.left!=null) return temp.left;
			if(temp.right!=null) return temp.right;
			temp = temp.next;
		}
		return null;
	}
	
}
