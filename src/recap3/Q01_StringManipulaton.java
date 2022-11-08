package recap3;

import java.util.Scanner;

public class Q01_StringManipulaton {

    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1.kelimeyi girin");
        String kelime1= scan.nextLine().toLowerCase();
        System.out.println("Lutfen 2.kelimeyi girin");
        String kelime2= scan.nextLine().toLowerCase();
        System.out.println("Lutfen 3.kelimeyi girin");
        String kelime3= scan.nextLine().toLowerCase();
        System.out.println("Lutfen 4.kelimeyi girin");
        String kelime4= scan.nextLine().toLowerCase();
       // kelime1=kelime1.substring(0,1).toUpperCase()+kelime1.substring(1);
        System.out.print(kelime1=kelime1.substring(0,1).toUpperCase()+kelime1.substring(1)+" "+kelime2+" "+kelime3+" "+kelime4+".");
    }
}
