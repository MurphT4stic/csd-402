package Tutor_3;

//Tabari Harvey,04/11/2025, Module-6 Programming Assignment

public class Fan {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    //These are the private attributes/property
    //Speed is being represented through an integer
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6;
    private String color = "white";

    //no-argument constructor sets all fields with a default value
    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //Getters start here
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;

    }
    public double getRadius() {
        return radius;

    }
    public String getColor() {
        return color;
    }

    //Setters will start here
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        if (on) {
            String speedString = "";
            switch (speed) {
                case SLOW:
                    speedString = "Slow";
                    break;
                case MEDIUM:
                    speedString = "Medium";
                    break;
                case FAST:
                    speedString = "Fast";
                    break;
                case STOPPED:
                    speedString = "Stopped";
                    break;
            }
            // Return a string describing the fan's on state, speed, radius, and color.
            return "Fan is on, speed is " + speedString + ", radius is " + radius + ", color is " + color;
        } else {
            // Return a string describing the fan's off state, radius, and color.
            return "Fan is off, radius is " + radius + ", color is " + color;
        }
    }
    public static void main(String[] args) {
        // Create the first Fan object using the default constructor.
        Fan fan1 = new Fan();
        System.out.println("Fan 1 (Default Constructor):");
        System.out.println(fan1.toString()); // Print the initial state of fan1.

        // setter methods for fan1 to change its attributes.
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("yellow");
        System.out.println("\nFan 1 (After using setters):");
        System.out.println(fan1.toString()); // Print the updated state of fan1.
        System.out.println("Speed: " + fan1.getSpeed()); // Demonstrate getter method for speed.
        System.out.println("On: " + fan1.isOn());       // Demonstrate getter method for on.
        System.out.println("Radius: " + fan1.getRadius()); // Demonstrate getter method for radius.
        System.out.println("Color: " + fan1.getColor());   // Demonstrate getter method for color.
        // Create the second Fan object using the argument constructor, providing
        // initial values for its attributes.
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        System.out.println("\nFan 2 (Argument Constructor):");
        System.out.println(fan2.toString()); // Print the initial state of fan2.
        System.out.println("Speed: " + fan2.getSpeed());
        System.out.println("On: " + fan2.isOn());
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());

        // Demonstrate setter methods for fan2 to change its attributes.
        fan2.setOn(false);
        fan2.setColor("green");
        System.out.println("\nFan 2 (After using setters):");
        System.out.println(fan2.toString()); // Print the updated state of fan2.
    }
}





