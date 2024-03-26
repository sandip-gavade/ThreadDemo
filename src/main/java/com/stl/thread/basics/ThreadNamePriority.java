package com.stl.thread.basics;

public class ThreadNamePriority {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        /*
         * set main thread priority to 7
         * and then automatically child thread priority will get set to 7
         * */
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        ThreadName t = new ThreadName();
        System.out.println(t.getName());
        System.out.println(t.getPriority());


    }

}
