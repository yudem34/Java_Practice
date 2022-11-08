package Practice_day4;

public class Y01_Tekrar {
    public static void main(String[] args) {
        kelime("karalahana");
    }

    private static void kelime(String str) {
        String output="";
        for (int i = 0; i <str.length() ; i++) {
            if (!output.contains(str.substring(i,i+1))){
                output += str.substring(i,i+1);
            }
        }
        System.out.println(output);
    }
}