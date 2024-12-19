/*
 * goal: boolean, valid palindrome
 * solution1: 
 * 1 remove all the space: \\s, skip all the non-alphanumeric characters
 * 2 helper function
 * Time and space complexity: O(N);
 * 
 * 
 */

class Solution {

    //solution 1
    // public boolean isPalindrome(String s) {
    //     String trimmed = s.replaceAll("\\s","");

    //     char[] arr = trimmed.toCharArray();

    //     StringBuilder sb = new StringBuilder();

    //     for (int i = 0; i < arr.length; i++) {
    //         char c = arr[i];
            
    //         if (Character.isLetterOrDigit(c)) {
    //             sb.append(Character.toLowerCase(c));
    //         }
    //     }

    //     String newStr = sb.toString();

    //     boolean result = helper(newStr, 0, newStr.length()-1);

    //     return result;

 
    // }

    // private boolean helper(String s, int i, int j) {
    //     while (i <= j) {

    //         if (s.charAt(i) != s.charAt(j)) return false;

    //         i++;
    //         j--;

    //     }

    //     return true;
    // }

    //solution 2: two pointers, benefit: the space complexity is O(1), time complexity remains as O(n)
    public boolean isPalindrome(String s) {

        // String str = s.replaceAll("\\s",""); 《= no need

        int left = 0;

        int right = s.length() - 1;

        while (left < right) {

            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) { 
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }
}
    

