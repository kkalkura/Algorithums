package sample.assignment.tree.traversal;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class BorderTraversalTree {
	
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		System.out.println("Inside main");
		TreeNode root = new TreeNode(20);
		 root.left = new TreeNode(8);
	     root.left.left = new TreeNode(4);
	     root.left.right = new TreeNode(12);
	     root.left.right.left = new TreeNode(10);
	     root.left.right.right = new TreeNode(14);
	     root.right = new TreeNode(22);
	     root.right.right = new TreeNode(25);
		BTreePrinter.printNode(root);
		BorderTraversalTree bdr = new BorderTraversalTree();
		bdr.printBoundary(root);
	}
	
	
	public void printBoundary(TreeNode node) 
    {
        if (node != null) 
        {
            System.out.print(node.val + " ");
  
            // Print the left boundary in top-down manner.
            printBoundaryLeft(node.left);
  
            // Print all leaf nodes
            printLeaves(node.left);
            printLeaves(node.right);
  
            // Print the right boundary in bottom-up manner
            printBoundaryRight(node.right);
        }
    }
	
	public void printLeaves(TreeNode root){
		if(root!=null){
			
			printLeaves(root.left);
			
			if(root.left== null && root.right ==null){
				System.out.print(root.val);
			}
			
			printLeaves(root.right);
			
		}
	}
		
		public  void printBoundaryLeft(TreeNode root)
		{
			
			if(root!=null){
				if(root.left!=null){
					 System.out.print(root.val + " ");
					 printBoundaryLeft(root.left);
				} else if(root.right!=null){
					System.out.print(root.val + " ");
					printBoundaryLeft(root.right);
				}
			}
			
		}
		
		
		
		public  void printBoundaryRight(TreeNode root)
		{
			
			if(root!=null){
				if(root.right!=null){					 
					 printBoundaryRight(root.right);
					 System.out.print(root.val + " ");
				} else if(root.left!=null){
					
					printBoundaryRight(root.left);
					System.out.print(root.val + " ");
				}
			}
			
		}
		
		
		
	}


