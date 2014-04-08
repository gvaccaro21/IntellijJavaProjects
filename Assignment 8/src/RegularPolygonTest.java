/**
 * Created by Giuseppe on 4/2/2014.
 */

import java.lang.Math;

public class RegularPolygonTest {

    public static void main(String[] args){
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10,4,5.4,7.8);

        System.out.println("Area or Regular Polygon 1 = " + rp1.getArea());
        System.out.println("Perimeter of Regular Polygon 1 = " + rp1.getPerimeter());
        System.out.println("Area or Regular Polygon 2 = " + rp2.getArea());
        System.out.println("Perimeter of Regular Polygon 2 = " + rp2.getPerimeter());
        System.out.println("Area or Regular Polygon 3 = " + rp3.getArea());
        System.out.println("Perimeter of Regular Polygon 3 = " + rp3.getPerimeter());
    }
}

class RegularPolygon{

    private int n;
    private double side;
    private double x;
    private  double y;

    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygon(int N, double SIDE){
        n = N;
        side = SIDE;
        x = 0;
        y = 0;
    }

    RegularPolygon(int N, double SIDE, double X, double Y){
        n = N;
        side = SIDE;
        x = X;
        y = Y;
    }

    public int getN(){
        return n;
    }

    public double getSide(){
        return side;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setSide(int SIDE){
        side = SIDE;
    }

    public void setX(int X){
        x = X;
    }

    public void setY(int Y){
        y = Y;
    }

    public double getPerimeter(){
        double perimeter = n * side;
        return perimeter;
    }

    public double getArea(){
        double area;
        double numerator = n * Math.pow(side,2);
        double denominator = 4 * Math.tan( 3.142 / n);
        area = numerator / denominator;
        return area;
    }
}