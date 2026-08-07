class Solution {
    public int[] twoSum(int[] nums, int target) {
        for( int i = 0; i<nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{};
    }
}

// class Solution{
//     public int[] twoSum(int[] nums, int target){
//         int sum[] = new int[2];
//         for(int i = 1; i < nums.length; i++){
//             for(int j = i; j < nums.length; j++){
//                 if( nums[j] + nums[j - i] == target){
//                     sum[0] = j;
//                     sum[1] = j - i;
//                 }
//             }
//         }
//         return sum;
//     }
// }