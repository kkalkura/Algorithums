package sample.assignment.tree.traversal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;
import sample.assignment.tree.TreeNode3;

public class BottomViewOfaTree {
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(8);
		root.right = new TreeNode(22);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(25);
		root.left.right.left = new TreeNode(10);
	    root.left.right.right = new TreeNode(14);
		BTreePrinter.printNode(root);
			
			TreeNode3 root1 = new TreeNode3(20);
			root1.left = new TreeNode3(8);
			root1.right = new TreeNode3(22);
			root1.left.left = new TreeNode3(5);
			root1.left.right = new TreeNode3(3);
			root1.right.left = new TreeNode3(4);
			root1.right.right = new TreeNode3(25);
			root1.left.right.left = new TreeNode3(10);
		     root1.left.right.right = new TreeNode3(14);
			BottomViewOfaTree bottomView = new BottomViewOfaTree();
			bottomView.bottomViewOfTree(root1);

		}
	
	
	public void bottomViewOfTree(TreeNode3 root){
		if(root==null){
			return;
		}
		LinkedList<TreeNode3> travesalqueue = new LinkedList();
		Map<Integer, Integer> map = new TreeMap<>();
		int hd=0;
		root.hd = hd;
		travesalqueue.add(root);
		
		while(travesalqueue.isEmpty()==false){
			TreeNode3 node = travesalqueue.remove();
			hd=node.hd;
		//	System.out.print(node.val);
			map.put(hd, node.val);
			if(node.left!=null){
				node.left.hd = hd-1;
				 travesalqueue.add(node.left);
			}
			if(node.right!=null){
				node.right.hd = hd+1;
				 travesalqueue.add(node.right);
			}
		}
		
		 Set<Entry<Integer, Integer>> set = map.entrySet();
		 
	        // Make an iterator
	        Iterator<Entry<Integer, Integer>> iterator = set.iterator();
	 
	        // Traverse the map elements using the iterator.
	        while (iterator.hasNext())
	        {
	            Map.Entry<Integer, Integer> me = iterator.next();
	            System.out.print(me.getValue()+" ");
	        }
	}
		

	}


