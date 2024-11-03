package Lesson_3;


public class HW8 {
    public static void main(String[] args) {
        String text = "Privet";
        int times = 6;
        numbers(text, times);
        
    }

    public static void numbers(String txt, int chislo) {
        for (int i = 0; i < chislo; i++){
            System.out.println(txt);
        }
        
        
    }
}