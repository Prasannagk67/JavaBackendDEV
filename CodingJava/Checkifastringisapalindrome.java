package com.java.corejavapractice;

public class Checkifastringisapalindrome {
    public static void main(String[] args) {
        String pal = "asa";
        int l = 0;
        int r = pal.length()-1;
        while (l<r){
            if (pal.charAt(l)!=pal.charAt(r)){
                System.out.println("Not Palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("Palindrome");
    }
}
