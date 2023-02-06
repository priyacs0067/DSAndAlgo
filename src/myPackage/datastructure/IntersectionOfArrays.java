package myPackage.datastructure;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class IntersectionOfArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {

        int l1 = nums1.length;
        int l2 = nums2.length;

        List<Integer> resultAsList = new ArrayList<>();

        Hashtable<Integer,Integer> t1 = new Hashtable<>();
        Hashtable<Integer,Integer> t2 = new Hashtable<>();

        // populate table 1
        for(int i = 0; i< l1; i++){
            if (t1.containsKey(nums1[i])){
                int count =t1.get(nums1[i]);
                t1.put(nums1[i],count+1);
            }else {
                t1.put(nums1[i],1);
            }
        }

        // populate table 2
        for(int i = 0; i< l2; i++){
            if (t2.containsKey(nums2[i])){
                int count =t2.get(nums2[i]);
                t2.put(nums2[i],count+1);
            }else {
                t2.put(nums2[i],1);
            }
        }

        for (int i: t1.keySet()) {
            if(t2.containsKey(i)){
                // compare the count of occurrences in both hash tables
                int minOccurrence = Math.min(t1.get(i), t2.get(i));
                // add key into list minOccurrence times
                for(int k = 0;k < minOccurrence;k++){
                    resultAsList.add(i);
                }
            }
        }
        int[] resultAsArray = new int[resultAsList.size()];
        // populate array
        for(int i = 0 ;i < resultAsList.size();i++){
            resultAsArray[i] = resultAsList.get(i);
        }

        return resultAsArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] result = intersect(nums1, nums2);
        CommonUtils.printArray(result);
    }
}
