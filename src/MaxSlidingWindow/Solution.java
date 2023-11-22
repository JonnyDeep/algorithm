package MaxSlidingWindow;

import java.util.*;

public class Solution {

    /**
     * 239 滑动窗口、单调队列
     * @param nums
     * @param k
     * @return
     */

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> que = new ArrayDeque<>();
        int j = 0;
        int[] res = new int[nums.length-k+1];
        while (j<nums.length){
            //1.进入窗口,队列里面没有元素或者新元素比最大的元素大
            while (!que.isEmpty()&&nums[j]>=nums[que.getLast()]){
                que.removeLast();
            }
            que.addLast(j);
            //2.删除元素
            if(j-que.getFirst()>=k){
                que.removeFirst();
            }
            //3.记入结果,当队列中有k个元素时记入结果
            if(j+1>=k) {
                res[j-k+1] = nums[que.getFirst()];
            }
            j++;
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{-7,-8,7,5,7,1,6,0};
        Solution s = new Solution();
        int[] ints = s.maxSlidingWindow(nums, 4);
        for (int elem :
                   ints ) {
            System.out.printf("%d ",elem);
        }
    }
}
