package recap1;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
    char h='A';
        System.out.println(h=='A'? "Gayet basarili":h=='B'?"Barasili":h=='C'? "Ha gayret":"Diğerleri");
    }
}
