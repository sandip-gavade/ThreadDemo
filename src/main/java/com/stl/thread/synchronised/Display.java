package com.stl.thread.synchronised;

public class Display {

    synchronized public static void  wish(String name){

        for (int i = 0; i <10 ; i++) {
            System.out.println("Good morning Mr :"+name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Name is:"+name);
                //throw new RuntimeException(e);
            }
        }
    }
}

/*
* run the same code by removing synchronised keyword.
* */
