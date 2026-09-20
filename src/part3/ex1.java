/*
Two Sum II - Input Array Is Sorted
Mô tả: Cho một mảng đã được sắp xếp tăng dần và một số nguyên target, hãy tìm tất cả các cặp hai số trong
mảng có tổng bằng target và trả về chỉ số (index) của chúng (bắt đầu từ 1).
Ví dụ:
Input: numbers = [2,2,7,11,15], target = 9
Output: [1,3] (tương đương [3,1]), [2,3] (tương đương [3,2])
 */
package part3;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
    public static List<int[]> twoSum(int[] numbers, int target) {
        List<int[]> result = new ArrayList<>();
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                if (numbers[left] == numbers[right]) {
                    // Mọi phần tử trong đoạn [left, right] đều bằng nhau
                    // -> mọi cặp chỉ số trong đoạn này đều thỏa
                    for (int i = left; i < right; i++) {
                        for (int j = i + 1; j <= right; j++) {
                            result.add(new int[]{i + 1, j + 1});
                        }
                    }
                    break;
                } else {
                    // Đếm số phần tử trùng giá trị ở đầu trái và đầu phải
                    int lCount = 1;
                    while (left + lCount <= right && numbers[left + lCount] == numbers[left]) lCount++;
                    int rCount = 1;
                    while (right - rCount >= left && numbers[right - rCount] == numbers[right]) rCount++;

                    // Ghép mọi tổ hợp giữa nhóm trái và nhóm phải
                    for (int i = 0; i < lCount; i++) {
                        for (int j = 0; j < rCount; j++) {
                            result.add(new int[]{left + i + 1, right - j + 1});
                        }
                    }
                    left += lCount;
                    right -= rCount;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 2, 7, 11, 15};
        int target = 9;
        for (int[] p : twoSum(numbers, target)) {
            System.out.println("[" + p[0] + ", " + p[1] + "]");
        }
    }
}
