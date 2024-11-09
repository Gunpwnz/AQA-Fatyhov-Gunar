package Lesson_5;

public class Animal {
    String name;
    int maxRun;
    int maxSwim;

    Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не может пробежать ");
        }
    }

    public void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.println(name + " проплыл " + distance + " метров");
        } else {
            System.out.println(name + " не может проплыть ");
        }
    }
}
class Cat extends Animal {
    Cat(String name) {
        super(name, 200, 0);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name, 500, 10);
    }
}

class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик");
        Dog bobik = new Dog("Шарик");

        barsik.run(100);
        barsik.swim(0);

        bobik.run(150);
        bobik.swim(10);

        System.out.println("Всего животных: 2");
        System.out.println("Котов: 1");
        System.out.println("Собак: 1");
    }
}