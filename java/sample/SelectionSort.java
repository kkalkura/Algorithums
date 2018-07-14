package sample;

import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdOut;

import java.util.Comparator;

/**
 * Created by karthikkalkur on 03/09/17.
 */
public class SelectionSort {


    public static void exchange(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


    private static void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (less(a[j], a[min])) min = j;

            }
            exchange(a, i, min);
        }

    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 45, 77, 888};
        Selection.sort(a);
        show(a);
    }

    private static boolean less(Comparator c, Object v, Object w) {
        return c.compare(v, w) < 0;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    // print array to standard output
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

}
