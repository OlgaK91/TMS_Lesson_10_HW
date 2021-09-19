package com.tms.task3;

public final class MyImmutableClass {
    private final String myName;
    private final Integer myAge;

    private MyImmutableClass(String name,Integer age){
        this.myName = name;
        this.myAge = age;
    }

    public static MyImmutableClass createNewObject(String name,Integer age){
        return new MyImmutableClass(name,age);
    }

    public String getMyName() {
        return myName;
    }

    public Integer getMyAge() {
        return myAge;
    }

    @Override
    public String toString() {
        return myName + " " + myAge;
    }
}
