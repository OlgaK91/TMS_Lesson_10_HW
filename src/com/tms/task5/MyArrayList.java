package com.tms.task5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList<T>{
    private T[] t;

    public MyArrayList(){
       this.t = (T[]) new Object[10];
    }

    public MyArrayList(Class<T> type,int capacity){
        this.t = (T[]) Array.newInstance(type,capacity);
    }

    public T getByIndex(int i) {
        return t[i];
    }

    public T[] addNew(T newElemnt){
        Arrays.fill(t,newElemnt);
        return t;
    }

    public T[] deleteElem(T elem){
        Arrays.stream(t).filter(a -> a != elem).toArray();
        return t;
    }

    public int checkElem(T elem){
        int index = Arrays.binarySearch(t,elem);
        return index;
    }

    public T[] clear(){
        t =(T[]) Array.newInstance(t.getClass(),t.length);
        return t;
    }

}
