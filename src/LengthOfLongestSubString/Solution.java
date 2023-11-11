package LengthOfLongestSubString;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    /**
     * 3.最长无重复字串
     * 滑动窗口
     *
     * 1、定义left、right、besetResult、esult;
     * while(右指针没有到结尾){
     *      窗口扩大，加入right对应元素，更新当前result;
     *     while(result 不满足条件){
     *         窗口缩小、delete the left elem，left 右移
     *     }
     *     更新bestReuslt;
     *     right++;
     * }
     */

    public int lengthOfLongestSubstring(String s){
        int left=0,right=0,maxLength=0;
        if(s.length()==0){
            return 0;
        }
        Set<Character> set = new HashSet<>();
        while (right<s.length()){

            while (left<right){
                if(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }else {
                    break;
                }
            }
            set.add(s.charAt(right));
            maxLength=Math.max(set.size(),maxLength);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str="abcabcbb";
        Solution s = new Solution();
        int i = s.lengthOfLongestSubstring(str);
        System.out.println(i);
    }
}
