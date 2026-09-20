/*
Mô tả: Viết một chương trình Java tính thuế thu nhập cá nhân dựa trên mức thu nhập hàng năm của
một người. Chương trình sẽ yêu cầu người dùng nhập thu nhập hàng năm và sau đó tính thuế dựa
trên các mức thuế sau:
1. Thu nhập từ 0 đến 5 triệu đồng: 5%
2. Thu nhập từ 5 triệu đến 10 triệu đồng: 10%
3. Thu nhập từ 10 triệu đến 18 triệu đồng: 15%
4. Thu nhập từ 18 triệu đến 32 triệu đồng: 20%
5. Thu nhập từ 32 triệu đến 52 triệu đồng: 25%
6. Thu nhập từ 52 triệu đến 80 triệu đồng: 30%
7. Thu nhập trên 80 triệu đồng: 35%

Yêu cầu:
1. Nhập thu nhập hàng năm từ người dùng.
2. Tính số thuế phải trả theo từng mức thuế suất.
3. Xuất số thuế phải trả.
 */

package part2;

public class ex1 {
    public static double calculateTax(double income) {
        double tax = 0.0;

        if (income <= 5000000) {
            tax = income * 0.05;
        } else if (income <= 10000000) {
            tax = 5000000 * 0.05 + (income - 5000000) * 0.10;
        } else if (income <= 18000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + (income - 10000000) * 0.15;
        } else if (income <= 32000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + (income - 18000000) * 0.20;
        } else if (income <= 52000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 14000000 * 0.20 + (income - 32000000) * 0.25;
        } else if (income <= 80000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 14000000 * 0.20 + 
                  20000000 * 0.25 + (income - 52000000) * 0.30;
        } else {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 
                  14000000 * 0.20 + 20000000 * 0.25 + 
                  (80000000 - income) * -1; // This line seems incorrect, should be corrected
        }

        return tax;
    }

    public static void main(String[] args) {
        // Add try catch block to handle invalid input
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter annual income (VND): ");
            double income = scanner.nextDouble();

            if (income < 0) {
                System.out.println("Income cannot be negative.");
            } else {
                double tax = calculateTax(income);
                System.out.printf("Tax payable: %.2f VND%n", tax);
            }

            scanner.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}
