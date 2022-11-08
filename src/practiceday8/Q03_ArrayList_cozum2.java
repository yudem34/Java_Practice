package practiceday8;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_ArrayList_cozum2 {
    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Lutfen bir sayi giriniz");
        int input = scan.nextInt();

        Arrays.sort(arr);
        int i;
        System.out.print("\"Array'in en büyük " + input + " elemanı : ");
        for (i = arr.length - (input-1); arr.length > i; i++) {
            System.out.print(i + " and ");
        }
        System.out.println(arr[arr.length-1]);
    }
}


