package Lesson_4;

public class Sotrudnik {
    String name;
    String position;
    String email;
    int phone;
    int money;
    int age;
    public Sotrudnik(String name, String position, String email, int phone, int money, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.money = money;
        this.age = age;
    }
    public void console() {
        System.out.println("ФИО - " + name);
        System.out.println("должность - " + position);
        System.out.println("почта - " + email);
        System.out.println("телефон - " + phone);
        System.out.println("зарплата - " + money );
        System.out.println("возраст - " + age);
    }
    public static void main (String[] args){
        Sotrudnik employee = new Sotrudnik("Fatyhov Gunar", "QA Engineer Java", "gunarfat@ya.ru", 123456789, 50000, 34);
        employee.console();
    }
}
