/**
 * Created by Giuseppe on 4/22/2014.
 */

import com.sun.org.apache.xerces.internal.impl.dv.xs.XSSimpleTypeDelegate;

import java.lang.Math;

public class ReularPolygonTest {

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
    private double side, x, y;

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

    public double getN(){
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
        this.side = SIDE;
    }

    public void setX (double X){
        this.x = X;
    }

    public void setY(double Y){
        this.y = Y;
    }

    public double getPerimeter(){
        return n * side;
    }

    public double getArea(){
        double numerator = n * Math.pow(side, 2);
        double denominator = 4 * Math.tan(3.142 / n);
        return numerator / denominator;
    }
}
