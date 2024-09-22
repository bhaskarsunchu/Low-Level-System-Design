package com.scaler.lld.SingletonDesignPattern;

public class Singleton {

    // Step 1: Create a private static variable to hold the single instance of the class
    private static Singleton instance;

    // Step 2: Create a private constructor to prevent external instantiation
    private Singleton(){
    }

    /* Step 3: Provide a public static method to get the single instance of the class
               Double-checked locking for thread safety and performance optimization */
    public static Singleton getInstance(){
        // First check (No locking here)
        if(instance == null){
            // synchronization by locking only during the initial instantiation
            synchronized (Singleton.class) {
                // Second check (Inside locking)
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        // Step 4: Return the single instance of the class
        return instance;
    }
}
