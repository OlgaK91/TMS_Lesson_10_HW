package com.tms.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> newList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i <= 5) {
            i++;
            newList.add(scanner.next());
        }
        scanner.close();
        System.out.println(newList);
        for (i = 0; i < newList.size(); i++) {
            newList.set(i, newList.get(i).replace("+", "+++"));
        }
        System.out.println(newList);
    }
}