package practiceday7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */

    public static void main(String[] args) {

        List<String> databaseIsimler = new ArrayList<>();
        databaseIsimler.add("Enes");
        databaseIsimler.add("Ismail");
        databaseIsimler.add("AbdulBaki");
        databaseIsimler.add("Emre");
        databaseIsimler.add("Melisa");
        databaseIsimler.add("Oguz");
        System.out.println("databaseIsimler = " + databaseIsimler);
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kullanıcı adı giriniz");
        String kullaniciAdi = scan.nextLine().trim();

        boolean kullaniciAdiVarmi = databaseIsimler.contains(kullaniciAdi);

        if (kullaniciAdiVarmi) {
            System.out.println("bu kullanıcı adı alinmis");
        } else System.out.println("bu kullanıcı adını kullanabilirsiniz");

        if (kullaniciAdiVarmi) {
            int randomSayi = new Random().nextInt(100);
            kullaniciAdi += randomSayi;
            databaseIsimler.add(kullaniciAdi);
            System.out.println("Yeni kullanici adiniz : " + kullaniciAdi);
        } else {
            System.out.println("Yeni kullanıcı adiniz : " + kullaniciAdi);
        }
    }
}
