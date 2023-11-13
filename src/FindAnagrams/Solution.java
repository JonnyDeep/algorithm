package FindAnagrams;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    /**
     * 438 .找到字符串中所有字母异位词
     */
    /**
     * 暴力匹配
     * @param s
     * @param p
     * @return
     */

    public List<Integer> findAnagrams(String s,String p){
        if(s.length()<p.length()) return new ArrayList<>();

        char[] chars = p.toCharArray();
        Arrays.sort(chars);
        String newTemp = new String(chars);
        int index = 0,len = p.length();
        List<Integer> res = new ArrayList<>();
        char[] agrams;
        while (index+len<=s.length()){
            String substring = s.substring(index, index+len);
            agrams = substring.toCharArray();
            Arrays.sort(agrams);
            if(newTemp.equals(new String(agrams))){
                res.add(index);
            }
            index++;
        }
        return res;
    }

    /**
     * sCount[1,1]
     * pCount[1,1]
     * @param args
     */
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        Solution solution = new Solution();
        List<Integer> anagrams = solution.findAnagrams(s, p);
        anagrams.forEach(System.out::println);
    }

}
