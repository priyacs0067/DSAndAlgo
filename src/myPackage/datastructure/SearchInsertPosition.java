package myPackage.datastructure;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        for(int i = 0 ;i < nums.length ;i ++){
            if(target == nums[i]){
                return i;
            }else if(i+1 < nums.length && target > nums[i] && target < nums[i+1]){
                return i+1;
            }else if(target < nums[i]){
                return i;
            }
        }
        return  nums.length;
    }

    public static int searchInsertBinarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }



    public static void main(String[] args) {

        int[] nums = {1,3,5};
        int target = 2;

        System.out.println(searchInsertBinarySearch(nums,target));
    }
}
