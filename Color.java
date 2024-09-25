
package com.example.controller;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rushav
 */
public class Color {
    public static void addNewProduct(String[] args) {
        Scanner ScanObj = new Scanner(System.in);
        System.out.println("Enter Model Code, Price, Card Slot");
        
        String modCode = ScanObj.nextLine();
        double price = ScanObj.nextDouble();
        boolean cardSlot = ScanObj.nextBoolean();  
        
        ArrayList<String> variants;
        
        ArrayList<String> ArrayListObj = new ArrayList<String>();
        boolean end = false;
        
        while(end == false) {
            System.out.println("Enter the color");
            ArrayListObj.add(ScanObj.nextLine());
            System.out.println("Do you want to continue?");
            if(ScanObj.nextLine() == "n"){
                end = true;
                
            }
            
        }
        ArrayList <String> color = ArrayListObj;
        
    }
    
}
