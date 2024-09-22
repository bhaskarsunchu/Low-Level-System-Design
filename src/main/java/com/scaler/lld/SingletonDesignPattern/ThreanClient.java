package com.scaler.lld.SingletonDesignPattern;

public class ThreanClient implements Runnable{
    @Override
    public void run() {
        System.out.println(Singleton.getInstance() + " -> " + Thread.currentThread().getName());
    }
}
