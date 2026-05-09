package com.java.corejavapractice;

import java.util.Arrays;

public class ReversetheWordsinStrungWIthReverseofEachwordalso {
//    public static void main(String[] args) {
//        String s = "Hello World";
//        String[] ss = s.split(" ");
//        int l = 0;
//        int r = ss.length - 1;
//        while (l < r) {
//            String temp = ss[r];
//            ss[r] = ss[l];
//            ss[l] = temp;
//            l++;
//            r--;
//        }
//        for (int i = 0; i < ss.length; i++) {
//            char[] c = ss[i].toCharArray();
//            int ll = 0;
//            int rr = c.length - 1;
//            while (ll < rr) {
//                char tem = c[rr];
//                c[rr] = c[ll];
//                c[ll] = tem;
//                ll++;
//                rr--;
//            }
//            ss[i] = new String(c);
//        }
//        System.out.println(String.join(" ", ss));
//    }


    public static void main(String[] args) {
        String s = "Hello World";
        char[] ss = s.toCharArray();
        reverse(ss, 0, s.length() - 1);

        int start = 0;

        for (int i = 0; i <= ss.length; i++) {
            if (i == ss.length || ss[i] == ' ') {
                reverse(ss, start, i - 1);
                start = i + 1;

            }
        }


        System.out.println(Arrays.toString(ss));
    }

    public static void reverse(char[] ss, int l, int r) {
        while (l < r) {
            char temp = ss[r];
            ss[l] = ss[r];
            ss[r] = temp;
            l++;
            r--;
        }
    }
}
