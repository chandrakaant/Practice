import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.SelectionSort;

public class Main {

    public static void main (String[] args) {
        int[] arr = {5,4,6,2,1,7};
        System.out.println("Unsorted array");
        printArray(arr);
        System.out.println("Sorted array");
        printArray(SelectionSort.selectionSort(arr));
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}
