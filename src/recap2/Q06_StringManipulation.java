package recap2;

import java.util.Scanner;

public class Q06_StringManipulation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ilk kelimeyi giriniz");
        String ilk= scan.nextLine();
        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String iki= scan.nextLine();


        System.out.println(ilk.substring(1)+iki.substring(1));


        /*uzun yol
        System.out.println(ilk.concat(iki));

        String ilkYok=ilk.substring(1);
        String ikinciYok=iki.substring(1);
        System.out.println(ilkYok.concat(ikinciYok));
        */



    }
}
