package recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 basmaklı bir sayı giriniz");
        int sayi= scan.nextInt();
        int birlerBasamagi=sayi%10;
        int onlarBasamagi=(sayi/10)%10;
        int yuzlerBasamagi=sayi/100;


        if(sayi>99 && sayi<1000){
            switch (yuzlerBasamagi){
                case 0: System.out.println("");break;
                case 1: System.out.println("Yüz ");break;
                case 2: System.out.println("ikiyüz ");break;
                case 3: System.out.println("ucyüz ");break;
                case 4: System.out.println("dörtyüz ");break;
                case 5: System.out.println("besyüz ");break;
                case 6: System.out.println("altiyüz ");break;
                case 7: System.out.println("yediyüz ");break;
                case 8: System.out.println("sekizyüz ");break;
                case 9: System.out.println("dokuzyüz ");break;
                    }switch (onlarBasamagi){
                        case 0: System.out.println("");break;
                        case 1: System.out.println("on ");break;
                        case 2: System.out.println("yirmi ");break;
                        case 3: System.out.println("otuz ");break;
                        case 4: System.out.println("kırk ");break;
                        case 5: System.out.println("elli ");break;
                        case 6: System.out.println("altmis ");break;
                        case 7: System.out.println("yetmis ");break;
                        case 8: System.out.println("seksen ");break;
                        case 9: System.out.println("doksan ");break;
                            }switch (birlerBasamagi){
                                case 0: System.out.println("");break;
                                case 1: System.out.println("bir ");break;
                                case 2: System.out.println("iki ");break;
                                case 3: System.out.println("uc ");break;
                                case 4: System.out.println("dört ");break;
                                case 5: System.out.println("bes ");break;
                                case 6: System.out.println("alti ");break;
                                case 7: System.out.println("yedi ");break;
                                case 8: System.out.println("sekiz ");break;
                                case 9: System.out.println("dokuz ");break;
            }

            }
        }



    }

