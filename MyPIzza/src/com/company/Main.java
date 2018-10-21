package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Pizza mypizza = new Pizza();
            System.out.println("What is the size of the pizza you would like?");
            mypizza.setSize(scan.nextLine());
            System.out.println("Enter in discount code if you have one.");
            mypizza.setDiscountCode(scan.nextLine());
            System.out.println("How many toppings would you like?");
            mypizza.setNumToppings(scan.nextInt());
            mypizza.printReport();
        }
    }
