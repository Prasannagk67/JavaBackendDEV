package com.java.corejavapractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Findifapairwithgivensumexistsinasortedarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 4, 5, 6, 71, 8, 9, 10};
        int[] arrSorted = {1,2,3,4,5,6,7,8,9};
        System.out.println("ARRAY" + Arrays.toString(arr));
        System.out.println("SORTED ARRAY" + Arrays.toString(arrSorted));
        int target = 9;
        System.out.println(Arrays.toString(twoSum1(arr, target)));
        System.out.println(Arrays.toString(twoSum2(arr, target)));
        System.out.println(Arrays.toString(twoSum3(arr, target)));
        System.out.println(Arrays.toString(twoSum4(arr, target)));
        System.out.println(Arrays.toString(sortedTwoSum(arrSorted, target)));
    }

    private static int[] twoSum1(int[] arr, int target) {
        System.out.println("BRUIT FORCE");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{};
    }

    private static int[] twoSum2(int[] arr, int target) {
        System.out.println("BRUIT FORCE +1");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{};
    }

    private static int[] twoSum3(int[] arr, int target) {
        System.out.println("Hashing");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = target - arr[i];
            if (map.containsKey(b)) {
                return new int[]{b, a};
            } else {
                map.put(a, i);
            }
        }
        return new int[]{};
    }

    private static int[] twoSum4(int[] arr, int target) {
        System.out.println("Hashing +1");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int b = target - arr[i];
            if (map.containsKey(b)) {
                return new int[]{b, arr[i]};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }

    private static int[] sortedTwoSum(int[] arr, int target) {
        System.out.println("SORTED ARRAY");
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) {
                return new int[]{arr[l], arr[r]};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{};
    }
}
