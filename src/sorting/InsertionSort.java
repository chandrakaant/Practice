package sorting;

/**
 * Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
 * The array is virtually split into a sorted and an unsorted part.
 * Values from the unsorted part are picked and placed at the correct position in the sorted part.
 */
public class InsertionSort {

    public static int [] insertionSort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
