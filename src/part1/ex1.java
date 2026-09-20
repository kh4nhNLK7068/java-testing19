/*
    Xóa nguyên Âm Trong Chuỗi
    Mô tả: Viết một hàm để xóa tất cả các nguyên âm (a, e, i, o, u) trong một chuỗi ký tự. Hàm sẽ nhận vào một chuỗi và trả về chuỗi đó sau khi đã xóa tất cả các nguyên âm.
    Yêu cầu:
    Hàm sẽ nhận vào một chuỗi và trả về chuỗi đó sau khi đã xóa tất cả các nguyên âm.
    Không sử dụng các hàm có sẵn để xóa ký tự.

    Ví dụ:
    Input: "Cybersoft"
    Output: "Cbrsft"
    Input: "hello"
    Output: "hll"
*/

package part1;

public class ex1 {
    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String input1 = "Cybersoft";
        String output1 = removeVowels(input1);
        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: \"" + output1 + "\"");

        String input2 = "xin chào";
        String output2 = removeVowels(input2);
        System.out.println("Input: \"" + input2 + "\"");
        System.out.println("Output: \"" + output2 + "\"");
    }
}