package recap1;

import java.util.Scanner;

public class Q07_BMISiniflama {

		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen boyunuzu cm olarak giriniz");
            double boy=scan.nextDouble()/100;
            double boyM=boy/100;
            System.out.println("Lutfen kilonuzu giriniz");
            double kilo= scan.nextDouble();
            double BMI=kilo/(boyM*boyM);
            System.out.println("BMI : "+BMI);
            if (BMI<=20){
                System.out.println("oldukca zayifsiniz");
            }else if (BMI<=25){
                System.out.println("Normal sinirlardasiniz");
            }else if (BMI<=30){
                System.out.println("Sisman kategorisindesiniz");
            }else{
                System.out.println("Obez grubundasiniz.");
            }

        }

}
