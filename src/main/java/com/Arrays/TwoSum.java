package com.Arrays;

import java.util.Arrays;

// Easy https://leetcode.com/problems/two-sum/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

            int[] idx = new int[2];

            for(int i=0 ; i< nums.length ; i++){

                for(int j= i+1 ; j< nums.length ; j++){  // O(n^2) complexity
                    if( nums[i]+ nums[j] == target){
                        idx[0] = i;
                        idx[1] = j;
                    }
                }
            }
        return idx;
    }

    public static void main(String[] args) {

        int[] nums = new int[] { 2,11,7,15};

        TwoSum obj = new TwoSum();
        Arrays.stream(obj.twoSum(nums, 9)).forEach(System.out::println);


    }
}
