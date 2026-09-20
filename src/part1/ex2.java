/* 
Tìm Giá Trị Lớn Thứ Hai Trong Mảng
Mô tả: Viết một hàm để tìm giá trị lớn thứ hai trong một mảng số nguyên. Hàm sẽ nhận vào một mảng số nguyên và trả về giá trị lớn thứ hai trong mảng.
Yêu cầu:
Hàm sẽ nhận vào một mảng số nguyên và trả về giá trị lớn thứ hai trong mảng.
Nếu mảng có ít hơn hai phần tử, trả về một giá trị đặc biệt (ví dụ: Integer.MIN_VALUE).

For example:
Input: [1, 3, 4, 5, 0, 2]
Output: 4
Input: [10, 5, 10]
Output: 5
Input: [3]
Output: Integer. MIN VALUE
*/
package part1;

public class ex2 {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE; // Return a special value if there are less than two elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 3, 4, 5, 0, 2};
        int output1 = findSecondLargest(input1);
        System.out.println("Input: [1, 3, 4, 5, 0, 2]");
        System.out.println("Output: " + output1);

        int[] input2 = {10, 5, 10};
        int output2 = findSecondLargest(input2);
        System.out.println("Input: [10, 5, 10]");
        System.out.println("Output: " + output2);

        int[] input3 = {3};
        int output3 = findSecondLargest(input3);
        System.out.println("Input: [3]");
        System.out.println("Output: " + output3);
    }
}
