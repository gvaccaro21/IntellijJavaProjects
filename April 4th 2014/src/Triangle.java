/**
 * Created by Giuseppe on 4/3/2014.
 */

import java.lang.Math;
import java.text.DecimalFormat;

public class Triangle extends SimpleGeometricObject {

    private  double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public static void main (String[] args){

        DecimalFormat df = new DecimalFormat("##.###");
        double side1 = 33;
        double side2 = 20;
        double side3 = 15;

        String color = "red";
        boolean filled = true;

        Triangle triangle = new Triangle(side1, side2, side3);

        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle);
        System.out.println("The area is " + df.format(triangle.getArea()));
        System.out.println("The perimeter is " + triangle.getPerimeter());
    }

    public Triangle(){
    }

    public Triangle(double Side1, double Side2, double Side3){
        this.side1 = Side1;
        this.side2 = Side2;
        this.side3 = Side3;
    }

    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }

    public double getSide3(){
        return this.side3;
    }

    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return (Math.sqrt(s *(s - side1) * (s - side2) * (s - side3)));
    }

    public double getPerimeter(){
        return (side1 + side2 + side3);
    }

    @Override
    public String toString(){
        return ("Triangle: side 1 = " + side1 + " side 2 = " +  side2 + " side 3 = " + side3);
    }
}
