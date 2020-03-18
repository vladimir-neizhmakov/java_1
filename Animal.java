package ru.geekbrains.java_one.lesson_04;

public abstract class Animal {
    private String name;
    private int limitRun;
    private float limitJump;

    public Animal (String name, int limitRun, float limitJump){
    this.name = name;
    this.limitRun = limitRun;
    this.limitJump = limitJump;
    }

    public abstract boolean run(float param);

    public abstract boolean jump(float param);

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    public int getLimitRun(){return this.limitRun;}
    public void setLimitRun(int limitRun){this.limitRun = limitRun;}

    public float getLimitJump(){return this.limitJump;}
    public void setLimitJump(float limitJump){this.limitJump = limitJump;}
}
