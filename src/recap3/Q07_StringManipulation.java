package recap3;

import java.util.Scanner;

public class Q07_StringManipulation {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 harfli bir kelime girin");
        String str= scan.next();
        String sonHarf=str.substring(str.length()-1)
                      +str.substring(str.length()-2,str.length()-1)
                      +str.substring(str.length()-3,str.length()-2)
                      +str.substring(str.length()-4,str.length()-3);
        System.out.println(sonHarf);




        //String sonHarf=str.substring(str.length()-1,str.length()-2)+str.substring(str.length()-2,str.length()-3)+str.substring(str.length()-3,str.length()-4)+str.substring(str.length()-4);




    }
}
