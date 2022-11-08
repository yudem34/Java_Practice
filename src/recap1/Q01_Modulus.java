package recap1;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 Basamaklı bir sayi giriniz");
        int num = scan.nextInt();

        //int b1 = (sayi / 10000) % 10;    // 1.basamak
        //int b2 = (sayi / 1000) % 10;    // 2.basamak
        //int b4 = (sayi / 10) % 10;     // 4.basamak
        //int b5 = (sayi) % 10;       // 5.basamak
        //System.out.println(b1+b2+b4+b5);

        int ilkIki=num/1000;
        int sonIki=num%100;

        int ilkIkiTop=(ilkIki/10)+(ilkIki%10);
        int sonIkiTop=(sonIki/10)+(sonIki%10);

        System.out.println("toplam : " +(ilkIkiTop+sonIkiTop));

    }
}
