package sample.assignment.tree.traversal;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class SecondMinimumofTree {
	int min1;
	long ans = Long.MAX_VALUE;
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		System.out.println("Inside main");
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
	//	root.left.left = new TreeNode(5);
	//	root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		SecondMinimumofTree scdmin = new SecondMinimumofTree();
		System.out.println(scdmin.findSecondMinimumValue(root));

		}
	
	public void dfs(TreeNode root) {
        if (root != null) {
            if (min1 < root.val && root.val < ans) {
                ans = root.val;
            } else if (min1 == root.val) {
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
    public int  findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }

}
