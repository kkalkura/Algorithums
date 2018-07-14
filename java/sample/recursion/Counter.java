package sample.recursion;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Counter {
	
	public static void main(String[] args){
		
		 Scanner in = new Scanner(System.in);
	        int entered = in.nextInt();
	        int value = 3;
	        int prevalue =0;
	        int preterm =0;
	        int term =1;
	        while(true){
	        	prevalue = value;
	        	preterm = term;
	        	value = value * 2; 
	        	term = prevalue+ term;
	        	System.out.println("term name "+ term);
	        	System.out.println("value name "+ value);
	        	System.out.println("prevalue name "+ prevalue);
	        	System.out.println("Preterm name "+ preterm);
     		   
	        			        		   
	        	if(entered <= term){
        			break;
        		}
	        		
	        		}
	        		if(entered==term){
	        			System.out.println(value);
	        		} else {
	        			int arrayvalue = prevalue - (entered-preterm);
	        			System.out.println(arrayvalue);
	        		}
	        		
	        		
		
	}

}
