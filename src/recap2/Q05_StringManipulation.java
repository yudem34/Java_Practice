package recap2;

import java.util.Locale;
import java.util.Scanner;

public class Q05_StringManipulation {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soy isminizi giriniz");
        String isimSoyIsim= scan.nextLine();
        String yeni=isimSoyIsim.toUpperCase(Locale.ROOT);
        System.out.println("Adınız ve Soyadınız : " + yeni);
    }

}

