package com.saha;

import java.util.Arrays;

public class QuickSort {

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public  static int partition(int[] arr, int low, int high){
        int pivot = arr[low];

        int i = low;
        int j = high;

        while(i<j) {
            while (arr[i] <= pivot)

                i++;
            while (arr[j] > pivot)
                j--;
            if(i<j)
                swap(arr, i, j);
        }
        swap(arr,low, j);
        return j;
    }

    static void sort(int[] arr, int low, int high){
        if(low<high){
            int j = partition(arr, low, high);
            sort(arr, low, j);
            sort(arr, j+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 10, -3, 12};
        int low = 0;
        int high = arr.length - 1;
        QuickSort.sort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
}
