package com.company;

import java.util.Random;

public class Runner extends Thread{

    private String name;
    private int steps;
    private int delay;
private int stepAmmount;

    Random rd = new Random();
//step delay randomizer
    int delay_all = rd.nextInt(500);
    int delay_each = rd.nextInt(500);

    //step ammount randomizer
    int step_all = rd.nextInt(10);
    int step_each = rd.nextInt(10);



    public Runner(String name, int steps, int delay, int stepAmmount) {
        this.name = name;
        this.steps = steps;
        this.delay =delay+delay_each;
        this.stepAmmount= stepAmmount+step_each;
    }

    @Override
    public void run() {
        //add steps to runner
        for (int i = 1; i <= steps+step_all; i++) {
            System.out.println(name + " is on step " + i);
            try {
                Thread.sleep(delay_all);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(name + " has finished the race");
    }
}
