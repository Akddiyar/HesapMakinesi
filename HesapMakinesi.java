import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select, calc;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk değeri giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci değeri giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplama: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Bölüm: " + (n1 / n2) + "\n Kalan: " + (n1 % n2));
                }
                else {
                    System.out.println("Hata, bölen 0 olamaz. lütfen farklı değer giriniz.");
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız!");

        }
    }
}
