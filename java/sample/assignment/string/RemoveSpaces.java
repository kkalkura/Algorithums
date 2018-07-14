package sample.assignment.string;

public class RemoveSpaces {
	
	public static void main(String[] arguments){
		System.out.println("Inside main");
		String sample = "geek for geek ddkd          ";
		System.out.println(removeSpaces(sample.toCharArray()));
	}
	
	
	public static char[] removeSpaces(char[] str)
	{
	    // To keep track of non-space character count
	    int count = 0;
	 
	    // Traverse the given string. If current character
	    // is not space, then place it at index 'count++'
	    for (int i = 0; i<str.length-1; i++) {
	        if (str[i] != ' ')
	            str[count++] = str[i]; // here count is
	                                   // incremented
	    }

	    return str;
	}

}
