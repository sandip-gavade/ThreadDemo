package com.stl.thread.sleep;

public class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("I am lazy thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("I got interrupted");
               // throw new RuntimeException(e);
            }
        }
    }
}
