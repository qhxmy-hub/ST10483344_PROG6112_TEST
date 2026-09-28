/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number1electronics;

public abstract class Console {
    String getConsoleType();
    String getStore();
    int getTotalSales();

 public void printConsoleSalesReport() {

        System.out.println("Console sales Report");
        System.out.println("****************************");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store: " + getStore());
        System.out.println("Total Sales: " + getTotalSales());
        System.out.println("****************************");
}
 
 
