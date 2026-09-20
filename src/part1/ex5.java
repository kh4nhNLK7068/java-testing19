/*
In Chữ Cái Đầu Của Mỗi Từ
Mô tả: Viết một hàm in ra chữ cái đầu tiên của mỗi từ trong một chuỗi.
Yêu cầu:
Hàm nhận vào một chuỗi.
Trả về chuỗi chứa các chữ cái đầu của mỗi từ.
Ví dụ:
Input: "Xin chào các bạn"
Output: "X C C B"
Input: "Hello World"
Output: "H W"
 */
package part1;

public class ex5 {
    public static String firstLetters(String input) {
        if (input == null || input.trim().isEmpty()) {
            return ""; // Return an empty string if the input is null or empty
        }

        StringBuilder result = new StringBuilder();
        String[] words = input.trim().split("\\s+"); // Split the string by whitespace

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(" "); // Append the first letter in uppercase
            }
        }

        return result.toString().trim(); // Return the result without trailing space
    }

    public static void main(String[] args) {
        String input1 = "Xin chào các bạn";
        String output1 = firstLetters(input1);
        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: \"" + output1 + "\"");

        String input2 = "Hello World";
        String output2 = firstLetters(input2);
        System.out.println("Input: \"" + input2 + "\"");
        System.out.println("Output: \"" + output2 + "\"");

        String input3 = "   "; // Test with a string containing only spaces
        String output3 = firstLetters(input3);
        System.out.println("Input: \"" + input3 + "\"");
        System.out.println("Output: \"" + output3 + "\"");
    }
}
