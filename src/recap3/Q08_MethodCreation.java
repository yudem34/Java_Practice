package recap3;

import java.util.Scanner;

public class Q08_MethodCreation {
     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("islem yapmak istediginiz sembolu seciniz :\n" +
                "Toplama : + \n" + "Cikarma : - \n" + "Carpma  : * \n" + "Bolme   : / \n");
        String islem = scan.next();
        System.out.println("Lutfen 1.sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("Lutfen 2.sayiyi giriniz");
        double sayi2 = scan.nextDouble();
        if (islem == "+" || islem == "-" || islem == "*" || islem == "/") {
            switch (islem) {
                case "+":
                    System.out.println("Toplam = " + (sayi1 + sayi2));
                    break;
                case "-":
                    System.out.println("Cıkarma = " + (sayi1 - sayi2));
                    break;
                case "*":
                    System.out.println("Carpma = " + (sayi1 * sayi2));
                    break;
                case "/":
                    System.out.println("Bolme = " + (sayi1 / sayi2));
                    break;
                default:
            }
        } else {
            System.out.println("Hatalı giris yaptınız");
        }
    }
}

