package sample.dynamicprograming;

public class Recursion {
	
	public static void main(String[] arguments){
		System.out.println("Inside the method");
		printRecuTable(10,10);
	}
	
	public static void printTable(int n){
		for(int i=1;i<=10;i++){
			System.out.printf("%d * %d = %d\n",n,i,(n*i));
		}
	}
	
	
	public static void printRecuTable(int n,int i){
		if(i==0){
			return;
		}
		 i = i-1; 
		 printRecuTable(n, i);
		System.out.printf("%d * %d = %d\n",n,i,(n*i));
	
		
		
	}

}
