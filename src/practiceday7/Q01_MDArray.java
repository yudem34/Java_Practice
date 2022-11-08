package practiceday7;

public class Q01_MDArray {

    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min number print et
     */
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
        int minNumber = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (minNumber > arr[i][j]) {
                    minNumber = arr[i][j];
                }
            }
        }
        System.out.println("Min. Number : " + minNumber);
    }
}