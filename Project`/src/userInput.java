import java.util.*;
public class userInput {
    private int laptopOrd;
    private int ultraPortLapOrd;
    private int serverOrd;
    public userInput(){
        //gets user input
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Ultra-portable Laptops are you ordering?");
        //test to make sure user input is an int.
        if (scan.hasNextInt()){
            //assigns how many servers user needs to ultraPortLapOrd
            ultraPortLapOrd = scan.nextInt();
        } else {
            System.out.println("Invalid Input");
        }
        System.out.println("How many Laptops are you ordering?");
        //test to make sure user input is an int.
        if(scan.hasNextInt()) {
            //assigns how many laptops user needs to laptopOrd
            laptopOrd = scan.nextInt();
        } else {
            System.out.println("Invalid Input");
        }
        System.out.println("How many Servers are you ordering?");
        //test to make sure user input is an int.
        if(scan.hasNextInt()) {
            //assigns how many servers user needs to serverOrd
            serverOrd = scan.nextInt();
        } else {
            System.out.println("Invalid Input");
        }
    }

    public void setLaptopOrd(int newLaptopOrd) {
        laptopOrd = newLaptopOrd;
    }

    public void setUltraPortLapOrd(int newUltraPortLapOrd) {
        ultraPortLapOrd = newUltraPortLapOrd;
    }

    public void setServerOrd(int newServerOrd) {
        serverOrd = serverOrd;
    }

    public int getLaptopOrd(){
        return laptopOrd;
    }
    public int getUltraPortLapOrd() {
        return ultraPortLapOrd;
    }
    public int getServerOrd() {
        return serverOrd;
    }
}