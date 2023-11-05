package MaxArea;

public class Solution {

    /**
     * 11 盛水最多的容器
     * @param height
     * @return
     */
    public int maxArea(int[] height){
        int left = 0,right = height.length-1;
        int area = Math.min(height[left], height[right]) * (right - left);
        while (left<right){
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            area = Math.max(area,Math.min(height[left], height[right]) * (right - left));

        }
        return area;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] height = new int[]{2,3,4,5,18,17,6};
        int i = s.maxArea(height);
        System.out.println(i);
    }
}
