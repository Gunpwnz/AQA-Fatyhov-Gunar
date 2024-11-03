package Lesson_3;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scan.nextInt();
        boolean isLeapYears = years(year);
        System.out.println(year + ": " + isLeapYears);
        scan.close();
    }
    public static boolean years(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        
    }

}
