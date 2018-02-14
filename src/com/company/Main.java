package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	Recurtiond  f = new Recurtiond();

        int usernumber = scanner.nextInt();

        System.out.println("Факториал " + usernumber + " равен "
                + f.fact(usernumber));
    }
}
