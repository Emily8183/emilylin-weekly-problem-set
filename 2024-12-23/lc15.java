/*
 * condition: int[] nums;
 * goal: return all the triplets in the sum of 0
 * req: no duplicated sets
 * key points: how to make sure no duplicated a, b, or c
 */

public class lc15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> list = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if ( sum > 0) right--;
                else if (sum < 0) left++;
                else {
                    result.add()
                }   //add to the list


            //skip the duplicated left and right

            }


            


            

        }

    }

    
}
