package Recursion;

public class TowerOfHanoi {

    public static void toh(int n, int a, int b, int c) {
        if (n == 0) {
            return;
        }
        toh(n - 1, a, c, b);
        System.out.println("Move disk "+ n + " from rod " +
                a +" to rod " + b );
        toh(n-1, c, b , a);
    }
}
