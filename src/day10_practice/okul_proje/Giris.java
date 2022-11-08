package day10_practice.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {

    /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("QA Okulumuza Hosgeldiniz");

        System.out.println("Ismi Giriniz");
        String isim = scan.nextLine();

        System.out.println("Soyisminizi Giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Yasinizi Giriniz");
        int yas = scan.nextInt();
        scan.nextLine();//hayalet komut dummy
        System.out.println("Bransinizi Giriniz");
        String brans = scan.nextLine();

        System.out.println("Telefon Numaranizi Giriniz");
        String tel = scan.nextLine();

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyisim, yas, brans, tel);
        List<OgretmenBilgileri> ogretmenList = new ArrayList<>();
        ogretmenList.add(adayOgretmen);

        System.out.println(ogretmenList);
        //System.out.println(adayOgretmen);




    }
}
