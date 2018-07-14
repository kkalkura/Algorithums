package sample.assignment.tree.traversal;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;
import sample.assignment.tree.sum.LLNode;


public class TopViewofaTree {

	static int  max_level = 0;
	public static void main(String[] argument){
	System.out.println("Inside the main");
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
//	BTreePrinter.printNode(root);
	TopView(root);

	}
	
	
	
public static void TopView(TreeNode root){
		
		LLNode llNode = new LLNode(0);
		TopViewUtility(root, llNode);
		 
        
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
	
	public static void TopViewUtility(TreeNode root, LLNode doubleList){
		if(doubleList.data==0){
			doubleList.data = root.val;
		}
		if(root.left!=null){
			
			if(doubleList.prev==null) {
				doubleList.prev = new LLNode(0);
				doubleList.prev.next= doubleList;
			}
			TopViewUtility(root.left,doubleList.prev);
			
		}
		
		if(root.right!=null){
			
			if(doubleList.next==null) {
				doubleList.next = new LLNode(0);
				doubleList.next.prev= doubleList;
			}
			TopViewUtility(root.right,doubleList.next);
			
		}
		
		
	}
}
