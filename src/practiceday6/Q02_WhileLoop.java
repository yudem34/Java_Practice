package practiceday6;

public class Q02_WhileLoop {

     /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

    public static void main(String[] args) {

        int sayi=10;
        while (sayi>0){
            if (sayi%2==1) {
                System.out.print(sayi+" ");
            }
            sayi--;
            }
        }

    }

