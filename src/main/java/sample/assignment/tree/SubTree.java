package sample.assignment.tree;

public class SubTree {
	
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
	
	}
	
	
	 public boolean isSubtree(TreeNode s, TreeNode t) {
	        if(s==null){
	            return false;
	        }
	        if(isSameTree(s, t)) {
	            return true ;
	        }
	           boolean ls = isSubtree(s.left, t);
	           if(ls){
	               return true;
	           }
	           
	            boolean rs = isSubtree(s.right, t);
	           if(rs){
	               return true;
	           }
	           
	           return false;
	              
	        
	        
	    }
	    
	    
	     public boolean isSameTree(TreeNode node1, TreeNode node2) {
	        if(node1==null && node2==null){
				return true;
			}
			if(node1!=null & node2==null){
				return false;
			}
			if(node1==null & node2!=null){
				return false;
			}
			
			// Pre Order Traversal 
			if(node1.val==node2.val){
				if(isSameTree( node1.left,node2.left)) {
					if(isSameTree( node1.right,node2.right)) {
						return true;
					}
					}
				}
			return false;
			}

}
