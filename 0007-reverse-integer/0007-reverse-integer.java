class Solution {
    public int reverse(int x) {
        
        String s = String.valueOf(x);
        boolean negative = false;
        if ( x < 0 ){
            negative = true;
            long num = Math.abs((long)x);
            s = String.valueOf(num);
        }
        char arr[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while ( i < j ){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        s = new String(arr);
        if (negative){
            s = "-" + s;
        }
        long ans = Long.parseLong(s);
        // if(negative){
        //     ans = -ans;
        // }
        if( ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ){
            return 0;
        }
        return (int)ans;
        
        
    }
}