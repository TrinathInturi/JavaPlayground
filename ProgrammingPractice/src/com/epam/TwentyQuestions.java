package com.epam;

import java.util.Scanner;

public class TwentyQuestions {
    public void AskQuestions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question 1)Is it animal, vegetable, or mineral?");
        String type = scanner.next();
        System.out.println("Questions 2)Is it bigger than breadbox? (yes/no)");
        String flag = scanner.next();
        if (flag.toLowerCase().equals("yes")) {
            if (type.toLowerCase().equals("animal")) {
                System.out.println("You are thinking about moose!");
            }
            if (type.toLowerCase().equals("vegetable")) {
                System.out.println("You are thinking about watermelon!");
            }
            if (type.toLowerCase().equals("mineral")) {
                System.out.println("You are thinking about camaro!");
            }
        } else {
            if (type.toLowerCase().equals("animal")) {
                System.out.println("You are thinking about squirrel!");
            }
            if (type.toLowerCase().equals("vegetable")) {
                System.out.println("You are thinking about carrot!");
            }
            if (type.toLowerCase().equals("mineral")) {
                System.out.println("You are thinking about paper clip!");
            }
        }
        scanner.close();
    }
}
