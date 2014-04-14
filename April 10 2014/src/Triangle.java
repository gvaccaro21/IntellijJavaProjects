/**
 * Created by Giuseppe on 4/10/2014.
 */
public class Triangle extends GeometricObject{

    private double side1, side2, side3;

    public Triangle(){
    }

    public Triangle (double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
        return(Math.sqrt(s *(s - side1) * (s - side2) * (s - side3)));
    }

    public double getPerimeter(){
        return(side1 + side2 + side3);
    }

    @Override
    public String toString(){
        return ("Triangle: side 1 = " + side1 + " side 2 = " +  side2 + " side 3 = " + side3);
    }
}
