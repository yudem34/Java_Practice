package day10_practice;

import java.util.Scanner;

public class UzunKelime {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();

        LonsgestWord(cumle);
        System.out.println(LonsgestWord(cumle));


    }

    public static String LonsgestWord(String cumle) {

        String arr[] = cumle.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[0].length() < arr[i].length()) {
                arr[0] = arr[i];
            }
        }
        return arr[0];
    }
}
