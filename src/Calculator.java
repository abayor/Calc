/**
 * Created by cube on 12/21/2016.
 */
/*import java.io.*/;
//import com.sun.java.util.jar.pack.Instruction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;
public class Calculator {
    public static void main (String[] args) {

        String s1 = getInput("Enter value of s1");
       // System.out.print(s1);

        String s2 = getInput("Enter value of s2");
        //System.out.print(s2);
        String op = getInput("Enter 1 for addition operation \n, 2 for subtraction\n, 3 for division \n, 4 for multiplication  ");
        int opInt = Integer.parseInt(op);
        double result;
        switch(opInt){
            case 1:
                 result = getAddResult(s1, s2);
                break;
            case 2:
                 result = getSubResult(s1, s2);
                break;
            case 3:
                 result = getDivResult(s1, s2);
                break;
            case 4:
                 result = getMutResult(s1, s2);
                break;

            default:
                System.out.println("Invalid Input");
                return;
        }
        //double result = getResult(s1, s2);

        System.out.println("The value of of the two digits is" + result);
    }

    private static double getMutResult(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    private static double getSubResult(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }

    private static double getDivResult(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    private static double getAddResult(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    private static String getInput(String prompt){
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print(prompt);
        System.out.flush();
        try {
            return stdin.readLine();
        }catch (Exception e)
        {
            return "Error: " +e.getMessage();
        }

    }
}

