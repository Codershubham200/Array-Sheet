package com.company;

public class MissingNumber {

    public static void main(String[] args) {
	// write your code here
        int arr[]={3,2,0,1};
        int n=arr.length;
       int ans=n*(n+1)/2;
       for (int i:arr){
           ans-=arr[i];
       }
        System.out.println(ans);
    }
}
