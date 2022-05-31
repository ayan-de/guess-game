package com.example.helloWorld;
import java.util.Random;
import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Welcome to the guessing game");
        System.out.println("Your Name Please");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Can we Start the game");
        System.out.println("1 = YES");
        System.out.println("2 - NO");
        int ans = sc.nextInt();
        int timesTired = 0;
        if (ans == 1)
        {
            System.out.println("LETS START THE GAME!!");
            for (int i = 0; i < 5; i++)
            {
            System.out.println("enter a random number between 1 and 6");
            int input = sc.nextInt();
            int x = r.nextInt(6)+1;
            //int result = (int) (Math.random() * (6 - 1 + 1)) + 1;

                if (input == x) {
                    System.out.println("My number "+x);
                    System.out.println("you won");
                    System.exit(0);
                }
                else {
                    timesTired ++;
                    System.out.println("My number "+x);
                    System.out.println("Try again. TRY number:"+timesTired);
                }
            }
            System.out.println("you LOST!");
        }
        else {
            System.out.println("THANK YOU FOR YOUR TIME");
        }
    }
}