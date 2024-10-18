package com.scaler.lld.BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Student s = Student.getBuilder()
                .setAge(19)
                .setName("Bhaskar")
                .setGradYear(2020)
                .setPhoneNo("329u32932")
                .build();
        System.out.println("Student :  " + s);
    }
}
