class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if ( ((int)Math.log10(num) + 1) % 2 == 0 ) count++;
        }
        // for ( int i = 0; i < nums.length; i++){
        //     String s = "" + nums[i];
        //     if ( s.length() % 2 == 0){
        //         count++;
        //     }
        // }
        return count;
    }
}