package sample.assignment.tree.traversal;

import java.util.LinkedList;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class LevelOrderTraversal {
	
	
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
		LevelOrderTraversal(root);
		System.out.println();
	//	System.out.println("Size of the Tree"+ size(root));
		BTreePrinter.printNode(root);
	}
	
	public static void LevelOrderTraversal(TreeNode root){
		if(root==null){
			return ;
		}
		LinkedList<TreeNode> travesalqueue = new LinkedList();
		travesalqueue.push(root);
		
		while(travesalqueue.isEmpty()==false){
			TreeNode node = travesalqueue.pop();
			System.out.print(node.val);
			if(node.left!=null){
				 travesalqueue.add(node.left);
			}
			if(node.right!=null){
				 travesalqueue.add(node.right);
			}
		}
	}

}
