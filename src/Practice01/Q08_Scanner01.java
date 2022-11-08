package Practice01;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 1.sayiyi giriniz :");
        int sayi1= scan.nextInt();
        System.out.print("Lutfen 2.sayiyi giriniz :");
        int sayi2= scan.nextInt();
        System.out.println("Toplam : " + (sayi1+sayi2));

    }
}
