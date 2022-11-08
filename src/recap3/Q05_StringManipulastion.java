package recap3;

import java.util.Scanner;

public class Q05_StringManipulastion {

    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str=scan.next();
        System.out.println("Lutfen bir metin giriniz");
        String str2=scan.next();

        if (str.length()>str2.length()){
            System.out.println("ilk girilen kelime daha uzun");
        }else if (str.length()<str2.length()){
            System.out.println("ikinci girilen kelime daha uzun");
        }else {
            System.out.println("girilen kelimelerin sayısı birbirine esit");
        }
    }
}
