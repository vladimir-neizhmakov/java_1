package ru.geekbrains.java_one.lesson_04;

public class Horse extends Animal {

    private int limitSwim;

    public Horse(String name){
        super(name,1500,3f);
        this.limitSwim = 100;
    }

    public boolean swim(float param){return param<=limitSwim;}

    @Override
    public boolean run(float param){return param<=this.getLimitRun();}
    @Override
    public boolean jump(float param){return param<=this.getLimitJump();}

    public int getLimitSwim(){return this.limitSwim;}
    public void setLimitSwim(int limitSwim){this.limitSwim = limitSwim;}
}
