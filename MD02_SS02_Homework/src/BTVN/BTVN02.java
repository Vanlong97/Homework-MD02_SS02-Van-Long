package BTVN;

import java.util.Scanner;

public class BTVN02 {
    public static void main(String[] args) {
        // Nhập vào số muốn kểm tra
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số từ 0 đến 9");
        int number = Integer.parseInt(sc.nextLine());
        switch (number) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            default:
                System.out.println("Bạn phải nhập một số từ 0 đến 9");
        }
    }
}
