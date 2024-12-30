/*
 * condition: int[] height, int length = n;
 * goal: the maximum of space
 * solution: two pointers
 * always move the shorter bar, which brings more potential to find a higher bar
 */

 class Solution {
    public int maxArea(int[] height) {
        int maxSize = 0;

        int left = 0;
    
        for (int right = height.length-1; right > 0; right--) {
            while (left < right) {
                int length = right - left;
                int width = Math.min(height[right], height[left]);
                
                int size = length * width;
    
                maxSize = Math.max(maxSize, size);

                if (height[left] > height[right]) right--;
                else left++; 
            }
           
        }

        return maxSize;

    }
    
}
