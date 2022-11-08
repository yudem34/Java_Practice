package recap1;

import java.util.Scanner;

public class Q09_NestedIF {

    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilirsiniz.
	 	70 > age >=50 ==> iki kez oy kullanabilirsiniz.
	 	50 > age >=18 ==> bir kez oy kullanabilirsiniz., yazdiriniz

	 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz?");
        double yas = scan.nextDouble();
        if (yas < 18 || yas > 100) {
            System.out.println("Oy kullanamaz\n *Oy kullanabilmek icin 18 veya üzeri olmanız gerekmektedir.*");
        } else if (yas < 50) {
            System.out.println("bir kez oy kullanabilirsiniz.");
        } else if (yas < 70) {
            System.out.println("iki kez oy kullanabilirsiniz.");
        } else {
            System.out.println("uc kez oy kullanabilirsiniz.");
        }
    }
}
