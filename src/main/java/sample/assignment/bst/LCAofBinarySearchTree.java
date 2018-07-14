package sample.assignment.bst;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class LCAofBinarySearchTree {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(11);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(13);
		BTreePrinter.printNode(root);
		LCAofBinarySearchTree bstd = new LCAofBinarySearchTree();
		System.out.println(bstd.LCAofBinarySearchTree(root, new TreeNode(10), new TreeNode(13)).val);
	
	}
	
	public TreeNode LCAofBinarySearchTree(TreeNode root,TreeNode p, TreeNode q){
		
		/*while (true) {
            if (root.val > p.val && root.val > q.val)
                root = root.left;
            else if (root.val < p.val && root.val < q.val)
                root = root.right;
            else
                return root;
        }
		*/
		
		if(root.val > p.val && root.val > q.val){
            return LCAofBinarySearchTree(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return LCAofBinarySearchTree(root.right, p, q);
        }else{
            return root;
        }
	}

}
