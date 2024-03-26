package com.stl.thread.sleep;


public class ThreadSleepDemo {

    public static void main(String[] args) {
        MyThread t= new MyThread();
        t.start();
        t.interrupt();
        System.out.println("End of Main");


    }
}

/*
* because of yeild method child thread always calls yeild method ,
* becase of that main thread will get chance to run more number of times
*
* */