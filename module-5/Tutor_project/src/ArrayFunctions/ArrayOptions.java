package ArrayFunctions;
//Tabari Harvey, 04/10/2025, Module-5 Programming Assignment

public class ArrayOptions {

    public static void main(String[] args) {
        //the starting point of the program, no return values allowed due to void


        double[][] doubleArray = {{1.5, 2.8, 0.7}, {4.3, 0.6, 3.2}, {6.8, 5.3, 1.7}};
        int[][] intArray = {{10, 7, 12, 24, 555}, {8, 18, 7, 12}, {9, 8, 15, 38}};


        int[] location = locateLargest(intArray);
        System.out.println("The largest element is at: " + location[0] + ", " + location[1]);

        int[] largestIntLocation = locateLargest(intArray);
        System.out.println("Location of the largest element in intArray: [" + largestIntLocation[0] + ", " + largestIntLocation[1] + "]");

        int[] smallestDoubleLocation = locateSmallest(doubleArray);
        System.out.println("Location of the smallest element in doubleArray: [" + smallestDoubleLocation[0] + ", " + smallestDoubleLocation[1] + "]");


        int[] smallestIntLocation = locateSmallest(intArray);
        System.out.println("Location of the smallest element in intArray: [" + smallestIntLocation[0] + ", " + smallestIntLocation[1] + "]");



    }









    public static int[] locateLargest(int[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1}; // Indicate an empty or null array
        }

        int largest = arrayParam[0][0];
        int[] location = {0, 0};

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    //this is the array option scope
    public static int[] locateLargest(double[][] arrayParam) {
        //the double
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1}; // Indicate an empty or null array
        }
        //The variable is named the smallest, and signing it to a one dimensional, called a ray parameter
        double smallest = arrayParam[0][0];
        int[] location = {0, 0};

        //outer loop at line 25, circles through each row of the input array
        //i represent the current row index
        //arrays start at zero
        for (int i = 0; i < arrayParam.length; i++) {

            //start of the inner loop, loop through array and start at zero with j
            //while less than the parameter it will keep going with .length
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }


    public static int[] locateSmallest(double[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1}; // Indicate an empty or null array
        }

        double smallest = arrayParam[0][0];
        int[] location = {0, 0};

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1}; // Indicate an empty or null array
        }

        int smallest = arrayParam[0][0];
        int[] location = {0, 0};

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
    //end of the loops 31-40
    //line 15-40 the method was defined

}
