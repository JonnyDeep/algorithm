package SetZeroes;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 73 矩阵置零
     * @param matrix
     *
     * 0,0   0,3
     */
    public void setZeroes(int[][] matrix){
        List<int[][]> zeros = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    zeros.add(new int[][]{{i,j}});
                }
            }
        }
        int rows = matrix.length;       //行
        int columns = matrix[0].length; //列
        for(int i=0;i<zeros.size();i++){
            int[][] ints = zeros.get(i);
            int row = ints[0][0];
            int col = ints[0][1];
            for(int j=0;j<columns;j++){
                matrix[row][j]=0;
            }
            for(int j=0;j<rows;j++){
                matrix[j][col] = 0;
            }
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        s.setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}

