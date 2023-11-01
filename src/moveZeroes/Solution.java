package moveZeroes;

import java.util.stream.Stream;

public class Solution {
    /**
     * [1,0,0,3,12]
     * [1,3,0,0,12]
     * @param nums
     */
    public void moveZeroes(int[] nums){
//        int zero = 0, other = 0;
//        int length = nums.length;
//        int temp =0;
//        while (other<length){
//            while (zero<length&&nums[zero]!=0){
//                zero++;
//            }
//            other=zero+1;
//            while (other<length&&nums[other]==0){
//                other++;
//            }
//            if(zero>=length||other>=length){
//                return;
//            }
//            temp = nums[zero];
//            nums[zero] = nums[other];
//            nums[other] = temp;
//        }
        int zero = 0,other = 0,length = nums.length;
        while (other<length){
            if(nums[other]!=0){
                swap(nums,zero,other);
                zero++;
            }
            other++;
        }
    }

    private void swap(int[] nums, int zero, int other) {
        int temp = nums[zero];
        nums[zero] = nums[other];
        nums[other] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        Solution s = new Solution();
        s.moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
