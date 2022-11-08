package practiceday8;

public class Q02_ForEach {

    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop : Her döngü için diziyi yazdır
    // print length of each element   : Her elemanın uzunluğunu yazdır.

    // Part 2:
    /* Print all the elements from array using for eachLoop
    ( for eachLoop kullanarak dizideki tüm öğeleri yazdırın)*/
    /* If an element starts with 'v' then quit the loop
       Bir eleman 'v' ile başlıyorsa döngüden çık*/

    public static void main(String[] args) {
        String[] list = {"fruits", "vegetables", "meat", "milk"};
        for (String w : list) {
            System.out.println(w);
        }
        System.out.println();
        System.out.println("Ogelerin uzunluklari");
        for (String w : list) {
            System.out.println(w + " : " + (w.split("").length));
        }
        System.out.println();
        for (String w : list) {
            if (w.charAt(0) != 'v') {
                System.out.println(w);
            } else if (w.charAt(0) == 'v') {
                break;
            }
        }
    }
}
