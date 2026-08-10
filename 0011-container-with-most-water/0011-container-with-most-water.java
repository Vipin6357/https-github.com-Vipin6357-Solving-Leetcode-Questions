// class Solution {
//     public int maxArea(int[] height) {
//         int max = 0;
//         int left = 0;
//         int right = height.length - 1;
//         while(left <= right){
//             int breath = Math.abs(right - left);
//             int length = Math.min(height[left], height[right]);
//             int area = length * breath;
//             max = Math.max(max, area);
//             if(height[left] <= height[right]){
//                 left++;
//             }else {
//                 right--;
//             }
//         }
//         return max;
//     }
    
// }

class Solution {
    
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        int minH = -1;
        while (left < right) {
            minH = Math.min(height[left], height[right]);
            res = Math.max(res, minH * (right - left));
            while (left < right && height[left] <= minH) {
                left++;
            }
            while (left < right && height[right] <= minH) {
                right--;
            }
        }

        return res;
    }
}