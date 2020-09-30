package com.staboss.fintech.java;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int d = scanner.nextInt();
        scanner.close();

        final int abcd = a * b + c * d;
        final int acbd = a * c + b * d;
        final int adbc = a * d + b * c;

        System.out.println(Integer.max(abcd, Integer.max(acbd, adbc)));
    }
}
