package practiceday8;

import java.util.ArrayList;
import java.util.List;

public class Q03_Tekrar {
    public static void main(String[] args) {
        int[] arr = {2, 5, -9, 45, 43, 11, 8, 102, 47, 0};
        int n = 4;
        List<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        List<Integer> maxList = new ArrayList<>();
        int count = 1;
        while (count <= n) {
            int max = list.get(0);  // listin ilk elemanı max olsun
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max) {      // listenin herhangi bir elemanı max dan buyukse
                    max = list.get(i);     // max artık o eleman olsun
                }
            }
            maxList.add(max);
            list.remove(list.indexOf(max)); // Tekrar sayiya bakmaması için kaldırdık.
            count++;
        }
        System.out.println("Arrayin max elemanı :  " + maxList);
    }
}
