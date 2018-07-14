package sample.assignment.tree.traversal.test;

import java.util.LinkedList;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class LevelOfNode {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(9);
		BTreePrinter.printNode(root);
		int results = levelofaNodeRec(root, 3,1);  
		System.out.println("the level is"+results);
		BTreePrinter.printNode(root);
		
	}
	
	
		public static int levelofaNodeRec(TreeNode root,int val,int level){
		 
			if(root==null){
				return 0;
			}
			if(root.val == val){
				return level;
			}
			
			int downlevel = levelofaNodeRec(root.left,val,level+1);
			if(downlevel!=0){
				return downlevel;
			}
			downlevel = levelofaNodeRec(root.right,val,level+1);
			return downlevel;
		} 
	
	
	public static int levelofaNode(TreeNode root,int val){
		if(root==null){
			return -1;
		}
		int level =0;
		LinkedList<TreeNode> travesalqueue = new LinkedList<TreeNode>();

		travesalqueue.add(root);
		travesalqueue.add(new TreeNode(-3));
		if(root.val == val){
			return level;
		}
		
		while(travesalqueue.isEmpty()==false){
			
			TreeNode node = travesalqueue.remove();
			if(node.val==-3 && travesalqueue.size()>1 ){
				 travesalqueue.add(new TreeNode(-3));
				 level ++;
			}
			if(node.val==val){
				return level;
			}
			
			if(node.left!=null)
			{
				
				 travesalqueue.add(node.left);
				
			}
			if(node.right!=null){
				 travesalqueue.add(node.right);
				
			}
			
			
			}
		
		return -1;
		
		
}
		
		
		
	}
	
	
	


