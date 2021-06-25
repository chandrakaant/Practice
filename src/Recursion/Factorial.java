package Recursion;

public class Factorial {

    public static int printFactorial(int i) {
        if (i == 1) {
            return 1;
        }
        int f = printFactorial(i - 1);
        return i * f;
    }
}
