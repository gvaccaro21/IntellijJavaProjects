import java.util.Date;

/**
 * Created by Giuseppe on 4/2/2014.
 */
public class SimpleGeometricObject {

    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }

    /* Construct a geometric object with the specified color and filled value
     */

    public SimpleGeometricObject(String colo, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    //Return Color
    public String getColor(){
        return color;
    }

    //Set new color
    public void setColor(String color){
        this.color = color;
    }

    //Return filled

    public boolean isFilled(){
        return filled;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "reated on" + dateCreated + "\ncolor" + color + " and filled: " + filled;
    }
}
