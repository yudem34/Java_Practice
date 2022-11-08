package practiceday7;

import java.util.Scanner;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
       public static void main(String[] args) {

           farkiniBul();



       }

    public static void farkiniBul() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Array uzunlugunu giriniz");
        int uzunluk= scan.nextInt();
        int [] arr=new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("arrayin " +(i+1) +" . elemanını giriniz");
            arr[i]= scan.nextInt();
        }

           int min = arr[0];
           int max = arr[0];

           for (int i = 0; i < arr.length; i++) {
               if (min>arr[i]){
                   min=arr[i];
               } else if (max<arr[i]) {
                   max=arr[i];
               }
           }
           System.out.println("Max : "+max);
           System.out.println("Min : "+min);
           System.out.println("Aradaki Fark : "+(max-min));

    }
}
