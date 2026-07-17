package com.example.singletondesignpattern;

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    public ThreadSafeSingleton(){

    }

    public static ThreadSafeSingleton getInstance(){

        if (instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {
      ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();
      ThreadSafeSingleton obj2 = ThreadSafeSingleton.getInstance();
      if(obj1 == obj2){
          System.out.println("true");
      }else {
          System.out.println("false");
      }
    }
}
