package practiceday8;

public class Q07_SpecialCharRemoveArrayList {
      /*
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */

    public static void main(String[] args) {

        String[] ArrayList = {"$13", "$15", "$20"};
        getSum(ArrayList);
        if (getSum(ArrayList)<0){
            System.out.println(-1);
        }else
        System.out.println(getSum(ArrayList));
    }

    public static int getSum(String[] ArrayList) {
        int toplam = 0;
        for (String w : ArrayList) {
            w = w.replace("$", "");
            Integer sayi2 = Integer.parseInt(w);
            toplam+=sayi2;
            }

        return toplam;
    }
}
