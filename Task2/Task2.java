package com.staboss.fintech.java;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String number = scanner.nextLine();
        scanner.close();

        int counter = 0;
        int n = 0;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                counter++;
            } else if (i != number.length() - 1) {
                n += counter;
                counter = 0;
            }
        }

        System.out.println(n);
    }
}
