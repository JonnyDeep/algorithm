package RemoveDuplicatesII;

public class Solution {
    //80 删除有序数组中的重复项
    public int removeDuplicates(int[] nums){
        if(nums.length==1){
            return 1;
        }
        int slow=2,fast = 2;
        while (fast<nums.length){
            if(nums[slow-2]!=nums[fast]){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        Solution s = new Solution();
        int i = s.removeDuplicates(nums);

        System.out.printf("the new arrays length:%d\n",i);
        for (int i1 = 0; i1 < i; i1++) {
            System.out.printf("%d ",nums[i1]);
        }
    }
}
