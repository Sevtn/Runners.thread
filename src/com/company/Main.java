package com.company;

public class Main {
    public static void main(String[] args) {


//create runners
        Runner runner1 = new Runner("Runner 1", 5,1000,5);
        Runner runner2 = new Runner("Runner 2", 5,1000,5);
        Runner runner3 = new Runner("Runner 3", 5,1000,5);


//create thread
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        Thread thread3 = new Thread(runner3);


//start thread
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
