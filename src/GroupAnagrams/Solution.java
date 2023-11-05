package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    /*
    49. 字母异位词分组
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> orDefault = map.getOrDefault(key ,new ArrayList<>());
            orDefault.add(str);
            map.put(key,orDefault);
        }
        List<List<String>> res = new ArrayList<>();
        map.values().forEach(elem->res.add(elem));
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = s.groupAnagrams(strs);
        for (List<String> list : lists) {
            list.forEach(System.out::print);
            System.out.println();
        }

    }
}
