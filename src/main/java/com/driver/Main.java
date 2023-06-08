package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        System.out.println("Before changing the data : "+obj.getName());
        obj.setName("New Value");
        System.out.println("After changing the data : "+obj.getName());
        //'var1' has private access in 'com.driver.RWOnly'
    }
}