package Practice_day4;

public class Q01_MethodCreation {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
   */
    public static void main(String[] args) {

        input("laleler");



    }

    public static void input(String tekrarsiz) {
        String output ="";
        int sayac=0;
        for (int i = 0; i <tekrarsiz.length(); i++){
            if (!output.contains(tekrarsiz.substring(i,i+1))){ //tekrarsiz karakterleri dondurecegımız ıcın sonucumuz str'den aldıgımız herhangi bir karakteri icermesin.
                output += tekrarsiz.substring(i,i+1);
                sayac++;
            }
        }System.out.println(output);
        System.out.println(sayac);
    }
}

