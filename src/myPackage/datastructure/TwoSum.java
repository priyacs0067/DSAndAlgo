package myPackage.datastructure;

import java.util.Hashtable;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        int[] indices = new int[2];

        //populate table
        for(int i=0 ;i < nums.length;i++){
            if(hashtable.containsKey(target-nums[i])){
                indices[0] = i;
                indices[1] = hashtable.get(target-nums[i]);
                break;
            }
            hashtable.put(nums[i],i);
        }
        return indices;
    }


    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;

        int[] result = twoSum(arr,target);
        System.out.println(result[0] +" , "+result[1]);
    }
}
