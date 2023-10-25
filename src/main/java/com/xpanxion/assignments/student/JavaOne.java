package com.xpanxion.assignments.student;

import java.util.*;
import java.util.StringTokenizer;
import java.util.regex.*;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Student 1: ex1.");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = console.nextLine();
        console.close();

        System.out.println("Your name in upper case is: " + name.toUpperCase());
    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = console.nextLine();
        console.close();

        int uppercaseCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                uppercaseCounter += 1;
            }
        }

        System.out.println("Number of uppercase letters: " + uppercaseCounter);
    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = console.nextLine();

        StringTokenizer inputTokens = new StringTokenizer(input, " ");
        console.close();

        int x = 1;
        while (inputTokens.hasMoreTokens()) {
            if(x == 1){
                System.out.print(inputTokens.nextToken().toUpperCase() + " ");
                x *= -1;
            }
            else{
                System.out.print(inputTokens.nextToken() + " ");
                x *= -1;
            }
        }
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = console.nextLine();
        console.close();

        StringBuilder inputReverse = new StringBuilder(input);
        if (input.equals(inputReverse.reverse().toString())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
        Scanner console = new Scanner(System.in);

        int vowel = 0;
        int consonant = 0;
        String input;

        do {
            System.out.println("Enter a word or sentence: ");
            input = console.nextLine();

            if (input.equals("quit")) {
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                switch (input.toLowerCase().charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowel += 1;
                    case ' ':
                    case '.':
                    case '?':
                    case '!':
                        continue;
                    default:
                        consonant += 1;
                }
            }
            System.out.println("Number of vowels: " + vowel);
            System.out.println("Number of consonants: " + consonant);
        }
        while (!input.equals("quit"));

        console.close();
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = console.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = console.nextInt();

        console.close();
        System.out.println("Result: " + (num1 + num2));
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = console.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = console.nextInt();

        System.out.println("Enter an operation: add, sub, mul, div");
        String operation = console.next();

        if (true) {
            switch (operation.toLowerCase()) {
                case "add":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "sub":
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case "mul":
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case "div":
                    System.out.println("Result: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Not valid entry");
            }
        }
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
        Scanner console = new Scanner(System.in);

        System.out.print("Enter price per square feet: ");
        double price = console.nextDouble();
        double totalCost = 0;

        while (true) {
            System.out.println("Enter room dimensions (width x height): ");
            String dimensions = console.next();

            if (dimensions.equalsIgnoreCase("done")) {
                break;
            }

            String[] dimensionsSplit = dimensions.split("x");

            int width = Integer.parseInt(dimensionsSplit[0]);
            int height = Integer.parseInt(dimensionsSplit[1]);

            totalCost += price * (width * height);
        }
        console.close();
        System.out.printf("Total cost: $%.2f", totalCost);
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
        Scanner console = new Scanner(System.in);
        int answer = (int)(Math.random() * 5) + 1;
        int number = 0;

        do {
            System.out.print("Guess the number from 1-5: ");
            number = console.nextInt();

            System.out.println("Try again.");
        }
        while (number != answer);

        console.close();
        System.out.println("You guessed it!");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = console.nextLine();

        String[] inputSplitter = input.split(" ");

        for (int i = 0; i < inputSplitter.length; i++) {
            for (int j = 0; j < inputSplitter[i].length(); j++) {
                int count = 0;
                while (count < j) {
                    System.out.print(" ");
                    count++;
                }
                System.out.println(inputSplitter[i].charAt(j));
            }
        }
    }

    //
    // Private helper methods
    //
}
