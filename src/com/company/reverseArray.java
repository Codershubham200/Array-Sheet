package com.company;

public class reverseArray {
    public static String[] reverseString(String[] s) {

        int start=0;
        int end=s.length-1;
        while(start<end){
            String temp=s[start];
            s[start++]=s[end];
            s[end--]=temp;
        }
        return s;
    }

    public static void main(String[] args) {
       String[] s = {"h", "e", "l", "l", "o"};
       String[] x=reverseString(s);
       for (int i=0;i< x.length;i++){
           System.out.print(x[i]+" ");
       }
    }
}
