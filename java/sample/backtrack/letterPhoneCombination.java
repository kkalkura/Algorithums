package sample.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class letterPhoneCombination {

  public static void main(String[] arguments){
	  System.out.println("Inside main");
	  letterPhoneCombination lt = new letterPhoneCombination();
	 List<String>  result = lt.letterCombinations("23");
	 System.out.println(result);
  }
	
	public  List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0)
			return new ArrayList<String>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "");
		map.put(1, "");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		List<String> result = new ArrayList<String>();
		StringBuffer s = new StringBuffer();
		backTracking(digits, result, s, 0, map);
		return result;
	}
	
	private void backTracking(String digits,List<String> result,StringBuffer s , int Start, HashMap<Integer, String> map ){
		if(Start== digits.length()){
			result.add(s.toString());
		}else{		
		String tmp = map.get(digits.charAt(Start)-'0');
		for(int i=0;i<tmp.length();i++){
			s.append(tmp.charAt(i));
			backTracking(digits,result,s,Start+1,map);
			s.deleteCharAt(s.length()-1);
		}
		
	}
	}
}
