/*
 * condition: n pairs of parrentheses
 * solution: backtracking
 * 1，set up ArrayList<>() and List<>();
 * 2, end point: list.size() == n
 * 3, paremeter, 
 */

 class Solution {

    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtracking("", n, n);
        return result;
    
    }

    public void backtracking(String path, int leftNum, int rightNum) {
        if (leftNum == 0 && rightNum == 0) {
            result.add(path);
            return;
        }

        if (leftNum > 0) {
            backtracking(path + "(", leftNum-1, rightNum);
        }

        if (leftNum < rightNum) {
            backtracking(path + ")", leftNum, rightNum-1);
        }
        
    
    }
}
