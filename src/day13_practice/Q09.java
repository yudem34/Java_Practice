package day13_practice;

import java.util.Arrays;

public class Q09 {
    /*
     int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
     verilen Array icinde
     --> kac tane eleman oldugunu return eden methodu yazdiriniz
     //cevap : 13 donsun
    */
    public static void main(String[] args) {
        int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};
        System.out.println("Eleman Sayısı : "+elemanSayisi(arr));
    }

    public static int elemanSayisi(int[][] arr) {
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                count++;
                System.out.print(arr[i][j]+" ");
            }
        }System.out.println();

       return count;
    }
}
