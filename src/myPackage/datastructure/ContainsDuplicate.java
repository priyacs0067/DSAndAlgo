package myPackage.datastructure;

import java.util.Hashtable;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for(int i: nums){
            if(hashtable.containsKey(i)) {
                hashtable.put(i, hashtable.get(i) + 1);
                if(hashtable.get(i)>=2)
                    return true;
            }
            else
                hashtable.put(i,1);
        }
        return false;
    }

    public static void main(String[] args) {
       int[] nums = new int[] {3,3};
        System.out.println(containsDuplicate(nums));
    }
}
