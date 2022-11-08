package recap1;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {


    /*
    Problem tanimi :
    Kullanicidan  yasini ve kilosunu alaliniz
    18 yasindan kucuk ise kan bagisi yapamaz
    18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
    18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        System.out.println("lutfen kilonuzu giriniz");
        int kilo = scan.nextInt();

        if (yas > 0 && yas < 18) {
            System.out.println("Yasınız 18 den kucuk oldugu icin kan bagısı yapamazsınız");
        } else if (yas >= 18) {
            if (kilo < 50) {

                System.out.println("Kilonuz 50 den az oldugu icin kan bagısı yapamazsınız");
            } else {
                System.out.println("kan bagısı yapabilirsiniz");
            }
        }

    }

}