package com.scaler.lld.PrototypeDesignPattern;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry) {
        Student student1 = new Student();
        student1.setAvgBatchPsp(75.0);
        student1.setBatch("June23 Beginner Monday Morning");
        studentRegistry.register("student1",
                student1);
        IntelligentStudent intelligentStudent1 = new IntelligentStudent();
        intelligentStudent1.setAvgBatchPsp(75.0);
        intelligentStudent1.setBatch("June23 Beginner Monday Morning");
        intelligentStudent1.setIq(170);
        studentRegistry.register("intelligentStudent1", intelligentStudent1);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);
        Student bhaskar = studentRegistry.get("student1").clone();
        bhaskar.setName("Bhaskar");
        bhaskar.setAge(24);
        bhaskar.setPsp(90.0);
        System.out.println("Student : " + bhaskar.getName() + " -> " + bhaskar);
        Student Shekar = studentRegistry.get("intelligentStudent1").clone();
        Shekar.setName("Shekar");
        Shekar.setAge(23);
        Shekar.setPsp(99.99);
        System.out.println("Intelligent Student : " + Shekar.getName() + " -> " + Shekar);
    }
}
