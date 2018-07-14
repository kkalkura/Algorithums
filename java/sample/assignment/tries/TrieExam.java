package sample.assignment.tries;

import sample.assignment.tries.Trie.TrieNode;

public class TrieExam {
	
	public static final int ALPHABET_SIZE = 26;
	public static void main(String[] args){
		System.out.println("Inside Main");
		
	}
	
	static class TrieNode {
		TrieNode[] children = new TrieNode[ALPHABET_SIZE];
		boolean isEndofWord = false;
		public TrieNode() {
			isEndofWord=false;
			for(int i=0;i<ALPHABET_SIZE;i++){
				children[i] =null;
			}
		}
	};
	
	static TrieNode root;
	
	static void free(TrieNode root){
		root = null;
	}
	
	 private boolean isitFreeNode(TrieNode node){
		for(int i=0 ;i<ALPHABET_SIZE;i++){
			if(node.children[i]!=null) {
				return false;
			}
					
		}
		return true;
	}
	
	
	public void deleteNode(String s){
		int length = s.length();
		TrieNode pCrwal = root;
		if(length>0){
			 deleteHelper(pCrwal,s,0,length);
		}
	}
	
	
	private boolean deleteHelper(TrieNode node ,String s , int level , int length){
		
		// Base case 
		
		if(level==length){
			if(node.isEndofWord==true){
				node.isEndofWord =false;
			}
			if(isitFreeNode(node)){
				return true;
			}
			return false;
			
		} else {
			int index = s.charAt(level)-'a';
			if(deleteHelper(node.children[index] ,s , level+1 , length)){
				free(root.children[index]);
				return (!(isItLeafNode(root) && isitFreeNode( root)));
			}
			
		}
		return false;
	}
	
	
	public void insert(String value){
	
		int length = value.length();
		TrieNode pCrwal = root;
		for(int i=0;i<length;i++){
			int index = value.charAt(i)-'a';
			if(pCrwal.children[index]==null){
				pCrwal.children[index] = new TrieNode();
			}
			pCrwal = root.children[index];
		}		
		pCrwal.isEndofWord = true;
	}
	
	public boolean search(String value){
		int length = value.length();
		TrieNode pCrwal = root;
		for(int i=0;i<length;i++){
			int index = value.charAt(i)-'a';
			if(pCrwal.children[index]==null) {
				return false;
			}
			pCrwal = root.children[index];
		}
		if(pCrwal==null || pCrwal.isEndofWord== true ){
			return true;
		}
		
		return false;
	}
	

	
	static private boolean isItLeafNode(TrieNode node){
		if(node.isEndofWord){
			return true;
		} else {
			return false; 
		}
	}

}
