package recap3;

import java.util.Scanner;

public class Q06_S {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str= scan.nextLine();
        System.out.println(str.contains(" ")?"bosluk var":"bosluk yok");
        System.out.println("Lutfen bir metin giriniz");
        String str2= scan.nextLine();
        System.out.println(str2.length()==0?"bos":"bos degil");

    }
}
