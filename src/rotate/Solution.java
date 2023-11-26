package rotate;

import java.util.Arrays;

public class Solution {

    /**
     * 189
     *
     */
//    public void rotate(int[] nums,int k){
//        int[] res = Arrays.copyOf(nums, nums.length);
//        for(int i=0;i<nums.length;i++){
//            nums[(i+k)%nums.length] = res[i];
//        }
//    }

    public void rotate(int[] nums,int k){
        int pre = 0,count =0;
        int next =(pre+k)>=nums.length?(pre+k)%nums.length:pre+k;
        int tmp = nums[pre];
        while (count<nums.length){
            nums[next] = tmp;
            tmp = nums[pre];
            count++;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{1,2,3,4,5,6,7};
        s.rotate(nums,3);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
