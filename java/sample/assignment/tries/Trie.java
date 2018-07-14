package sample.assignment.tries;

public class Trie {
	
	static final int ALPHABET_SIZE =26;
	
	static class TrieNode {
		TrieNode[] children = new TrieNode[ALPHABET_SIZE];
		boolean isEndOfWord;
		TrieNode() {
			isEndOfWord=false;
			for(int i=0;i<ALPHABET_SIZE;i++){
				children[i] =null;
			}
		}
	};
	static TrieNode root;
	
	static void insert(String key){
		int level;
		int length = key.length();
		int index ;
		TrieNode pCrawl = root;
		for(level=0;level<length;level++){
			index = key.charAt(level)-'a';
			if(pCrawl.children[index]==null){
				pCrawl.children[index]= new TrieNode();
			}
			pCrawl = pCrawl.children[index];
		}
		pCrawl.isEndOfWord=true;
		
	}
	
	static private boolean isItLeafNode(TrieNode node){
		if(node.isEndOfWord){
			return true;
		} else {
			return false; 
		}
	}
	static void deleteKey(TrieNode node, String key){
		int length = key.length();
		if(length>0){
			deletehelper( Trie.root, key ,0 ,  length);
		}
	}
	
	static void free(TrieNode root){
		root = null;
	}
	
	static boolean deletehelper(TrieNode root, String key , int level , int length){
		if(root!=null){
			// base case
			if(level==length){
				if(root.isEndOfWord==true){
					root.isEndOfWord =false;
				}
				
				if(isitFreeNode(root)){
					return true;
				}
				return false;
			} else //recursive case 
			{
				int index = key.charAt(level)-'a';
				if(deletehelper(root.children[index], key , level+1 , length)){
					
					free(root.children[index]);
					
					return (!(isItLeafNode(root) && isitFreeNode( root)));
				}
			}
			
		}
		return false;
	}
	
	static private boolean isitFreeNode(TrieNode node){
		for(int i=0;i< ALPHABET_SIZE;i++){
			if(node.children[i]!=null){
				return true;
			}
		}
		return false;
	}
	
	static boolean search(String key)
	{
		int level;
		int length = key.length();
		int index;
		TrieNode pCrawl = root;
		
		for(level=0;level<length;level++){
			index = key.charAt(level)-'a';
			if(pCrawl.children[index]==null){
				return false;
			}
			pCrawl = pCrawl.children[index];
			
		}
		return (pCrawl!=null & pCrawl.isEndOfWord);
	}

}
