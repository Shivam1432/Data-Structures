class Solution {
    public String longestPalindrome(String s) {
        while (s.length() > 0) {
        StringBuilder str = new StringBuilder(s);
        String reversed = str.reverse().toString();

        if (reversed.equals(s)) {
            return s;  // It’s a palindrome
        } else {
            // Shrink the string from both ends
            if (s.length() <= 2) {
                return s.substring(0,1);  // No palindrome found in the shrinking process
            }
            s = s.substring(1, s.length() - 1);  // remove first and last char
        }
    }
    return "";
    }
}
