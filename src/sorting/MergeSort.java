package sorting;

public class MergeSort {

    public static int[] mergeSort(int[] arr, int lo, int hi){
        //define base case
        //if hi and lo are same it means that we are down to one element array
        if (hi == lo) {
            int[] res = new int[1];
            res[0] = arr[lo];
            return res;
        }

        // first calculate mid
        int mid = (hi + lo) / 2;
        int[] a = mergeSort(arr, lo, mid);
        int[] b = mergeSort(arr, mid + 1, hi);
        return mergeSortedArrays(a, b);
    }

    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
                k++;
            } else {
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) { //run loop for remaining elements in a array and add them to res without comparing
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) { //run loop for remaining elements in b array and add them to res without comparing
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }

}
