package Lesson_3;

public class HW3 {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 175;

        if (value < 0) {
            System.out.println("Красный");
        }
        else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
}

