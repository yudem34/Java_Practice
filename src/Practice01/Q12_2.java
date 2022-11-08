package Practice01;

import java.util.Scanner;

public class Q12_2 {
    public static void main(String[] args) {
        System.out.print("lutfen is unvaninizi giriniz :");
        Scanner scan=new Scanner(System.in);
        String jobTitle = scan.nextLine().toLowerCase();

        switch(jobTitle){
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Developer");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("yanlis formatta jobtitle bilgisi girdiniz...");

        }

    }
}
