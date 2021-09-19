package com.tms.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<String> fileList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a = scanner.next();
            if (a.equals("0")) {
                break;
            } else {
                fileList.add(a);
            }
        }
        scanner.close();
        HashSet<String> docSet = new HashSet<>();
        for (String a : fileList) {
            try (BufferedReader file = new BufferedReader(new FileReader(a))) {
                String line = file.readLine();
                while (line != null && !line.isBlank()) {
                    docSet.add(line);
                    line = file.readLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        HashMap<String, String> reportMap = new HashMap<>();
        for (String a : docSet) {
            reportMap.put(a, checkValidity(a));
        }
        String reportPath = "report.txt";

        try (BufferedWriter reportFile = new BufferedWriter(new FileWriter(reportPath))) {
            for (String key : reportMap.keySet()) {
                reportFile.write(key + " " + reportMap.get(key) + System.getProperty("line.separator"));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static String checkValidity(String line) {

        String valid = "valid";
        String reasonInvalidity = "";
        if (line.length() > 15) {
            valid = "invalid";
            reasonInvalidity = reasonInvalidity + " длина номера больше 15 символов";
        }
        if (!(line.startsWith("docnum") || line.startsWith("kontract"))) {
            valid = "invalid";
            reasonInvalidity = reasonInvalidity + " начало номера не соответсвует шаблону(\"docnum\" или \"kontract\")";
        }
        if (!line.replaceAll("[A-Z a-z 0-9]", " ").trim().isBlank()) {
            valid = "invalid";
            reasonInvalidity = reasonInvalidity + " номер содержит спецсимволы";
        }
        return valid + reasonInvalidity;
    }
}
