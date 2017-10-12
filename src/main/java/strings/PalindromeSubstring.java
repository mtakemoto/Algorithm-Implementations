package strings;

/*
 * Return the largest possible substring of a string that
 * is a palindrome
 */

public class PalindromeSubstring {
    public String solution(String s) {
        if(s == null) return null;
        int windowSize = s.length();
        while(windowSize > 0) {
            int start = 0;
            int end = windowSize;
            while(end <= s.length()) {
                String sub = s.substring(start, end);
                if(isPalindrome(sub)) {
                    return sub;
                }
                start++;
                end++;
            }
            windowSize--;
        }
        return null;
    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length/2; i++) {
            if(chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
