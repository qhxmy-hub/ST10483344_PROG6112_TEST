/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number1electronics;
import java.util.*;
/**
 *
 * @author Student
 */
public class RunApplication {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select the beverage type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. Switch");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        input.nextLine();

        System.out.print("Enter the Store: ");
        String town = input.nextLine();

        ConsoleType ConsoleType;

        if (choice == 1) {
            consoleType = consoleType.getConsoleType;
        } else {
            consoleType = consoleType.getConsoleType;
        }

        System.out.print("Enter the total sales for "
                + town + ": ");
        int total = input.nextInt();

        printConsoleSalesReport report =
                new printConsoleSalesReport(consoleType, town, total);

        report.printConsoleSalesReport();
    }
}
}
