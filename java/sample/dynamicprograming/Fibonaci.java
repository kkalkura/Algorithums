package sample.dynamicprograming;

public class Fibonaci {
	static int Size =100;
	static int[] lookup = new int[Size];
	public static void main(String[] argument){
		System.out.println("Inside main");
		int i;
	
		
		for(i=0;i<Size;i++){
			lookup[i]= -1;
		}
		
		System.out.println(fibonaci(7));
		System.out.println(fibonacibootomUp(7));
		
		
	}
	
	
	private static int fibonaci(int n) 
	{
		if(lookup[n]==-1){
			if(n<=1){
				lookup[n]=n;
			} else {
				lookup[n]= fibonaci(n-1)+ fibonaci(n-2);
			}
			
			
		}
		return lookup[n];
		
	}
	
	
	private static int fibonacibootomUp(int n) 
	{
		lookup[0]=0;
		lookup[1]=1;
		int i;
		for(i=2;i<=n ; i++) {
			lookup[i] = lookup[i-1]+ lookup[i-2];
		}
		return lookup[n];
		
	}
	
	
	
	
}
