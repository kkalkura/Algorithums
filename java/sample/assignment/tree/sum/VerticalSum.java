package sample.assignment.tree.sum;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;


public class VerticalSum {
	
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		System.out.println("Inside main");
		TreeNode root = new TreeNode(100);
		root.left = new TreeNode(40);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(50);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
	//	 pathSum(root);
		verticalSum(root);
	
}
	public static void verticalSum(TreeNode root){
		
		LLNode llNode = new LLNode(0);
		verticalSumUtility(root, llNode);
		 
        
        while (llNode.prev != null)
        	llNode = llNode.prev;
 
        // Prints vertical sum of all lines starting
        // from leftmost vertical line
        while (llNode != null)
        {
            System.out.print(llNode.data +" ");
            llNode = llNode.next;
        }
		
	}
	
	
	public static void verticalSumUtility(TreeNode root, LLNode doubleList){
		
		doubleList.data = doubleList.data + root.val;
		
		if(root.left!=null){
			
			if(doubleList.prev==null) {
				doubleList.prev = new LLNode(0);
				doubleList.prev.next= doubleList;
			}
			verticalSumUtility(root.left,doubleList.prev);
			
		}
		
		if(root.right!=null){
			
			if(doubleList.next==null) {
				doubleList.next = new LLNode(0);
				doubleList.next.prev= doubleList;
			}
			verticalSumUtility(root.right,doubleList.next);
			
		}
		
		
	}
	

}
