package sample.assignment.bst;

import java.util.Stack;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class BSTIterator {
	
	Stack<TreeNode> stack =  null ;            
    TreeNode current = null ;
	
    
    public BSTIterator(TreeNode root) {
  	  current = root;	     
  	  stack = new Stack<> ();
	}
    
    public boolean hasNext() {		  
	      return !stack.isEmpty() || current != null;  
	}
    
    public int next() {
		while (current != null) {
			stack.push(current);
			current = current.left ;
		}		
		TreeNode t = stack.pop() ;		
		current = t.right ;		
		return t.val ;
	}
    
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(10);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(11);
		BTreePrinter.printNode(root);
		BSTIterator bstd = new BSTIterator(root);
		
		while(bstd.hasNext()){
			System.out.println(bstd.next());
		}
		
	

	}
	
	

}
