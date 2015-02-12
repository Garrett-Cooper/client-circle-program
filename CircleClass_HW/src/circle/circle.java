/**
 * CIT 111 Intro to Programming 
 * Assignment 6 
 * 10/24/2014 
 * Author: Garrett Cooper
 * Circle Class Program
 */

package circle;

// Imports a class that makes a Point, which
// represents a location in the (x,y) coordinate space, 
// specified in integer precision
import java.awt.Point;

// A class program that encapsulates the concept of a circle
public class circle {

    // Instance variables:
    private int radius;
    private Point center;

    // Default constructor:
    // initializes center = Point(0,0) and radius = 1
    public circle() {

        center = new Point(0, 0);
        radius = 1;
    }

    // Overloaded constructor:
    // allows client to set beginning values for Point(x,y) and radius (r)
    public circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }

    // Accessor method: returns current value of radius
    public int getRadius() {
        return radius;
    }

    // Accessor method: returns current value of center
    public Point getCenter() {
        return center;
    }

    // Mutator method: allows client to set radius
    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    // Mutator method: allows client to set center
    public void setCenter(int newX, int newY) {
        center = new Point(newX, newY);
    }

    // toString: returns a String of instance variable values
    public String toString() {
        return "Center: " + center + "; Radius: " + radius;
    }

    // equals: returns true if fields of parameter object are equal to...
    // fields in this object
    public boolean equals(Object o) {
        if (!(o instanceof circle)) {
            return false;
        } else {
            circle objCircle = (circle) o;
            if (radius == objCircle.radius
                    && center.equals(objCircle.center)) {
                return true;
            } else {
                return false;
            }
        }

    }

    // Circle Area Method: returns area of a circle = PI * radius^2
    public double circleArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Circle Perimeter Method: returns perimeter of a circle = 2 * PI * radius
    public double circlePerimeter() {
        return 2 * Math.PI * radius;
    }

}
