package day13_practice;

public class Q02 {
     /*
    // Stringi ters cevirmek icin bir Java Programi yazin
    //1.Yol: StringBuilder () kullanarak
    //2.Yol: String Classini kullanarak
    //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */
     public static void main(String[] args) {
         //1.Yol
         String str="All is well";
         StringBuilder strt= new StringBuilder(str);
         String ters= String.valueOf(strt.reverse());
         //System.out.println(strt.reverse());
         System.out.println("Ters : "+ters);
         //2.Yol
         String str2="All is well";
         String ters2="";
         for (int i = str2.length()-1; i >=0 ; i--) {
             ters2+=str2.substring(i,i+1);
         }
         System.out.println("Ters2 : "+ters2);
         //3.Yol
         String str3="All is well";
         tersString(str3);


     }

    public static void tersString(String str3) {
        String ters3="";
        for (int i = str3.length()-1; i >=0 ; i--) {
            ters3+=str3.substring(i,i+1);
        }
        System.out.println("Ters3 : "+ters3);
    }
}
