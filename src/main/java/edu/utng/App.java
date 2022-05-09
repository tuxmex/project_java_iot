package edu.utng;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea tu nombre:");
        String name = s.nextLine();
        System.out.println("Name: "+name);
    }
}
