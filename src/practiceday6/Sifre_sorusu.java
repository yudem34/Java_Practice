package practiceday6;

import java.util.Scanner;

public class Sifre_sorusu {
    public static void main(String[] args) {
        String pin="yusufde2934";
        int girisHakki=3;
        Scanner scan=new Scanner(System.in);
        System.out.println("*******Hosgeldiniz*******");
        while (true){
            System.out.println("Lutfen pin kodunu giriniz");
            String pinKodu= scan.next();
            if (pinKodu.equals(pin)){
                System.out.println("Sifre basarılı");
                break;
            } else {
                System.out.println("Yanlıs girdiniz");
                girisHakki--;
                System.out.println("Kalan hakkiniz : "+girisHakki);
            }if (girisHakki==0){
                System.out.println("Hattiniz bloke olmustur");
                break;
            }
        }
        System.out.println(girisHakki);
    }
}
