package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        System.out.println("Before changing the data : "+obj.getVar1());
        obj.setVar1(40);
        System.out.println("After changing the data : "+obj.getVar1());
        //'var1' has private access in 'com.driver.RWOnly'
    }
}