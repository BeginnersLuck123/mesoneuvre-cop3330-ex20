package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double order = input.nextDouble();//Input
        System.out.println("What state do you live in?");
        input.nextLine();//Cleans buffer
        String state = input.nextLine();//Input
        double tax = .05;
        double total = order;
        //IF/ELSE statements that changes tax based on state and county
        if(state.equals("Wisconsin"))
        {
            System.out.println("What county do you live in?");
            String county = input.nextLine();//Input
            if(county.equals("Dane"))
            {
                tax = tax;
            }
            if(county.equals("Dunn"))
            {
             tax += .004;

            }
            else if(county.equals("Eau Claire"))
            {
             tax += .005;

            }

        }
        else if (state.equals("Illinois"))
        {
            tax = 0;
            tax += .08;

        }
        else
        {
            tax = 0;
            total = order;
        }
        //Calculates total order with tax
        tax = tax * order;
        total = order + tax;
        System.out.println("The tax is $" + tax +  ". \nThe total is $" + total + "." );//Output

    }
}
