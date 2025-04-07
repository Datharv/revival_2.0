class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;        
        // int revNum = getRevNumber(x);
        // if(x == revNum) return true;
        String num = String.valueOf(x);
        StringBuilder s = new StringBuilder(num);
        String revString = s.reverse().toString();
        System.out.println(num + " " + revString);
        return num.equals(revString);
    }

    public int getRevNumber(int num) {
        
        int rev = 0;
        int i = 10;
        while(num != 0) {
            int rem = num%10;
            rev = rev*i + rem;
            System.out.println("rev : " + rev);
            num/=10;
        }
        return rev;
    }
}
