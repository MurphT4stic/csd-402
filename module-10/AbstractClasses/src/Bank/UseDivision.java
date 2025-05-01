//Tabari Harvey, 05/01/2025, Module-10 Programming Assignment
package Bank;

public class UseDivision {
    public static void main(String[] args) {

        System.out.println("Creating and displaying division information:\n");

        // Create two InternationalDivision instances
        InternationalDivision intDiv1 = new InternationalDivision("European Sales", 101, "France", "French");
        InternationalDivision intDiv2 = new InternationalDivision("Asia Pacific Ops", 102, "Japan", "Japanese");

        // Create two DomesticDivision instances
        DomesticDivision domDiv1 = new DomesticDivision("Midwest Manufacturing", 201, "Ohio");
        DomesticDivision domDiv2 = new DomesticDivision("Southern R&D", 202, "Texas");

        // Display the information for each division
        intDiv1.display();
        System.out.println(); // Add a blank line for readability

        intDiv2.display();
        System.out.println(); // Add a blank line for readability

        domDiv1.display();
        System.out.println(); // Add a blank line for readability

        domDiv2.display();
    }

    }


