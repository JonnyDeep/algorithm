package LongestConsecutive;

import java.util.HashSet;

public class Solution {

    /*
    128 最长连续序列
     */
    public int longestConsecutive(int[] nums) {
        if(nums.length==0||nums.length==1){
            return nums.length;
        }

        HashSet<Integer> nums_set = new HashSet<>();
        for (int num : nums) {
            nums_set.add(num);
        }

        Integer longestStreet = 0;
        for (Integer elem : nums_set) {
            if (!nums_set.contains(elem-1)){
                Integer current = elem;
                Integer length=1;
                while (nums_set.contains(current+1)){
                    length++;
                    current++;
                }
                longestStreet = Math.max(longestStreet,length);
            }
        }
        return longestStreet;
    }
}
