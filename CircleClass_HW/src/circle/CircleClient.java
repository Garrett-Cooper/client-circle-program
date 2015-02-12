/**
 * CIT 111 Intro to Programming 
 * Assignment 6 
 * 10/24/2014 
 * Author: Garrett Cooper
 * Circle Client Program
 */

package circle;

import java.awt.Point;

public class CircleClient {

    public static void main(String[] args) {

        // Instantiates the Default Constructor for circle #1
        System.out.println("Instantiate circle #1");
        circle cir1 = new circle();
        // Calls the toString method to print out the Accessor Methods for 
        // circle #1, and for each cirle hereafter
        System.out.println("\nCircle #1: " + cir1.toString());

        // Instantiates the Overloaded Constuctor for circle #2
        System.out.println("\nInstantiate circle #2");
        circle cir2 = new circle(2, 3, 2);
        System.out.println("\nCircle #2: " + cir2.toString());

        // Instantiates the Overloaded Constuctor for circle #3
        System.out.println("\nInstantiate circle #3");
        circle cir3 = new circle(1, 1, 4);
        System.out.println("\nCircle #3: " + cir3.toString());

        // Instantiates the Overloaded Constuctor for circle #4
        System.out.println("\nInstantiate circle #4");
        circle cir4 = new circle(2, 3, 2);
        System.out.println("\nCircle #4: " + cir4.toString());

        // Calls the Accessor Methods for the radius and center for circle #1    
        System.out.println("\nCall the Accessor Methods to print "
                + "the radius and center for circle #1 (default constructor): ");
        int cir1Radius = cir1.getRadius();
        Point cir1Center = cir1.getCenter();

        // Prints out the Accessor Methods for the radius and center
        // for circle #1
        System.out.println("\nCenter: " + cir1Center + "; Radius: " + cir1Radius);

        // Calls the Accessor Methods for the radius and center for circle #3   
        System.out.println("\nCall the Accessor Methods to print "
                + "the radius and center for circle #3 (overloaded constructor): ");
        int cir3Radius = cir3.getRadius();
        Point cir3Center = cir3.getCenter();

        // Calls the toString method to print out the Accessor Methods for 
        // circle #3
        System.out.println("\n" + cir3.toString());

        // Calls Mutator Methods for radius and center for circle #3
        System.out.println("\nUse the Mutator Methods to change "
                + "the radius and center for circle #3, "
                + "and print results: ");
        cir3.setCenter(2, 2);
        cir3.setRadius(5);

        // Calls the toString method to print out Mutator Methods for 
        // circle #3
        System.out.println("\n" + cir3.toString());

        // Calls the area method and calculates the area for circle #3
        double cir3Area = cir3.circleArea();
        System.out.println("\nThe area of circle #3 is: " + cir3Area);

        // Calls the perimeter method and calculates the perimeter for circle #3
        double cir3Perimeter = cir3.circlePerimeter();
        System.out.println("\nThe perimeter of circle #3 is: " + cir3Perimeter);

        // Calls the equal method and returns true if fields in two objects
        // are identical - in this case circles #2 and #4 are identical
        
        System.out.println("\nCalls the Equal Method and compares the "
                + "the center and radius for Circles #2 and #4: ");
        if (cir2.equals(cir4)){
            System.out.println("\nCircles #2 and #4 are equal");
        } else {
            System.out.println("\nCircles #2 and #4 are not equal");
        }
     
        // Calls the equal method and returns true if fields in two objects
        // are identical - in this case circles #3 and #4 are NOT identical
        
        System.out.println("\nCalls the Equal Method and compares the "
                + "the center and radius for Circles #3 and #4: ");
        if (cir3.equals(cir4)){
            System.out.println("\nCircles #3 and #4 are equal");
        } else {
            System.out.println("\nCircles #3 and #4 are not equal");
        }
        
    }
}
