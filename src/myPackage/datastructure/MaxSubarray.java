package myPackage.datastructure;

import java.math.BigInteger;

public class MaxSubarray {

    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int length = nums.length;
        int sumSoFar = 0;

        for(int i = 0;i <length;i++){
            sumSoFar = sumSoFar+nums[i];
            if(sumSoFar>max)
                max = sumSoFar;
            if(sumSoFar <0)
                sumSoFar=0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
