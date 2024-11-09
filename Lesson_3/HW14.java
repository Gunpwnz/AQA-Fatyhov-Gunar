package Lesson_3;

public class HW14 {
    public static int[] Array(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void main(String[] args) {
        int len = 5;
        int initialValue = 15;
        int[] resultArray = Array(len, initialValue);
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }
}

