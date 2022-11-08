package Practice_day4;

public class Q05_ForLoop {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {

        for (int i = 0; i <= 255; i++) {
            System.out.println("Ascii value of "+(char) i+" : "+i);

        }
    }
}
