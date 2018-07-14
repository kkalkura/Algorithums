package sample.assignment.stack;

import java.util.Stack;

public class MaximumHistogram {
	
	
	public int largestRectangleArea(int[] heights) {
		Stack<Integer> values = new Stack<> ();
		values.push(-1);
		int maxArea=0;
		for(int i=0;i<heights.length;i++){
			while(values.peek()!=-1 && heights[values.peek()]>heights[i]) {
				maxArea = Math.max(maxArea,heights[values.pop()]*(i-values.peek()-1));
			}
			values.push(i);
		}
		
		while(values.peek()!=-1){
			maxArea = Math.max(maxArea,heights[values.pop()]*(heights.length-values.peek()-1));
		}
		return maxArea;
	
	}

}
