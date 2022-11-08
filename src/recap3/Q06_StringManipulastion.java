package recap3;

import java.util.Scanner;

public class Q06_StringManipulastion {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str = scan.nextLine();

        if (str.contains((" "))) {
            System.out.println("Girilen metinde bosluk var");
        } else if (str.length() == 0) {
            System.out.println("İnput bos,lutfen metin giriniz");
        }else{
            System.out.println("Bosluk yok");
        }
    }
}