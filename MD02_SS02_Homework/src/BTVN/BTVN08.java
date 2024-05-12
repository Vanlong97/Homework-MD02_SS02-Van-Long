package BTVN;

import java.util.Scanner;

public class BTVN08 {
    public static void main(String[] args) {
        // cho người dùng nhập vào ba cạnh của một tam giác kiểm tra xem có thỏa mãn điều kiện là một tam giác không
        // nếu thỏa mãn cho tính chu vi diện tích
        // nếu không thỏa mãn cho người dùng nhập lại
        // Nhập vào ba cạnh của tam giác
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ nhất của tam giác");
        int canh1 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào cạnh thứ hai của tam giác");
        int canh2 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào cạnh thứ ba của tam giác");
        int canh3 = Integer.parseInt(sc.nextLine());
        if (canh1 + canh2 > canh3 && canh1 + canh3 > canh2 && canh2 + canh3 > canh1) {
            // tinh ra nua chu vi
            double s = (canh1 + canh2 + canh3) / 2 ;
            // tinh dien tich tam giac theo cong thuc Heron
            double dienTich = Math.sqrt(s*(s-canh1)*(s-canh2)*(s-canh3));
            int chuVi = canh1 + canh2 + canh3;
            System.out.println("Chu vi của tam giác là:" + chuVi);
            System.out.println("Diện tích của tam giác là:" + dienTich);
        } else {
            System.err.println("Bạn nhập sai các cạnh của tam giác");
        }
    }
}
