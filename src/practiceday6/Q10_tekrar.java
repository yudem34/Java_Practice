package practiceday6;

import java.util.Scanner;

public class Q10_tekrar {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str= scan.nextLine();
        System.out.println("Lutfen bir sayı giriniz");
        int sayi= scan.nextInt();

        System.out.println("tekrarDondur(str,sayi) = " + " "+(tekrarDondur(str, sayi)));


    }

    public static String tekrarDondur(String str, int sayi) {
        String sonuc = "";
        String s=str.substring(0,1) + (str.substring(str.length()-1));
        for (int i = 0; i <=sayi ; i++) {
            sonuc+=s;
        }
        return sonuc;
    }
}
