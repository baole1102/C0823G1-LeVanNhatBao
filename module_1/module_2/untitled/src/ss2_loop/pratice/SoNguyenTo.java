package ss2_loop.pratice;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn kiểm tra");
        int numbers = scanner.nextInt();
        for (int i = 1; i <= numbers; i++) {
            if (numbers % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(numbers+" Là số nguyên tố");
        }else {
            System.out.println(numbers+" Không phải là số nguyên tốt");
        }
    }
}
