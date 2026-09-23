/*
Minimum Window Substring
Mô tả: Cho hai chuỗi s và t, tìm chuỗi con nhỏ nhất của s chứa tất cả các ký tự trong t.
Ví dụ:
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
*/
package part3;

public class ex3 {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int[] charCount = new int[128]; // ASCII character count
        for (char c : t.toCharArray()) {
            charCount[c]++;
        }

        int left = 0, right = 0, minLeft = 0, minLen = Integer.MAX_VALUE, count = t.length();

        while (right < s.length()) {
            if (charCount[s.charAt(right)] > 0) {
                count--;
            }
            charCount[s.charAt(right)]--;
            right++;

            while (count == 0) { // All characters are matched
                if (right - left < minLen) {
                    minLen = right - left;
                    minLeft = left;
                }
                charCount[s.charAt(left)]++;
                if (charCount[s.charAt(left)] > 0) {
                    count++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ON";
        System.out.println("Minimum Window Substring: " + minWindow(s, t)); // Expected Output: "ODEBAN"
    }
}
