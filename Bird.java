package ru.geekbrains.java_one.lesson_04;

public class Bird extends Animal {

    public Bird(String name){super(name,5,0.2f);}

    @Override
    public boolean run(float param){return param<=this.getLimitRun();}

    @Override
    public boolean jump(float param){return param<=this.getLimitJump();}
}
