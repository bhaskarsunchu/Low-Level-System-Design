package com.scaler.lld.AdapterDesignPattern;

public class PhonePe {
    //Ideally we should use Dependency Injection here.
    private static BankAPI bankAPI = new YesBankAdapter();

    public static void main(String[] args) {
        bankAPI.sendMoney("1234", "9876", 1000);
    }
}
