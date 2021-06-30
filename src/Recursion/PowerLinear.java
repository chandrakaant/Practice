package Recursion;

public class PowerLinear {

    public static int getPower(int x, int n) {
        if (n == 1) {
            return x;
        }
        int p = getPower(x, (n - 1));
        return x*p;
    }
}
