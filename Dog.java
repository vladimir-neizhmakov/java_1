package ru.geekbrains.java_one.lesson_04;

public class Dog extends Animal {

    private int limitSwim;

    public Dog(String name){
        super(name,500,0.5f);
        this.limitSwim = 10;
    }

    public boolean swim(float param){ return param<=limitSwim;}

    @Override
    public boolean run(float param){return param<=this.getLimitRun();}

    @Override
    public boolean jump(float param){return param<=this.getLimitJump();}

    public int getLimitSwim(){return this.limitSwim;}
    public void setLimitSwim(int limitSwim){this.limitSwim = limitSwim;}
}
