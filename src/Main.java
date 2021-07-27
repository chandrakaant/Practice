import Recursion.GetStairPath;
import Recursion.KeyBoardSequence;
import Recursion.StringSubsequence;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main (String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        int[] arr1 = {2,4,3,8};
        String str = "12305";
        System.out.println(GetStairPath.getStairsPath(4));
        //printArray(StringSubsequence.getSubsequences("abc").toArray());
    }

    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("");
    }
}
