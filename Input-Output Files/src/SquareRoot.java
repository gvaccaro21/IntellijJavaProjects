/**
 * Created by Giuseppe on 3/24/2014.
 * Time Taken: 2 Hours.
 */

import java.io.*;
import java.util.*;

public class SquareRoot  {
    public static void main (String[] args){
        File f = null;
        Scanner scan = null;

        /* This imports the file as an array list.
        The benefit in using an array list allows the array size to grow depending on the amount of
        data that is in the file.
         */
        ArrayList<Double> NumberList = new ArrayList<Double>();

        //This is importing the file form a specified path on the users computer.
        try {
            f = new File("C:/Users/Giuseppe/Desktop/JavaSqrtIO/NumberList.txt");
            scan = new Scanner(f);
        }
        catch(Exception e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        while (scan.hasNext()){
            NumberList.add(scan.nextDouble());
        }
        scan.close();

        //This is to convert the ArrayList to an Array.
        Double[] SquareRootArray = NumberList.toArray(new Double[0]);

        //Takes the Sqrt of each number in the list.
        for( int i = 0; i < SquareRootArray.length; i++) {
            SquareRootArray[i] = Math.sqrt(SquareRootArray[i]);
        }

        //This is going to save the results as a text file right in the project folder of IntelliJ.
        try{
            FileWriter fr = new FileWriter("SquareRoot.txt");
            BufferedWriter br = new BufferedWriter(fr);
            PrintWriter out = new PrintWriter(br);

            for (int i = 0; i < SquareRootArray.length; i++){
                if(SquareRootArray[i] != null) {
                    out.write((String.valueOf(SquareRootArray[i])));
                    out.write("\n");
                }
            }
            out.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}