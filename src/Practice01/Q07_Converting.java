package Practice01;

import java.util.Scanner;

public class Q07_Converting {
    public static void main(String[] args) {
        /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon
        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */

        int galon=1000;
        double litre=galon*3.785;
        String sonuc1=galon + " galon degeri " + litre + " Litreye esittir";
        System.out.println(sonuc1);

        int l=1000;
        double g=l/3.785;
        System.out.println(l+ " litre degeri "+g+ " galona esittir");


        Scanner scan=new Scanner(System.in);
        System.out.println("fahrenayt degerini giriniz");
        double fh= scan.nextDouble();

        System.out.println("fahrenayt degeri : " + (fh-32)*5/9);

            }
}
