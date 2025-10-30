package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=0;
        while(true){    //keep going through the loop until the input entered is correct
            System.out.println("Enter your age:");
            String text = sc.nextLine();
            //I'm trying to assign the value enter into an int.
            try {
                age=Integer.parseInt(text);
                System.out.println("Thanks ! You have entered age = "+age);
                break;
            }catch(NumberFormatException e){    //catching the error if the input is not a number
                System.out.println("Invalid input" + e.getMessage());
            }
        }
    }
}