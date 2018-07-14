package sample.assignment.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;



public class DeepestleftNode {
	TreeNode result;
	
	class Level 
	{
	   
	    int maxlevel = 0;
	}
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.left.left.left = new TreeNode(8);
		BTreePrinter.printNode(root);
		DeepestleftNode dp = new DeepestleftNode();
		dp.deepestLeftLeaf(root);
		if (dp.result != null)
            System.out.println("The deepest left child"+
                               " is " + dp.result.val);
	
	}
	
  public void deepestLeftNodeUtil(TreeNode node, int lvl, Level level , boolean isLeft){
	  
	  if(node==null){
		  return;
	  }
	  
	  if(isLeft!=false && 
			  node.left==null && 
			  node.right ==null && 
			  lvl> level.maxlevel){
		  level.maxlevel = lvl;
		  result = node;
	  }
	  
	  deepestLeftNodeUtil(node.left,lvl+1,level,true);
	  deepestLeftNodeUtil(node.right,lvl+1,level,false);
  }
  
  
  public void deepestLeftLeaf(TreeNode node) 
  {
      Level level = new Level();
      deepestLeftNodeUtil(node, 0, level, false);
  }
	
	

}
