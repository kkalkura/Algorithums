package sample;

/**
 * Created by karthikkalkur on 25/09/17.
 */
public class Solution {


    public static int[] twoSum(int[] numbers, int target) {
        int[] results = {0, 0};
        if (numbers == null) {
            return null;
        }
        int counter = numbers.length;


        for (int i = 0; i < counter - 1; i++) {
            int secondvalue = target - numbers[i];
            for (int j = i + 1; j < counter; j++) {
                if (numbers[j] == secondvalue) {
                    results[0] = i + 1;
                    results[1] = j + 1;
                    break;
                }
            }

        }

        return results;

    }


    public static void main(String[] args) {
        System.out.println("Inside the main class");
        int[] numbers = {2, 3};
        int[] results = twoSum(numbers, 6);
        System.out.println("results" + results[0] + results[1]);
    }
}
