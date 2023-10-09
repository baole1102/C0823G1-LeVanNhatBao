package ss2_loop.vd;

import java.util.Scanner;

public class Thuchanh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mutiplication Table");
        for (int i = 1; i < 10; i++) {
            System.out.printf(" "+"%3d", i);
        }
        System.out.println("\n -------------------");
        for (int j = 1; j < 10; j++) {
            System.out.print(j + " |");
            for (int i = 1; i < 10; i++) {
                System.out.printf("%4d",j * i);
            }
            System.out.println();
        }

    }
}
