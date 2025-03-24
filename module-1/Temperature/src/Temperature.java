//Tabari Harvey, 03/23/2025, Module1 Programming Assignment
//https://github.com/MurphT4stic
import java.util.Scanner;  

//Class is Temperature
public class Temperature {
   //The main program
    public static void main(String[]args) { 
     
    //Scanner object for user input
    Scanner input = new Scanner(System.in);
      
    //Ask user to enter water amount in Kilos
    System.out.print("Enter the amount of water in Kilograms: ");
    double waterMass = input.nextDouble();
    
    //Ask user for initial temperature
    System.out.print("Enter the initial temperature in Celsius: ");
    double initialTemperature = input.nextDouble();

    //Ask user for final temperature
    System.out.print("Enter the final temperature in Celsius: ");
    double finalTemperature = input.nextDouble();

    //Calculate energy needed to heat water
    double Q = waterMass * (finalTemperature - initialTemperature) * 4184;
    
    //The results
    System.out.print("This is the energy needed to heat water " + Q + "Joules.");

    input.close();

   } 

}