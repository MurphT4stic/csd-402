package Tutor_3;

import java.util.ArrayList;
import java.util.List;



public class UseFans {

    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("  Speed: " + getSpeedLabel(fan.getSpeed()));
        System.out.println("  On: " + (fan.isOn() ? "Yes" : "No"));
        System.out.println("  Radius: " + fan.getRadius());
        System.out.println("  Color: " + fan.getColor());
        System.out.println("--------------------");
    }

    public static void displayFans(List<Fan> fans) {
        System.out.println("--- Displaying All Fans ---");
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    private static String getSpeedLabel(int speed) {
        switch (speed) {
            case Fan.SLOW:
                return "SLOW";
            case Fan.MEDIUM:
                return "MEDIUM";
            case Fan.FAST:
                return "FAST";
            default:
                return "UNKNOWN";
        }
    }

    public static void main(String[] args) {
        // Create a collection of Fan instances
        List<Fan> fanList = new ArrayList<>();
        fanList.add(new Fan(Fan.FAST, true, 10, "yellow"));
        fanList.add(new Fan(Fan.MEDIUM, false, 7.5, "green"));
        fanList.add(new Fan(Fan.SLOW, true, 6, "white"));
        fanList.add(new Fan()); // Using the default constructor

        // Display all fan instances without using toString
        displayFans(fanList);

        // Display a single fan instance without using toString
        System.out.println("\n--- Displaying a Single Fan ---");
        Fan singleFan = fanList.get(2);
        displayFan(singleFan);
    }
}

