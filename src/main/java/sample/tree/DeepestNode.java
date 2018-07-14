package sample.tree;

import java.util.concurrent.LinkedBlockingQueue;

public class DeepestNode {
	
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
	 System.out.println("Height of a Tree"+deepestNodeIterative(root));  
 //	inorderTraversal(root,heightofTree(root),0); 
	//	BTreePrinter.printNode(root);
		
	}
	
	
	public static int deepestNodeIterative(TreeNode node){
		if(node==null){
			return 0;
		}
		int deepestNode=0;
		
		LinkedBlockingQueue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>();
		queue.offer(node);
		
		while(queue.isEmpty()!=true){
			TreeNode temp = null;
			temp = queue.poll();
			deepestNode = temp.val;
			
	//		System.out.println(temp.val);
			if(temp.left!=null){
				queue.offer(temp.left);				
			}
			if(temp.right!=null){
				queue.offer(temp.right);
			}
		}
		
		return deepestNode;
	}
	
	
	 public static void  inorderTraversal(TreeNode root,int height,int depth) {
		 if(root==null){
			 return  ; 
		 }
		 
		 depth ++;
		 
		 inorderTraversal(root.left,height,depth);
		 inorderTraversal(root.right,height,depth);
		 if(depth==height){
			 System.out.print(root.val);
			
		 }
	 }



}
