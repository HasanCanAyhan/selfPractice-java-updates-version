package com.cydeo.yt_practice2;


class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run method called ...");
    }


}

public class RunnableLambdaExample {

    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        //using lambda : Runnable is functional interface

        Runnable runnableLambda = () -> System.out.println("run method called using Lambda ...");

        Thread threadLambda = new Thread(runnableLambda);
        threadLambda.start();


    }

}
