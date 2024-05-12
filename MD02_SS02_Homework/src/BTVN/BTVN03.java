package BTVN;

public class BTVN03 {
    public static void main(String[] args) {
        // Hiển thị ra những số chia hết cả cho 3 và 5
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("Số %d chia hết cho cả ba và năm\n",i);
            }
        }
    }
}
