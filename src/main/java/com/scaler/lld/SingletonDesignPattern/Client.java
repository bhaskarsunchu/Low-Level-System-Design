package com.scaler.lld.SingletonDesignPattern;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Client {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            ThreanClient threanClient = new ThreanClient();
            Thread t = new Thread(threanClient);
            t.start();
        }
    }
}
