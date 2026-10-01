class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = 2 * nums.length;
        int arr[] = new int[length];
        int start = 0;
        int end = arr.length - 1;
        int j = nums.length - 1;
        while ( start < end ){
            arr[start] = nums[start];
            arr[end] = nums[j];
            start++;
            end--;
            j--;
        }
        return arr;
        
    }
}