import Recursion.KeyBoardSequence;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main (String[] args) {
        int[] arr = {7,5,9,1,2,4,3,8,5};
        int[] arr1 = {2,4,3,8};
        String str = "12305";
        System.out.println(KeyBoardSequence.keySeq(str));
        //printArray(StringSubsequence.getSubsequences("abc").toArray());
    }

    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("");
    }
}
