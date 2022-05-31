package com.example.helloWorld;
import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the guessing game");
        System.out.println("Your Name Please");
        String name = sc.next();
        System.out.println("Hello " + name);
        System.out.println("Can we Start the game");
        System.out.println("1 = YES");
        System.out.println("2 - NO");
        int ans = sc.nextInt();
        if (ans == 1)
        {
            System.out.println("LETS START THE GAME!!");
            for (int i = 0; i < 5; i++)
            {
            System.out.println("enter a random number between 1 and 6");
            int input = sc.nextInt();
            int result = (int) (Math.random() * (6 - 1 + 1)) + 1;

                if (input == result) {
                    System.out.println("My number "+result);
                    System.out.println("you won");
                    System.exit(0);
                }
                else {
                    System.out.println("My number "+result);
                    System.out.println("Try again");
                }
            }
            System.out.println("you LOST!");
        }
        else {
            System.out.println("THANK YOU FOR YOUR TIME");
        }
    }
}