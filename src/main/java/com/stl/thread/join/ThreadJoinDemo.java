package com.stl.thread.join;

public class ThreadJoinDemo {

    /*
    * If thread wants to wait until completing some other thread then we should go for JOin()
    * */
    public static void main(String[] args) throws InterruptedException {
        MyThread t= new MyThread();
        t.start();

        //t.join();
        t.join(10000);

        for(int i=0;i<10;i++){
            System.out.println("Sandip Thread");
            Thread.yield();
        }
    }
}
