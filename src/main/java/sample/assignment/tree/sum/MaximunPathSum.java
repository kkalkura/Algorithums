package sample.assignment.tree.sum;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;


// not yet fully solved
public class MaximunPathSum {
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		System.out.println("Inside main");
		TreeNode root = new TreeNode(100);
		root.left = new TreeNode(40);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(50);
		root.left.right = new TreeNode(5);
	//	root.right.left = new TreeNode(10);
	//	root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		int results = pathSum(root, 0);		
		System.out.println(results);
	}
	



public static int pathSum(TreeNode root, int sum){
	
	
	  return DFSMaxPath( root);

   
}


public static int DFS(TreeNode root, int pathSum){
	int maxSum =0;
	if(root==null){
		System.out.println("pathSum"+pathSum);
		return pathSum;
	}	
		int leftMaxSum = DFS(root.left, pathSum+root.val);
		if(leftMaxSum>maxSum){
			maxSum = leftMaxSum;
		}
		int rightMaxSum = DFS(root.right, pathSum+root.val);
		if(rightMaxSum>maxSum){
			maxSum = rightMaxSum;
		}
		
		
		return maxSum;
	}





public static int DFSMaxPath(TreeNode root){
	int maxSum =0;
	if(root==null){
		return 0;
	}	
		int leftMaxSum =  Math.max(0,DFSMaxPath(root.left));
		
		int rightMaxSum =  Math.max(0,DFSMaxPath(root.right));
		
		maxSum = Math.max(maxSum, leftMaxSum + rightMaxSum + root.val);
		
		 return maxSum;
	}
}

