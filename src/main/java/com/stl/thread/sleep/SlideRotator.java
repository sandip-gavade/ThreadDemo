package com.stl.thread.sleep;

public class SlideRotator {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Slide -" +i);
            Thread.sleep(1000);
        }
    }
}


/*
* try i=10000
* and rerun the code
* */