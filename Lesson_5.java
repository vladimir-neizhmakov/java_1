package ru.geekbrains.java_one.lesson_04;

public class Lesson_5 {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Матрос");
        Horse horse1 = new Horse("Анжела");
        Bird bird1 = new Bird("Кеша");

        if (dog1.run(150)) System.out.println("Песик "+dog1.getName()+" пробежал!");
        dog1.setLimitJump(1.5f);
        if (dog1.jump(1)) System.out.println("Песик "+dog1.getName()+" прыгнул!");
        if (dog1.swim(5)) System.out.println("Песик "+dog1.getName()+" проплыл!");

        System.out.println("----");

        cat1.setLimitRun(100);
        if (cat1.run(150)) System.out.println("Кот "+cat1.getName()+" пробежал!");
        if (cat1.jump(1)) System.out.println("Кот "+cat1.getName()+" прыгнул!");

        System.out.println("----");

        bird1.setLimitJump(0.05f);
        if (bird1.run(5)) System.out.println("Птичка "+bird1.getName()+" пробежала!");
        if (bird1.jump(0.1f)) System.out.println("Птичка "+bird1.getName()+" прыгнула!");

        System.out.println("----");

        if (horse1.run(1000)) System.out.println("Лошадка "+horse1.getName()+" пробежала!");
        if (horse1.jump(1)) System.out.println("Лошадка "+horse1.getName()+" прыгнула!");
        horse1.setLimitSwim(50);
        if (horse1.swim(90)) System.out.println("Лошадка "+horse1.getName()+" проплыла!");

    }
}
