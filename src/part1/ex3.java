/*
Tính Tổng Các Số Chẵn
Mô tả: Viết một hàm tính tổng các số chẵn từ 0 đến một số nguyên dương n cho trước.
Yêu cầu:
Hàm nhận vào một số nguyên dương n.
Trả về tổng của tất cả các số chẵn từ 0 đến n

Ví dụ:
Input: 10
Output: 30
Input: 5
Output: 6
*/
package part1;

public class ex3 {
    public static int sumEvenNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int input1 = 10;
        int output1 = sumEvenNumbers(input1);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + output1);

        int input2 = 5;
        int output2 = sumEvenNumbers(input2);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + output2);
    }
}
