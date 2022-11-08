package practiceday7;

public class Q03_MDArray {

    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * yaziniz
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */
    public static void main(String[] args) {
        int[][] input = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        sayitoplam(input);
    }
        private static void sayitoplam(int [][] input) {
        int toplamc=0;
            for (int[] w : input) {
                for (int s : w) {
                    if (s % 2 == 0) {
                        toplamc += s;
                    }
                }
            }
        System.out.println("Cift sayilarin toplami : "+toplamc);
    }
}






