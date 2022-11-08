package practiceday8;

import java.util.Scanner;

public class Q04_HackerLanguage {

// Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile her sey guzel")
//    j4v4 1l3 h3r 53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

    public static void main(String[] args) {
        hackerDili();
    }
    public static void hackerDili() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str = scanner.nextLine().toLowerCase();
        String temp = str;
        str = str.replaceAll("s", "5");
        str = str.replaceAll("a", "4");
        str = str.replaceAll("e", "3");
        str = str.replaceAll("i", "1");
        str = str.replaceAll("o", "0");

        System.out.println("Girilen metin : " + temp + " \nHacker dili   : " + str);

    }
}
