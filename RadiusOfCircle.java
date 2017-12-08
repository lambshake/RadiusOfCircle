/*
 * Name: Lamis Shaikh
 * Date: 28 November, 2017
 * Coach Tua'one/ Dr. Gabbitas
 * Class: Computer Programming 2
 * Period: 1
 * 
 * going in circles
 */
import java.io.*;
import java.util.*;
public class RadiusOfCircle
{
    public static void main( String args [])
    {
        do
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.println("What is the area?_...");
            double area = kbReader.nextDouble();
            double rsquared = area/(Math.PI);
            double r = Math.sqrt(rsquared);
            
            System.out.println("The radius is " + r);
            
        }while(true);
    }
}