package sample.assignment.linkedin;

public class PerfectSquare {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		isPerfectSquare1(340);
	}
	
	public boolean isPerfectSquare(int num) {
	     int i = 1;
	     while (num > 0) {
	         num -= i;
	         i += 2;
	     }
	     return num == 0;
	 }
	
	public static boolean isPerfectSquare1(int num) {
        int low = 1, high = num;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }

}
