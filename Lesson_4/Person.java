// первое и второе задание
package Lesson_4;

public class Person {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int money;
    private int age;
    public Person(String name, String position, String email, int phone, int money, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.money = money;
        this.age = age;
    }
    public void console() {
        System.out.println();
        System.out.println("ФИО - " + name);
        System.out.println("должность - " + position);
        System.out.println("почта - " + email);
        System.out.println("телефон - " + phone);
        System.out.println("зарплата - " + money );
        System.out.println("возраст - " + age);
    }
    public static void main (String[] args){
         Person[] persArray = new Person[5];
         persArray[0] = new Person("Ivanov Ivan", "Engineer", "i@mail.ru", 123456789, 51000, 25);
         persArray[1] = new Person("Ibanov Evan", "QA", "v@mail.ru", 123456789, 52000, 26);
         persArray[2] = new Person("Ilanov Rivan", "Manul", "a@mail.ru", 123456789, 53000, 27);
         persArray[3] = new Person("Ikanov Ovan", "AQA", "n@mail.ru", 123456789, 54000, 28);
         persArray[4] = new Person("Ishanov Avan", "Java", "an@mail.ru", 123456789, 55000, 29);
         for (Person person : persArray) {
            person.console();
         }
    }
}
