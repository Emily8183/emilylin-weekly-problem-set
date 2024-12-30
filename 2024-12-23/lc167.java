/*
 * condition: int[] numbers, non-decreasing order;
 * goal: find two numbers, sum == target, numbers[index1] < numbers[index2]
 * req: constant extra space
 * 
 * solution:
 * 1, two pointers, numbers[left] + numbers[right], adjust left or right
 * 2, add the indice to a new array
 */

public class lc167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        int[] result = new int[2];

        while (left <= right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
        }

        return result;


    }
    
}