import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Erişim_belirleyici ekstra_özellikler geri_dönüş_tipi metot_adı(parametre_listesi) {
            // Metot gövdesi

            // Metotun geri dönüş değeri
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nToplama: " + add(num1, num2));
        System.out.println("Çıkarma: " + subtract(num1, num2));
        System.out.println("Çarpma: " + multiply(num1, num2));
        System.out.println("Bölme: " + divide(num1, num2));

        scanner.close();
    }

    // Toplama metodu
    public static double add(double a, double b) {
        return a + b;
    }

    // Çıkarma metodu
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Çarpma metodu
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Bölme metodu
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Hata: Sıfıra bölme tanımsızdır.");
            return 0;
        }
    }
}