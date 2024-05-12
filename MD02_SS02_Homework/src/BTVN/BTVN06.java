package BTVN;

public class BTVN06 {
    public static void main(String[] args) {
        // Hiển thị 20 số nguyên tố đầu tiên
        // Hiển thị các số nguyên tố nhỏ hơn 100
        System.out.println("20 số nguyên tố đầu tiên:");
        int count = 0;
        int number = 2;
        while (count < 20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if ( number % i == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }

    }
}
