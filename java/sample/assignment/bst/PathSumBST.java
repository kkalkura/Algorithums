package sample.assignment.bst;

import java.util.ArrayList;
import java.util.List;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class PathSumBST {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(50);
		root.left = new TreeNode(30);
		root.right = new TreeNode(70);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(40);
		root.right.left = new TreeNode(60);
		root.right.right = new TreeNode(80);
		BTreePrinter.printNode(root);
		PathSumBST bstd = new PathSumBST();
		
			}
	
	
	public boolean pathSum(TreeNode root,int k){
		
		List<Integer> result = new ArrayList<Integer>();
		inOrder(root , result);
		int size = result.size();
		int left,right;
		left =0; 
		right = size-1;
		while (left < right) {
            int sum = result.get(left) + result.get(right);
            if (sum == k)
                return true;
            if (sum < k)
                left++;
            else
                right--;
        }
        return false;

		
	}
	
	public void inOrder(TreeNode root , List<Integer> list){
		if(root==null){
			return;
		}
		inOrder(root.left,list);
		list.add(root.val);
		inOrder(root.right,list);
	}
	

}
