package BTVN;

import java.util.Scanner;

public class BTVN04 {
    public static void main(String[] args) {
        // nhập vào một khoảng số tự nhiên và tính tổng các số chẵn nằm trong khoảng đó
        // Nhập vào một số
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào khoảng số muốn tính tổng số chẵn");
        System.out.println("Nhập vào số đầu tiên");
        int i = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cuối");
        int j = Integer.parseInt(sc.nextLine());
        // sử dụng vòng lặp và câu lệnh điều khiển để tính tổng
        int sum = 0;
        for (int e = i; e <= j; e++) {
            if (e % 2 == 0) {
                sum += e;
            }
        }
        System.out.printf("Tổng các số chẵn trong khoảng %d-%d là %d", i, j, sum);

    }
}
