/*
Đếm số từ trong một chuỗi
Mô tả: Viết một hàm đếm số từ trong một chuỗi.
Yêu cầu:
Hàm nhận vào một chuỗi.
Trả về số từ trong chuỗi.
Ví dụ:
Input: "Xin chào các bạn"
Output: 4
Input: "Hello World"
Output: 2
 */

package part1;

public class ex4 {
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0; // Return 0 if the input is null or empty
        }

        String[] words = input.trim().split("\\s+"); // Split the string by whitespace
        return words.length; // Return the number of words
    }

    public static void main(String[] args) {
        String input1 = "Xin chào các bạn";
        int output1 = countWords(input1);
        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: " + output1);

        String input2 = "Hello World";
        int output2 = countWords(input2);
        System.out.println("Input: \"" + input2 + "\"");
        System.out.println("Output: " + output2);

        String input3 = "   "; // Test with a string containing only spaces
        int output3 = countWords(input3);
        System.out.println("Input: \"" + input3 + "\"");
        System.out.println("Output: " + output3);
    }
}
