package Lesson_3;

public class HW12 {
    public static void main(String[] args) {
        int[] numb = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < 6) {
                System.out.println(numb[i] * 2);
            }
            else {
                System.out.println(numb[i]);
            }
                
        }
    }

}