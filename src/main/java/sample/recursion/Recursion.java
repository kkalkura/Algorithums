package sample.recursion;

public class Recursion {

    public static void main(String[] args){
        System.out.println("Inside Main");
        Print2(5);
    //    toBinary(45);

     //  System.out.println("The value of N"+ power(5, 5));
    }

    public static void Print1(int n){
        if(n==0){
            return;
        }
        System.out.println(n+" ");
        Print1(n-1);
    }
    
    public static int factorial(int n){
    	if(n==0){
    		return 1;
    	}
    	
    	return n*factorial(n-1);
    }
    
    
    
    
    public static void Print2(int n){
        if(n==0){
            return;
        }
      
        Print2(n-1);
        System.out.println(n+" ");
    }
    
    

    public static void toBinary(int n){
        if(n==0) {
            return;
        }
        toBinary(n/2);
        System.out.print(n%2);
}

public static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        int result = x * power(x,n-1);
        return result;
}
}
