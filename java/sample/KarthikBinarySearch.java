package sample;


import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by karthikkalkur on 02/09/17.
 */
public class KarthikBinarySearch {

    public static void main(String[] args) {
        // read the integers from a file

    //    In in = new In(args[0]);
  //      int[] whitelist = in.readAllInts();

          int[] whitelist = new int[]{1, 5, 7, 9, 38, 44};

        // sort the array
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch.indexOf(whitelist, key) == -1)
                StdOut.println(key);
        }
    }


    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;


    }
}


