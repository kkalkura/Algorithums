package sample.assignment.bst;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class MaxFind {
	
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(14);
		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(9);
		root.right.left = new TreeNode(11);
		root.right.right = new TreeNode(16);
		BTreePrinter.printNode(root);
		MaxFind bstd = new MaxFind();
		System.out.println(bstd.findMax(root));
		System.out.println(bstd.findMax2(root).val);
	
	}
	
	public int findMax(TreeNode root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
		
		int result = root.val;
		
		int leftresult = findMax(root.left);
		int rightresult = findMax(root.right);
		
		if(leftresult>rightresult){
			result = leftresult;
		} else if(rightresult>leftresult){
			result = rightresult;
		}
		
		return result;
		
	}
	
	
	
	public TreeNode findMax2(TreeNode root){
		if(root==null){
			return null;
		}
		
		TreeNode result = root;
		
		TreeNode leftresult = findMax2(root.left);
		TreeNode rightresult = findMax2(root.right);
		
		if((leftresult!=null & rightresult!=null)&&(leftresult.val>rightresult.val)){
			result = leftresult;
		} else if((leftresult!=null & rightresult!=null)&&(rightresult.val >leftresult.val)){
			result = rightresult;
		}
		
		return result;
		
	}


}
