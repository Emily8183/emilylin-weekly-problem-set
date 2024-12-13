public class lc238_product_of_array {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        result[0] = 1;

        int cur = result[0];

        for (int i = 0; i < nums.length; i++) {
            result[i] = cur;
            cur *= nums[i];
        }
        
        /*
        int[] nums = {1,2,3,4};
                i  =  0,1,2,3
        int[] resu = {1,1,2,6}
                cur  =  1,2,6,24    
        */

        cur = 1; 

        for (int i = nums.length-1; i >= 0; i--) {
            result[i] *= cur;
            cur *= nums[i];
        }

            /*
        int[] nums = {1,2,3,4};
                i  =  0,1,2,3;
        int[] resu1 = {1,1,2,6}
        int[] resu2 = 24,12,8,6}
                cur = 24,24,12,4   
        */

        return result;
        
    }

        
}