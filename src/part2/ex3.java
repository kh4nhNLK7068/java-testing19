/*
Xóa Ký Tự Lặp Lại Trong Chuỗi
Mô tả: Viết một hàm xóa các ký tự lặp lại trong chuỗi, chỉ giữ lại ký tự xuất hiện đầu tiên của mỗi
loại.
Yêu cầu:
Hàm nhận vào một chuỗi và trả về chuỗi mới không chứa ký tự lặp lại.
Ví dụ:
Input: "programming"
Output: "progamin"
Input: "abca"
Output: "abc"
*/
package part2;

public class ex3 {
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        java.util.HashSet<Character> seen = new java.util.HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String output = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + output);
        scanner.close();
    }    
}
