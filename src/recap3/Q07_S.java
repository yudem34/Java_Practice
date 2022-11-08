package recap3;

import java.util.Scanner;

public class Q07_S {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 harfli bir kelime girin");
        String str= scan.next();
        String sonHarf=str.substring(str.length()-1);

        for (int i = str.length()-2; i >=0 ; i--) {
            sonHarf+=str.substring(i,i+1);
        }
        System.out.println(sonHarf);
    }
}
