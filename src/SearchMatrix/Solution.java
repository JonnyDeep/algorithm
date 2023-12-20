package SearchMatrix;

public class Solution {

    public boolean searchMatrix(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0;i<rows;i++){
            int[] row= matrix[i];
            if (binarySearch(row,target)) {
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while (left<=right){
            mid=(left+right)/2;
            if(arr[mid]>target){
                right=mid-1;
            }else if (arr[mid]<target){
                left = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int[] arr = {1,4,7,11,15};
        Solution s = new Solution();
//        System.out.println(s.binarySearch(arr,14));

        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(s.searchMatrix(matrix,20));
    }
}
