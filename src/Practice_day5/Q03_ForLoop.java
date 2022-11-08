package Practice_day5;

public class Q03_ForLoop {

      /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {
        for (int i = 1; i <=3 ; i++) {
            System.out.println("");
            for (int j = 1; j <=5 ; j++) {
                System.out.print(" *");
            }
        }
    }
}
