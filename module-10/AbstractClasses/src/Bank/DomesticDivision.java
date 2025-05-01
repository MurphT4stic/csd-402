//Tabari Harvey, 05/01/2025, Module-10 Programming Assignment
package Bank;

public class DomesticDivision extends Division {
    private String state;


    public DomesticDivision(String name, int acctNumber, String state ) {

        super(name, acctNumber); // Call the constructor of the superclass (Division)
        this.state = state;

    }
    public void display() {
        System.out.println("Domestic Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
    }

}

