package com.xpanxion.assignments.student;

import java.util.*;
import java.util.StringTokenizer;

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
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
