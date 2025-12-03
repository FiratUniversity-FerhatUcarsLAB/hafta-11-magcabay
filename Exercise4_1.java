

import java.util.Scanner;

public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {

        System.out.printf("%s, %s %d, %d%n", day, month, date, year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
      
        System.out.printf("%d %s %d, %s%n", date, month, year, day);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Günü giriniz : ");
        String day = scan.nextLine();

        System.out.print("Ayı giriniz : ");
        String month = scan.nextLine();

        System.out.print("Tarihi giriniz : ");
        int date = scan.nextInt();

        System.out.print("Yılı giriniz : ");
        int year = scan.nextInt();

        System.out.println("\n--- Amerikan Formatı ---");
        printAmerican(day, date, month, year);

        System.out.println("--- Avrupa Formatı ---");
        printEuropean(day, date, month, year);

    }

}
