package com.tms.task0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Task0 {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            newList.add(2 + random.nextInt(98));
        }
        System.out.println(newList);
        System.out.println(Collections.max(newList));
        Collections.sort(newList);
        System.out.println(newList);
        System.out.println(newList.get(newList.size()-2));
    }
}
