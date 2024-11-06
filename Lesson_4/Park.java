// 3 задание
package Lesson_4;

public class Park {
    String nameAttraction;
    String workTime;
    int price;
    public Park(String nameAttraction, String workTime, int price) {
        this.nameAttraction = nameAttraction;
        this.workTime = workTime;
        this.price = price;
    }
    public void console() {
        System.out.println("Аттракцион: " + nameAttraction);
        System.out.println("Время работы " + workTime);
        System.out.println("Цена за 10 мин - " + price + "$");
    }
    public static void main (String[] args){
        Park ferrisWheel = new Park("Колесо обозрения", "с 11:00 до 23:00", 10);
        ferrisWheel.console();
        
    }
}

