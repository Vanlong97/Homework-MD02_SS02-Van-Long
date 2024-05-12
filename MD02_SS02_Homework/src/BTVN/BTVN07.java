package BTVN;

import java.util.Scanner;

public class BTVN07 {
    public static void main(String[] args) {
        // phát triển môột menu ứng dụng nhiều chức năng bao gồm
        // Kiểm tra tính chẵn lẻ của một số
        // kiểm tra một số nguyên tố
        // Kiểm tra một số có chia hết cho 3 hay không
        // thoát
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Chọn số tương ứng với chức năng muốn sử dụng");
            System.out.println("1. Kiểm tra tính chẵn lẻ của một số");
            System.out.println("2. Kiểm tra một số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 hay không");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn là:");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise){
                case 1:
                    System.out.println("Bạn vừa chọn chức năng Kiểm tra tính chẵn lẻ của một số");
                    System.out.println("Nhập vào số muốn kiểm tra");
                    int number1 = Integer.parseInt(sc.nextLine());
                    if ( number1 % 2 == 0 ) {
                        System.out.println("Số vừa nhập là số chẵn");
                    } else{
                        System.out.println("Số vừa nhập là số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn chức năng Kiểm tra một số nguyên tố");
                    System.out.println("Nhập vào số muốn kiểm tra");
                    int number2 = Integer.parseInt(sc.nextLine());
                    for( int i =2 ; i <= Math.sqrt(number2); i++) {
                        if ( number2 % i == 0 ) {
                            System.out.println("Số vừa nhập không phải là số nguyên tố");
                        } else{
                            System.out.println("Số vừa nhập là số nguyên tố");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn chức năng Kiểm tra một số chia hết cho 3");
                    System.out.println("Nhập vào số muốn kiểm tra");
                    int number3 = Integer.parseInt(sc.nextLine());
                    if ( number3 % 3 == 0 ) {
                        System.out.println("Số vừa nhập chia hết cho 3");
                    } else{
                        System.out.println("Số vừa nhập không chia hết cho 3");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.print("Bạn phải nhập số từ 1 đến 4 \n");
            }
        } while (true);

    }
}
