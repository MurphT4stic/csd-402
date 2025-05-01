//Tabari Harvey, 05/01/2025, Module-10 Programming Assignment
package Bank;

public class InternationalDivision extends Division {
    private String country;
    private String language;


    public InternationalDivision(String language, int acctNumber, String country, String name) {
        super(name, acctNumber); // Call the constructor of the superclass (Division)
        this.country = country;
        this.language = language;
    }

    // Method to display division information
    public void display() {
        System.out.println("International Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }
}
