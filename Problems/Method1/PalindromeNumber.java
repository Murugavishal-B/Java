/** This is a simple implementation of the Palindrome Number problem. */
package Problems.Method1;
public class PalindromeNumber{
  static class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x,rev=0,rem;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        return num==rev;
    }
}
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 121;
        boolean result = solution.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result); // Output: Is 121 a palindrome? true
    }
}