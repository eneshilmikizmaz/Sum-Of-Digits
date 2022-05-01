import java.util.Scanner;

public class SumOfDigits {

    public void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        int total = 0;
        int number = scanner.nextInt();
        while (number != 0) {
            total = (number % 10) + total;
            number /= 10;
        }
        System.out.println("Sonuç : " + total);

    }
}
