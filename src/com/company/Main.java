package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int x = scan.nextInt();
        scan.nextLine();

        System.out.println("Numbers from 1 to your number");

        for (int i = 1; i <= x; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

