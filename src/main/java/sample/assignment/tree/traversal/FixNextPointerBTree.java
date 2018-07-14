package sample.assignment.tree.traversal;

import sample.assignment.tree.BTreePrinter2;
import sample.assignment.tree.TreeNode2;

public class FixNextPointerBTree {

	public static void main(String[] argument){
		System.out.println("Inside the main");
		TreeNode2 root = new TreeNode2(1);
		root.left = new TreeNode2(2);
		root.right = new TreeNode2(3);
		root.left.left = new TreeNode2(4);
		root.left.right = new TreeNode2(5);
		root.right.left = new TreeNode2(6);
		root.right.right = new TreeNode2(7);
		root.right.right.right = new TreeNode2(9);
		BTreePrinter2.printNode(root);
		}
	
	public void connect(TreeNode2 root) {
        TreeNode2 level_start=root;
        while(level_start!=null){
            TreeNode2 cur=level_start;
            while(cur!=null){
                if(cur.left!=null) cur.left.next=cur.right;
                if(cur.right!=null && cur.next!=null) cur.right.next=cur.next.left;
                
                cur=cur.next;
            }
            level_start=level_start.left;
        
        }
	}
}

	
	

