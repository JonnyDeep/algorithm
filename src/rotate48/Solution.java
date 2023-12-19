package rotate48;

public class Solution {

    public void rotate(int[][] matrix){
        int tmp = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        //沿对角线交换数据
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i<j) break;
                if(i==j) continue;
                tmp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }

        //沿垂直中线对折
        int halfCols = cols/2;
        for(int i=0;i<rows;i++){
            for(int j=0;j<halfCols;j++){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][cols-j-1];
                matrix[i][cols-j-1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        s.rotate(matrix);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%d,",anInt);
            }
        }
    }
}
