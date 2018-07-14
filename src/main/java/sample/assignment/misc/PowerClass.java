package sample.assignment.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerClass {
	public static List<String> powers = new ArrayList<String>();
	public static int bestSplit = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
	    // input string (5^5, 5^1, 5^10)
	    String inp1 = "110000110101101100101010000001011111001";
	    String inp = "10011100011001110001";
	    // calc all powers of 5 that fits in given string
	    for (int pow = 1; ; ++pow) {
	        String powStr = Long.toBinaryString((long) Math.pow(5, pow));
	        if (powStr.length() <= inp.length()) { // can be fit in input string
	            powers.add(powStr);
	        } else {
	            break;
	        }
	    }
	    Collections.reverse(powers); // simple heuristics, sort powers in decreasing order
	    System.out.println(powers);
	    
	    // do simple recursive split
	    split(inp, 0, -1);
	    // print result
	    if (bestSplit == Integer.MAX_VALUE) {
	        System.out.println(-1);
	    } else {
	        System.out.println(bestSplit);
	    }
	}

	
	
	
	public static void split(String inp, int start, int depth) {
	    if (depth >= bestSplit) {
	        return; // can't do better split
	    }
	    if (start == inp.length()) { // perfect split
	        bestSplit = depth;
	        return;
	    }
	    for (String pow : powers) {
	        if (inp.startsWith(pow, start)) {
	            split(inp, start + pow.length(), depth + 1);
	        }
	    }
	}

}
