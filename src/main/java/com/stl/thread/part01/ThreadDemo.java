package com.stl.thread.part01;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start(); // main and child thread runs
        
       // t.run(); // only child thread runs
        for (int i=0;i<10;i++)
            System.out.println("Main  Thread!");
    }
}
