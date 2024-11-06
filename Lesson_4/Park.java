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
        System.out.println("Название " + nameAttraction);
        System.out.println("Рабочее время " + workTime);
        System.out.println("Цена - " + price + "$");
    }
    public static void main (String[] args){
        Park southPark = new Park("Южный парк", "с 11:00 до 23:00", 10);
        southPark.console();
        
    }
}

