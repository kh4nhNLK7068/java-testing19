/*
Kiểm Tra Chuỗi Đối Xứng
Mô tả: Viết một hàm kiểm tra xem một chuỗi có phải là chuỗi đối xứng (palindrome) không.
Yêu cầu:
Hàm nhận vào một chuỗi.
Trả về true nếu chuỗi là đối xứng, false nếu không.
Ví dụ:
Input: "madam"
Output: true
Input: "hello"
Output: false
*/
package part2;

public class ex2 {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);
        System.out.println("Is the string a palindrome? " + result);
        scanner.close();
    }    
}
