package sample.assignment.tree.traversal.test;

import java.util.ArrayList;
import java.util.List;

import sample.assignment.tree.TreeNode;

public class roottoPathSum {
	
	
public List<List<Integer>> pathSum(TreeNode root, int sum) {
		
		List<List<Integer>>res = new ArrayList();
		 ArrayList<Integer> path = new ArrayList();
		  DFS( root,res,sum,path);
		  return res;
        
	}
	
	
	public void DFS(TreeNode root,List<List<Integer>>  results, int sum,  ArrayList<Integer> path){
		if(root==null){
			return;
		}
		 path.add(root.val);
		
		if(root.left==null && root.right ==null && sum == root.val){
			results.add(new ArrayList<Integer>(path));
		}
			DFS(root.left,results, sum-root.val,   path);
			DFS(root.right,results, sum-root.val,   path);
			path.remove(path.size() - 1);
		}
    

}
