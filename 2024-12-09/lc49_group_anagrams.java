/* goal: group the anagrams
"rat", "tar" => ["rat","tar"] 
List<List<String>> result = new ArrayList<>();

solution: 
1, convert each str to a num, save into a hashmap: key - number; value - str
2, for loop: if (return true) add to the index; else add new list
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class lc49_group_anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        //corner case
        if (strs.length == 0 || strs == null) return new ArrayList<>();

        List<List<String>> result = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String element = convert(strs[i]);

           map.putIfAbsent(element, new ArrayList<>());
           map.get(element).add(strs[i]);
          
        }

        result.addAll(map.values());

        return result;
    }

    private String convert(String str) {
        int[] digits = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            digits[letter - 'a']++;
        }

        return Arrays.toString(digits);


    }
}
    
