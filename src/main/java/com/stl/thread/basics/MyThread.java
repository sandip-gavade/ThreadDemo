package com.stl.thread.basics;

public class MyThread extends Thread{


    @Override
    public void run() {
        //super.run();
        for (int i=0;i<10;i++)
        System.out.println("Child Thread!");
    }


}