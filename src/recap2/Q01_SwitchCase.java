package recap2;

import java.util.Scanner;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun= scan.nextLine().toLowerCase();
        switch (gun){
            case "pazartesi":System.out.println("Java dersi");break;
            case "salı":System.out.println("Java dersi");break;
            case "çarşamba":System.out.println("Selenyum dersi");break;
            case "perşembe":System.out.println("Selenyum dersi");break;
            case "cuma":System.out.println("Sql dersi");break;
            case "cumartesi":System.out.println("Sql dersi");break;
            case "pazar":System.out.println("izinli gun");break;
            default:
                System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
    }
}
