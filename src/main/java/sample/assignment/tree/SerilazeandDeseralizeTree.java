package sample.assignment.tree;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SerilazeandDeseralizeTree {
	
	private static final String spliter = ",";
    private static final String NN = "X";
    
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
		//LevelOrderTraversal(root);
		SerilazeandDeseralizeTree ser =new SerilazeandDeseralizeTree();
		System.out.println(ser.seraliazeTree(root));
		System.out.println();
		BTreePrinter.printNode(ser.deseraliazeTree(ser.seraliazeTree(root)));
	
	}
	
	public String seraliazeTree(TreeNode root){
		StringBuilder sb = new StringBuilder();
		buildString(root, sb);
		return sb.toString();
	}
	
	private void buildString(TreeNode root, StringBuilder sb){
		if(root==null){
			sb.append(NN).append(spliter);
		} else {
			sb.append(root.val).append(spliter);
			buildString(root.left,sb);
			buildString(root.right,sb);
		}
		
	}
	
	public TreeNode deseraliazeTree(String data){
		 Deque<String> nodes = new LinkedList<>();
	        nodes.addAll(Arrays.asList(data.split(spliter)));
	        return buildTree(nodes);
		
	}
	
	 private TreeNode buildTree(Deque<String> nodes){
		 String val = nodes.remove();
		 if(val.equals(NN))
		 {
			 return null;
		 } else {
			 TreeNode root = new TreeNode(Integer.valueOf(val));
			 root.left = buildTree(nodes);
			 root.right = buildTree(nodes);
			 return root;
		 }
		  
		 
	 } 
	
	

}
