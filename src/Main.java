import Recursion.PrintRecursive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        int[] arr = {7,5,9,1,2,4,3,8,5};
        int[] arr1 = {2,4,3,8};
        printArray(PrintRecursive.allOccurrence(arr, 5, 0, 0));
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}
