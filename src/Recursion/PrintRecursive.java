package Recursion;

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

}
