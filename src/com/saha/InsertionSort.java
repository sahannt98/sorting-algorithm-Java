package com.saha;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr){
        int len = arr.length;
        for(int i = 0; i<len; i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 10, -3, 12};
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
