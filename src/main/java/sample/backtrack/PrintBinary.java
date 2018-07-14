package sample.backtrack;

public class PrintBinary {
	
	public static void main(String[] args){
		System.out.println("Main");
		printBinary(3);
	}
	
	
	public static void printBinary(int digits){
		printBinary(3,"");
	}
	
	public static void printBinary(int digits, String prefix){
		System.out.println("printBinary"+"("+digits+","+prefix+")");
		if(digits==0){
			System.out.println(prefix);
		} else {
			printBinary(digits-1,prefix+"0");
			printBinary(digits-1,prefix+"1");
			
		}
	}

}
