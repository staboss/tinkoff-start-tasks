package com.staboss.fintech.java;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int l = scanner.nextInt();
        final int k = scanner.nextInt();
        final int m = scanner.nextInt();
        scanner.close();

        int tempL = k;
        int counter = 1;

        while (tempL < l) {
            tempL += m;
            counter++;
        }

        System.out.println(tempL == l ? counter : -1);
    }
}
