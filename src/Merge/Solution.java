package Merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    /**
     * 56 排序、双指针
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals){
        if(intervals.length==0){
            return new int[0][2];
        }

        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        List<int[]> merge = new ArrayList<>();
        int i= 0,j = 1;
        merge.add(intervals[0]);
        for (;j<intervals.length;j++){
            //下一个区间的左端点小于等于merge 中最后一个区间的右端点，一定可以合并
            if(intervals[j][0]<=merge.get(i)[1]){
                merge.get(i)[1]=Math.max(merge.get(i)[1],intervals[j][1]);
            }else{
                //不连续
                i = merge.size();
                merge.add(intervals[j]);
            }
        }
        return merge.toArray(new int[merge.size()][]);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] merge = s.merge(intervals);
        for (int[] ints : merge) {
            System.out.printf("[%d,%d],",ints[0],ints[1]);
        }
    }
}
