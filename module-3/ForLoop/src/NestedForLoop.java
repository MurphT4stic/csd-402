//Tabari Harvey, 03/29/2025, Module 3 Programming Assignment
public class NestedForLoop {
     public static void main(String[] args) {
         int rows = 7; // Amount of rows in pattern
         
         for (int i = 0; i < rows; i++) {
             
             for (int j = 0; j < (rows - i - 1) * 2; j++) {
                 System.out.print(" ");
             }
             
             // increasing numbers
             int num = 1; 
             for (int j = 0; j <= i; j++) {
                 System.out.print(num + " ");
                
                // Multiply by 2 for the next value
                 num *= 2; 
             }
             
             // Divide num decreasing 
             num /= 4; 
             
             // Divide by 2 to go back down
             for (int j = 0; j < i; j++) {
                 System.out.print(num + " ");
                 num /= 2; 
             }
             
             // Print the '@' symbol 
             System.out.println("@");
         }
     }
 }
 

