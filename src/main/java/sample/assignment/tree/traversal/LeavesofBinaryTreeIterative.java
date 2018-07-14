package sample.assignment.tree.traversal;

import java.util.ArrayList;
import java.util.List;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;


public class LeavesofBinaryTreeIterative {

	public static void main(String[] argument){
		System.out.println("Inside the main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(9);
		BTreePrinter.printNode(root);
		System.out.println(findleaves(root));
		}
	
	 
		public static List<List<Integer>> findleaves(TreeNode root) {
			List<List<Integer>> res = new ArrayList<List<Integer>> ();
			while(root!=null){
				List<Integer> temp = new ArrayList<Integer>();
				root = removeLeaves(root , temp);
				res.add(temp);
			}
			return res;
			
		}
		
		
		
		private static TreeNode removeLeaves(TreeNode root , List<Integer> temp){
			if(root==null) return null;
			if(root.left==null && root.right==null){
				temp.add(root.val);
				return null;
			}
			root.left = removeLeaves(root.left ,temp);
			root.right = removeLeaves(root.right ,temp);
			return root;
		}
}
