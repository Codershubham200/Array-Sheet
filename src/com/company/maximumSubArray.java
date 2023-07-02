package com.company;

public class maximumSubArray {
    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(maxSum<sum){
                maxSum=sum;
            }if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int k=maxSubArray(nums);
        System.out.println(k);
    }
}
