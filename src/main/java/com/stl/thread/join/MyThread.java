package com.stl.thread.join;

public class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Vijay Thread");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
