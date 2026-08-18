class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int merged[] = new int [n + m];

        
        // for ( int i = 0; i < nums1.length; i++){
        //     merged[i] = nums1[i];
        // }
        // for ( int i = 0; i < nums2.length; i++){
        //     merged[m + i] = nums2[i];
        // }

        // Arrays.sort(merged);
        // for ( int i = 0; i < m + n; i++){
        //     nums1[i] = merged[i];
        // }

       int i = m - 1;
       int j = n - 1;
       int k = m+n - 1;
       while ( i >= 0 && j >= 0){
            if ( nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;

       }
       while ( j >= 0){
        nums1[k] = nums2[j];
        j--;
        k--;
       }


    }
}