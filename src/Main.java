import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double km_ucret = 2.20;
        double tutar = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("mesafe giriniz..");
        km = scanner.nextInt();

        tutar += km * km_ucret;

        System.out.println(tutar);



    }
}