package sample.assignment.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class DiognalViewOfTree {
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		System.out.println("Inside main");
		TreeNode root = new TreeNode(140);
		root.left = new TreeNode(30);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(60);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		DiognalViewOfTree rtree = new DiognalViewOfTree();
		rtree.diagonalPrint(root);

	}
	
	
	 public void diagonalPrint(TreeNode root)
     {
          Queue<TreeNode> queue = new LinkedList<TreeNode>();
          diagonalPrintUtil(root, queue);
     }
     
     public void diagonalPrintUtil(TreeNode root, Queue<TreeNode> queue){
         
         if(root == null){
              return;
          }
          
          TreeNode current = root;
          while(current != null){
              System.out.print(current.val+" ");
              if(current.left != null){
                  queue.add(current.left);
              }
              
              current = current.right;
          }
          
          while(!queue.isEmpty()){
              TreeNode node = queue.peek();
              queue.remove();
              diagonalPrintUtil(node, queue);
          }
     }
}
