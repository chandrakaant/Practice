package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintRecursive {

    public static void printDecreasing(int i) {
        if (i == 0) {
            return;
        }
        System.out.println(i);
        printDecreasing(i - 1);
    }

    public static void printIncreasing(int i) {
        if (i == 0) {
            return;
        }
        printIncreasing(i-1);
        System.out.println(i);
    }

    public static void pdi(int i) {
        if (i == 0) {
            return;
        }
        System.out.println(i);
        pdi(i-1);
        System.out.println(i);
    }

    public static void printArrayUsingRecursionReverse(int[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.println(arr[index]);
        printArrayUsingRecursionReverse(arr, index-1);
    }

    public static void printArrayUsingRecursion(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArrayUsingRecursion(arr, index+1);
    }

    public static int findMaximum(int arr[], int index) {
        if (index == arr.length-1) {
            return arr[index];
        }
        int max = findMaximum(arr, index+1);
        if (max < arr[index]) {
            max = arr[index];
        }
        return max;
    }

    public static int firstOccurrence(int arr[], int num, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == num) {
            return index;
        } else {
           return firstOccurrence(arr, num, index + 1);
        }
    }

    public static int lastOccurrence(int arr[], int num, int index) {
        if (index < 0) {
            return -1;
        }
        if (arr[index] == num) {
            return index;
        } else {
            return firstOccurrence(arr, num, index - 1);
        }
    }

    public static int[] allOccurrence(int arr[], int num, int index, int o) {
        if (index == arr.length) {
            int[] res = new int[o];
            return res;
        }
        if (arr[index] == num) {
            int[] arr0 = allOccurrence(arr, num, index + 1, o+1);
            arr0[o] = index;
            return arr0;
        } else {
            int[] arr1 = allOccurrence(arr, num, index + 1, o);
            return arr1;
        }
    }

}
