package com.java.corejavapractice;

import java.util.Arrays;

public class Moveallzerostotheendofthearray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 4, 6, 0, 4, 0, 9, 0};
        int nz = 0;
        int z = 0;
        while (nz < arr.length) {
            if (arr[nz] != 0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
