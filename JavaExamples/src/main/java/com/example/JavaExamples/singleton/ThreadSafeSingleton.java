package com.example.JavaExamples.singleton;

class ThreadSafeSingle{

    private static volatile ThreadSafeSingle instance;


    public static ThreadSafeSingle getInstance(){

        if(instance == null){
            synchronized (ThreadSafeSingle.class){
                if(instance == null){
                   instance = new ThreadSafeSingle();
                }
            }

        }
        return instance;

    }
}

public class ThreadSafeSingleton {
    public static void main(String[] args) {

        ThreadSafeSingle obj1 = ThreadSafeSingle.getInstance();
        ThreadSafeSingle obj2 = ThreadSafeSingle.getInstance();

        if(obj1 == obj2){
            System.out.println(true);
        }
    }

}
