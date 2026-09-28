/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronics;
import java.util.*;
/**
 *
 * @author Student
 */
public class Number1Electronics {

    public static void main(String[] args) {
       
        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // Two-dimensional array containing the consoles data
        int[][] consoles = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Single-dimensional arrays for the headings
        String[] cities = {"Cape Town", "Port Elizabeth","Pretoria"};
        String[] console = {"PS5", "XBOX", "SWITCH"};

        // Total sales for each city
        System.out.println("-----------------------------------------------");
        System.out.println("CONSOLE TOTAL SALES FOR EACH CITY");
        System.out.println("----------------------------------------------");
          
        // Print column headings
        System.out.printf("%-10s %-12s %-12s %-12s%n",
                "", console[0], console[1], console[2]);

        // Print sales data
        for (int row = 0; row < consoles.length; row++) {

            System.out.printf("%-10s", cities[row]);

            for (int column = 0; column < consoles[row].length; column++) {

                System.out.printf("%-12d", consoles[row][column]);
            }

            System.out.println();
        }

        System.out.println();
        // Calculate totals for each city
        for (int i = 0; i < cities.length; i++) {
         totals[i] = consoles[i][0] + consoles[i][1];
        }

        // Find town with highest total
        int highest = totals[0];
        int highestIndex = 0;

        for (int i = 1; i < totals.length; i++) {

            if (totals[i] > highest) {
                highest = totals[i];
                highestIndex = i;
            }
        }

        // Display report
        System.out.println();
        System.out.println("Console Sales Report");
        System.out.println("--------------------------------------");

        for (int i = 0; i < console.length; i++) {
            System.out.println(cities[i] + "\t\t"
                    + consoles[i][0] + "\t\t"
                    + consoles[i][1]);
        }

        System.out.println("--------------------------------------");
        System.out.println("CONSOLE SALES FOR EACH TOWN");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t\t" + totals[i]);
        }

        System.out.println("TOWN WITH THE MOST CONSOLE SALES: "
                + cities[highestIndex]);
        
        System.out.println("----------------------------");
    }
}
    
}
    }
}
