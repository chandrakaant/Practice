package sorting;

/**
 * Bubble Sort is the simplest
 * sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 */
public class BubbleSort {

    public static int [] bubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
