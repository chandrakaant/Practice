import Recursion.Factorial;
import Recursion.PrintRecursive;
import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.MergeSort;
import sorting.SelectionSort;

public class Main {

    public static void main (String[] args) {
        int[] arr = {7,5,9,1,2,4,3,8};
        int[] arr1 = {2,4,3,8};
        //System.out.println("Unsorted array");
        //printArray(arr);
        //call function here
        System.out.println(Factorial.printFactorial(5));
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}
