package practiceday6;

public class Q09_Arrays {

    /*
     * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
     * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
     */
    public static void main(String[] args) {
        int [][] arr1 = {{0, 2, -1}, {3, 8, 9}, {7}};
        int [][] arr2 = {{-7, 6, -9}, {0, 12}, {19}};

        int toplam1 = 0;
        int toplam2 = 0;
        for (int[] ints : arr1) {
            for (int j = 0; j < ints.length; j++) {
                toplam1 += ints[j];
            }
        }
        for (int k = 0; k < arr2.length; k++) {
            for (int l = 0; l < arr2[k].length; l++) {
                toplam2 += arr2[k][l];
            }
        }
        System.out.println("toplam1 : "+toplam1+" toplam2 : "+toplam2+" Toplam : "+(toplam1+toplam2));
    }
}
