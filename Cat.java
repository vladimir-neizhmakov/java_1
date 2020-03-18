package ru.geekbrains.java_one.lesson_04;

public class Cat extends Animal {

    public Cat(String name){super(name,200,2f);}

    @Override
    public boolean run(float param){return param<=this.getLimitRun();}
    @Override
    public boolean jump(float param){return param<=this.getLimitJump();}
}
