package day13_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    0-1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {
        List<Integer> fibonacci=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int sayi1=0;
        int sayi2=1;
        int sayi3;
        fibonacci.add(sayi1);
        fibonacci.add(sayi2);
        for (int i = 0; i <sayi ; i++) {
            sayi3=sayi1+sayi2;
            fibonacci.add(sayi3);
            sayi1=sayi2;
            sayi2=sayi3;
        }
        System.out.println(fibonacci);
    }
}
