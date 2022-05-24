package com.HashTable;

import com.Arrays.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHashTable {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        int[] idx = new int[2];

        for(int i=0 ; i<nums.length; i++){
            int rem = target - nums[i];

            if(numsMap.containsKey(rem)){
                idx[0] = i;
                idx[1] = numsMap.get(rem);
                return idx;
            }
            numsMap.put(nums[i],i);
        }

        return idx;
    }


    public static void main(String[] args) {

        int[] nums = new int[] { 2,11,7,15};

        TwoSumHashTable obj = new TwoSumHashTable();
        Arrays.stream(obj.twoSum(nums, 9)).forEach(System.out::println);
    }
}
