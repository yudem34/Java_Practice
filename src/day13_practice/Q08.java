package day13_practice;

import java.util.Scanner;

public class Q08 {
    // İki sayiyi islem isareti ile giriniz
    // Input : 12+36
    // Output :48
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("İki sayiyi islem isareti ile giriniz");
       // int islem = scan.nextInt();

        String str = "12+36";
        int top=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(Integer.valueOf(str.charAt(i)))){
                top=Integer.parseInt(String.valueOf(str.charAt(i)));
            }else if (!Character.isDigit(Integer.valueOf(str.charAt(i)))) {
                continue;

            }System.out.println(top);
        }
    }
}