package myPackage.datastructure;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = m, j = 0; i < m + n; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = { 1,2,3,0,0,0};
        int[] nums2 = { 2,5,6};

        merge(nums1,3,nums2,3);
        for (int i: nums1) {
            System.out.print(i +" ");
        }
    }
}
