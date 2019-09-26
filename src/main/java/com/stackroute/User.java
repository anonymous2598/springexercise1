package com.stackroute;

public class User {
    private String name;
    public User(String s)
    {
        this.name=s;
    }
    public User( ){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
