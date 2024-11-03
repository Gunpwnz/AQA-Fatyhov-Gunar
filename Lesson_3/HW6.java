package Lesson_3;
import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        numbers(a);
        scan.close();
    }

    public static void numbers(int a) {
        
        
        if (a >= 0) {
            System.out.println("Положительное");
        }
        
        else {
            System.out.println("Отрицательное");
        }
    }
}

