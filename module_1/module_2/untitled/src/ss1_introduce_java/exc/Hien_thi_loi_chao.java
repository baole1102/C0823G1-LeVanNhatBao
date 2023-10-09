package ss1_introduce_java.exc;

import java.util.Scanner;

public class Hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello: "+ name);
    }
}
