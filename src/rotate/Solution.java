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
        k %=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] nums,int start,int end){
        while (start<end){
            int tmp = nums[start];
            nums[start]  =nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{-1,-100,3,99};
        s.rotate(nums,2);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
