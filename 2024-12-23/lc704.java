/*
 * condition: int[] nums, ascending order; int target
 * goal: a function to search the target in int[] nums; return the index otherwise return -1
 * requirement: O(log n) (can't interate the entire array)
 * solution: binary search
 * time complexity: O(logN), memory O(1)
 */

public class lc704 {

    public int search(int[] nums, int target) {

        if (nums.length == 0) return -1;

        if (nums.length == 1 && nums[0] == target) return 0;
        
        //for loop: [)
        int left = 0;
        int right = nums.length;

        while (left < right ) { 
            int middle = left + ((right - left) /2);

            if(nums[middle] < target) {
                left = left + 1;
            } else if (nums[middle] > target) {
                right = middle;
            } else if (nums[middle] == target) {
                return middle;
            } 
        }

        return -1;


    }
}
    


    

