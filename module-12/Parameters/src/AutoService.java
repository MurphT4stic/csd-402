//Tabari Harvey, 05/15/2025, Module-12 Programming Assignment
public class AutoService {

    public static double yearlyService() {
        return 100.0;
    }

    public static double yearlyService(boolean oilChange) {
        double total = 100.0;
        if(oilChange) {
            total += 30.0;
        }
        return total;
    }

    public static double yearlyService(boolean oilChange, boolean tireRotation) {
        double total = 200.0;
        if(oilChange) {
            total += 10.0;
        }
        if(tireRotation) {
            total += 20.0;
        }
        return total;
    }

    public static double yearlyService(boolean oilchange, boolean tireRotation, double coupon) {
        double total = 200.0;
        if(oilchange) {
            total += 10.0;
        }
        if(tireRotation) {
            total += 30.0;
        }

        total -= coupon;
        return total;

    }

    public static void main(String[] args) {
        System.out.println("Standard Service: $" + yearlyService());
        System.out.println("With Oil Change: $" + yearlyService(true));
        System.out.println("With Oil Change, Tire Rotation: $" + yearlyService(true, true));
        System.out.println("With Oil Change & Tire Rotation, and $25 Coupon: $" + yearlyService(true, true, 25.0));

    }


}
