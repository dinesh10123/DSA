class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int rev = 0;
        int num = x;
        while(x != 0){
            int ld = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && ld > 7))
                return false;
            rev = (rev * 10) + ld;
            x = x / 10;
        }
        return num == rev;
    }
}
