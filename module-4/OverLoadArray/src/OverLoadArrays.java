
//Tabari Harvey, 04/05/2025, Module-4 Programming Assignment
//This program shows four overloaded functions of different data types
public class OverLoadArrays {
    public static void main(String[] args) {

     System.out.println("Average of the two integers: " + average (10, 15));
        System.out.println("Average of three shorts: " + average((short)10, (short)20, (short)30));
        System.out.println("Average of two longs: " + average(100, 200));
        System.out.println("Average of an array of integers: " + average(new int[]{10, 20, 30, 40}));
    }

    public static int average (int a, int b) {
       return (a+b)/2;
    }

    public static short average (short a, short b, short c) {
        return (short)((a+b+c)/3);
    }

    public static long average (long a, long b, long c) {
        return (a+b+c)/3;
    }

    public static double average(int[] numbers) {
        int sum = 0;
        //This is a for each loop
        for (int num : numbers) {
            sum += num;
        }
        //Numbers length is a java function that is for counting vaules inside Array
        return (double) sum / numbers.length;
    }
}