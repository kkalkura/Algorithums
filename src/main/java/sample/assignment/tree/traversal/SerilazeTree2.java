package sample.assignment.tree.traversal;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class SerilazeTree2 {
	 private static final String spliter = ",";
	    private static final String NN = "X";
	
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
	
	}
	
	 public String serialize(TreeNode root) {
		 StringBuilder sb = new StringBuilder();
		 buildString(root, sb);
		return sb.toString();
	 }
	       
	    
	
	private void buildString(TreeNode node, StringBuilder sb) {
		if(node==null){
			sb.append(NN).append(spliter);
		} else {
			sb.append(node.val).append(spliter);
			buildString(node.left, sb);
			buildString(node.right, sb);
		}
	}
        
    
	
	public TreeNode deserialize(String data) {
		 Deque<String> nodes = new LinkedList<>();
		 nodes.addAll(Arrays.asList(data.split(spliter)));
		 return buildTree(nodes);
    }
    
    private TreeNode buildTree(Deque<String> nodes) {
    	  String val = nodes.remove();
          if (val.equals(NN)) return null;
          else {
        	  TreeNode root = new TreeNode(Integer.valueOf(val));
        	  root.left = buildTree(nodes);
        	  root.right = buildTree(nodes);
        	  return root;
          }
    }   
}


