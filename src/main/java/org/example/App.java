/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        // Prompt for quote
        System.out.println( "What is the quote? " );
        String quote = scan.nextLine();

        // Prompt for who said the quote
        System.out.println( "Who said it? ");
        String speaker = scan.nextLine();

        // Print who says the quote and the quote in quotation
        System.out.println( speaker+ " says, " + "\"" +quote+ "\" " );

    }
}
