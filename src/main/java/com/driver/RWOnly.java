package com.driver;

public class RWOnly {
    private String name;


    public RWOnly() {
        name="Default value";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
