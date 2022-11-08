package practiceday8;

public class Q08_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10} // -2,-2,1,1,2,2,2,...
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {

        String[] array = {"a,a,a,a,s,s,s,d,e"};
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0+1; j< array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
