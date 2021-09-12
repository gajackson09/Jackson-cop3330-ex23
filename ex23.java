/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program creates a program that walks the user through troubleshooting issues with a car
import java.util.Scanner;
public class ex23{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
            char issue = input.next().charAt(0);
            if (issue == 'y'){

            System.out.print("Are the Battery terminals corroded? ");
                issue  = input.next().charAt(0);
            if (issue == 'y')
                System.out.println("Clean the terminals and try starting again.");

            else
                System.out.println("Replace cables and try again");
            }//end of car silent question 
        
            else {
                System.out.print("Does the car make a slicking noise? ");
                issue  = input.next().charAt(0);
            if (issue  == 'y')
                System.out.println("Replace the Battery.");
            else {
                System.out.print("Does the car crank up but fail to start? ");
                issue  = input.next().charAt(0);
                if (issue  == 'y')
                    System.out.println("Check spark plug connection.");
                else {
                    System.out.print("Does the engine start and then die? ");
                    issue  = input.next().charAt(0);
                    if (issue  == 'y') {
                        System.out.println("Does your car have fuel injection? ");
                        issue  = input.next().charAt(0);
                        if (issue  == 'y')
                            System.out.println("Get in it for service.");
                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    } else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }//end of all loops
    }//end of main
}//end of class