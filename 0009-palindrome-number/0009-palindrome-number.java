class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int pal = 0;
        while ( x > 0){
            int lastDigit = x % 10;
            pal = ( pal * 10) + lastDigit;
            x = x / 10;

        }
        if ( pal == original){
            return true;
        } else {
            return false;
        }
        
        
    }
}