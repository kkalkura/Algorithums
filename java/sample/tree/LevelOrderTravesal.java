
package sample.tree;

import java.util.concurrent.LinkedBlockingQueue;

public class LevelOrderTravesal {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		levelOrder(root);
	}
	
	public static void levelOrder(TreeNode root) {
		
		if(root==null){
			return ;
		}
		LinkedBlockingQueue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>();
		queue.offer(root);
		
		while(queue.isEmpty()!=true){
			TreeNode temp = null;
			temp = queue.poll();
			
			System.out.println(temp.val);
			if(temp.left!=null){
				queue.offer(temp.left);				
			}
			if(temp.right!=null){
				queue.offer(temp.right);
			}
		}
		
	
	}

}
