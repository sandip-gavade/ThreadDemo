package com.stl.thread.synchronised;

public class SynchronisedDemo {
    public static void main(String[] args) {
        Display d=new Display();

        MyThread thread1= new MyThread(d,"Sandip");
        MyThread thread2= new MyThread(d,"Vijay");

        thread1.start();
        thread2.start();
    }
}
