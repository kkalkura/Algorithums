package sample.assignment.tree.traversal;

import java.util.Iterator;
import java.util.LinkedList;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class LevelOrderTraversalMarker {
	
	
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
		LinkedList<TreeNode> results = new LinkedList<TreeNode>();
		results = LevelOrderTraversal(root,results);

		System.out.println();
		
		 Iterator<TreeNode> p = results.iterator();
		    while(p.hasNext()){
		    	TreeNode node = p.next();
		        System.out.print(node.val+"\t");
		    } 
			System.out.println();
	//	System.out.println("Size of the Tree"+ size(root));
		BTreePrinter.printNode(root);
	}
	
	public static LinkedList<TreeNode>  LevelOrderTraversal(TreeNode root, LinkedList<TreeNode> results){
		if(root==null){
			return results;
		}
		LinkedList<TreeNode> travesalqueue = new LinkedList();
		
		travesalqueue.add(root);
		travesalqueue.add(new TreeNode(-3));
		
		while(travesalqueue.isEmpty()==false){
			
			TreeNode node = travesalqueue.remove();
		//  System.out.print(node.val);
			results.add(node);
			
			if(node.left!=null)
			{
				
				 travesalqueue.add(node.left);
			}
			if(node.right!=null){
				 travesalqueue.add(node.right);
			}
			if(node.val==-3 && travesalqueue.size()>0 ){
				 travesalqueue.add(new TreeNode(-3));
			}
			
			
			}
			
		
		
		return results;
	}

}
