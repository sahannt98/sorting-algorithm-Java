package com.saha;

import java.util.Arrays;

public class SelectionSort {

    public  static void sort(int[] arr){
        int len = arr.length;
        for(int i = 0; i<len-1; i++){
            int min_idx = i;
            for(int j = i+1; j<len; j++){
                if(arr[min_idx] > arr[j])
                    min_idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 10, -3, 12};
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
