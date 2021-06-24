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
}
