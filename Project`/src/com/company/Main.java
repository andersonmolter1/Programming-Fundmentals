package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
/*Created Anderson Molter1
 * Programming Fundamentals
 * Dr. Dekhane*/
public class Main {
    public static void main(String[] args) {

        //11-13 are defining the different levels of discount the user can receive.
        //I subtracted the values by 1 so they would calculate the discounted price.
        final double smallDiscount = 0.98;
        final double midDiscount = 0.93;
        final double largeDiscount = 0.88;
        //15-17 are declaring the cost of each type of computer.
        final int ultraLapCost = 400;
        final int laptopCost = 800;
        final int serverCost = 1200;
        //this variable with represent the total cost after the discount is applied.
        int totalDisCost = 0;
        //variable will be defining the percentage of the discount that applies to te user.
        int discountTypeReceived = 0;

        //calling class userInput which will get user input,
        userInput user1 = new userInput();
        int laptopOrd = user1.getLaptopOrd();
        int ultraPortLapOrd = user1.getUltraPortLapOrd();
        int serverOrd = user1.getServerOrd();

        //adding amounts of each type of computer the user is ordering to one variable.
        int totalNumOrders = ultraPortLapOrd + laptopOrd + serverOrd;
        //computing to find the total cost of order before discount.
        int totalOrderCost = (ultraLapCost * ultraPortLapOrd) + (laptopCost * laptopOrd) + (serverCost * serverOrd);
        //34-50 are finding which discount applies to the user's order.

        if (totalNumOrders < 5) {
            totalDisCost = totalOrderCost;
        } else if (5 <= totalNumOrders && totalNumOrders <= 10) {
            totalDisCost = (int) (smallDiscount * totalOrderCost);
            discountTypeReceived = (int) ((1 - smallDiscount) * 100);
        } else if (11 <= totalNumOrders && totalNumOrders <= 50) {
            totalDisCost = (int) (midDiscount * totalOrderCost);
            double tempMidDiscount = (1 - midDiscount) * 100;
            discountTypeReceived = (int) Math.ceil(tempMidDiscount);
        } else if (50 < totalNumOrders) {
            totalDisCost = (int) (largeDiscount * totalOrderCost);
            discountTypeReceived = (int) ((1 - largeDiscount) * 100);
        } else {
            System.out.println("Invalid Entry");
        }
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        if (ultraPortLapOrd < 0 || laptopOrd < 0 || serverOrd < 0) {
            System.out.println("Unable to calculate discount because of Inavalid entries.");
        } else if (ultraPortLapOrd == 0 && laptopOrd == 0 && serverOrd == 0) {
            System.out.println("You didn't order any computers.");
        } else if (discountTypeReceived == 0) {
            System.out.println("Because you have ordered " + totalNumOrders + " computers, you will receive a " + discountTypeReceived + "% discount.");
            System.out.println("Therefore, your total cost for your order is $" + totalOrderCost);
        } else {
            //Prints the number of orders with the percentage discount the user is receiving.
            System.out.println("Because you have ordered " + totalNumOrders + " computers, you will receive a " + discountTypeReceived + "% discount.");
            //Prints the total order cost before discounts.
            System.out.println("Your total order cost before discounts is $" + formatter.format(totalOrderCost) + ".");
            //Prints the total discounted cost of the order with the numerical discount received.
            System.out.println(" So your new discounted cost is $" + formatter.format(totalDisCost) + ", which means you saved $" + formatter.format(totalOrderCost - totalDisCost) + ".");
        }
    }
}
