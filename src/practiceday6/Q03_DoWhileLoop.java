package practiceday6;

import java.util.Scanner;

public class Q03_DoWhileLoop {

    /*
  Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
  ve x girildiğinde ise "Program bitti" yazan programı yazınız.
  */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        char harf='a';

        do {
            harf=scan.nextLine().toLowerCase().charAt(0);
            System.out.println("program calisiyor");
            }while (harf != 'x');
             System.out.println("Program bitti");
            }
        }

