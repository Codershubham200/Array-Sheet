package com.company;

public class rotateArray {
    public static int[] rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        return nums;
    }
    private static void reverse(int nums[],int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }

    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=2;
        int arr[]=rotate(nums,2);
        for (int i=0;i< arr.length;i++){
            System.out.print(+arr[i]+" " );
        }
    }
}
