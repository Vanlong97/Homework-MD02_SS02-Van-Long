package BTVN;

import java.util.Scanner;

public class BTVN01 {
    public static void main(String[] args) {
        // Tạo biến scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số muốn kiểm tra: ");
        int number = Integer.parseInt(sc.nextLine());
        if (number%3 == 0 && number%5 == 0) {
            System.out.println("Số này vừa chia hết cho 3 và vừa chia hết cho 5");
        } else if (number%3 == 0) {
            System.out.println("Số này chia hết cho 3");
        } else if (number%5 == 0) {
            System.out.println("Số này chia hết cho 5 ");
        } else{
            System.out.println("Số này không chia hết cho 3 và 5");
        }
    }
}
