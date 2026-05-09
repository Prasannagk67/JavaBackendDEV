package com.java.corejavapractice;

import java.util.Arrays;

public class Removeduplicatesfromasortedarray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,6,6,7,7,8};
        int j=0;
        arr[j++] = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] != arr[i-1]){
                arr[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Not Optimal WIth Extra Arr");
        int[] arr2 = {1,1,2,2,3,3,4,5,6,6,7,7,8};
        int[] tempArr = new int[arr2.length];
        int k = 0;
        tempArr[k]=arr2[0];
        for (int i=1;i<arr2.length;i++){
            if (tempArr[k]!=arr2[i]){
                k++;
                tempArr[k]=arr2[i];
            }
        }
        System.out.println(Arrays.toString(tempArr));
    }
}
