package SpiralOrder;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * 54 螺旋矩阵  left-->down-->left-->up-->right-->...
     * @param matrix
     * @return
     */

    public List<Integer> spiralOrder(int[][] matrix){
        int m = matrix.length; //row nums
        int n = matrix[0].length; //col nums
        int rightBound = n-1;
        int downBound = m-1;
        int leftBound = 0;
        int upBound = 1;
        int i=0,j=0;
        int size = m*n;
        List<Integer> res = new ArrayList<>(size);
        int count = 0;
        boolean right = true;
        boolean down = false;
        boolean left = false;
        boolean up = false;
        while(count<size){
            if(right&&j<=rightBound) {
                res.add(matrix[i][j++]);
                count++;
            }else if(right){
                right = false;
                down = true;
                rightBound--;
                j--;
                i++;
            }

            if(down && i<=downBound){
                res.add(matrix[i++][j]);
                count++;
            }else if(down){
                down = false;
                left = true;
                downBound--;
                i--;
                j--;
            }

            if(left && j>=leftBound){
                res.add(matrix[i][j--]);
                count++;
            }else if(left){
                left = false;
                up = true;
                leftBound++;
                j++;
                i--;
            }

            if(up && i>=upBound){
                res.add((matrix[i--][j]));
                count++;
            }else if(up) {
                right = true;
                up = false;
                upBound++;
                i++;
                j++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Solution s = new Solution();
        List<Integer> integers = s.spiralOrder(matrix);
        for (Integer integer : integers) {
            System.out.printf("%d ",integer);
        }
    }
}
