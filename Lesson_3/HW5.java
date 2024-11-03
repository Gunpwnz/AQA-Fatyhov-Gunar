package Lesson_3;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        numbers(a, b);
        in.close();
    }

    public static void numbers(int a, int b) {
        int sum = a + b;
        
        if (sum >= 10 && sum <= 20) {
            System.out.println("True");
        }
        
        else {
            System.out.println("False");
        }
    }
}
