package practiceday8;

import java.util.ArrayList;
import java.util.List;

public class Q01_ForEach {

    // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
    // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..


    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

        int n = 4;
        List<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        List<Integer> maxList = new ArrayList<>();
        int count = 1;
        System.out.println(list);



    }
}