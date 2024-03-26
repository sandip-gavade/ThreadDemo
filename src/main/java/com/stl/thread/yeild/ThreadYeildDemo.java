package com.stl.thread.yeild;

public class ThreadYeildDemo {

    public static void main(String[] args) {
        MyThread t= new MyThread();
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
            Thread.yield();
        }
    }
}

/*
* because of yeild method child thread always calls yeild method ,
* becase of that main thread will get chance to run more number of times
*
* */