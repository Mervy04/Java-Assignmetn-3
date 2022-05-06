/* package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.company.ProjectConstants.*;

public class PERT {

    public static void main(String[] args) {
        ProjectConstants con = new ProjectConstants();
         double[][] doubles = new double[MAXTASKS][MAXCOLUMNS];



    }

    public void reader () {


        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;
        // parsing the CSV file into Scanner class constructor

        System.out.println("\n STD negative values without \n");
        Scanner sc = null;
        try {
            sc = new Scanner(new File("STDnegative.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sc.useDelimiter(","); // sets delimiter pattern
        while (sc.hasNext()) // returns a boolean
        {
            System.out.print(sc.next()); // find and returns the next complete token from this scanner
        }
        sc.close();
        ; // close the scanner

        try {
            System.out.println(" \n STD negative values with array \n ");
            Scanner s = new Scanner(new File("STDnegative.csv"));

            while (s.hasNext()) {
                String line = s.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                lines.add(Arrays.asList(values));
            }

            s.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

        // the following code lets you iterate through the 2-dimensional array
        int lineNo = 1;
        for (List<String> line : lines) {
            int columnNo = 1;
            for (String value : line) {
                System.out.println("Line " + lineNo + " Column " + columnNo + ": " + value);
                columnNo++;
            }
            lineNo++;
        }

        // STD positive

        // parsing the CSV file into Scanner class constructor

        System.out.println("\n\t STD positve values without array \n ");
        Scanner st = null;
        try {
            st = new Scanner(new File("STDpositive.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        st.useDelimiter(","); // sets delimiter pattern
        while (st.hasNext()) // returns a boolean
        {
            System.out.print(st.next()); // find and returns the next complete token from this scanner
        }
        st.close();
        ; // close the scanner

        try {
            System.out.println(" \n STD positive values with array \n");
            Scanner ss = new Scanner(new File("STDpositive.csv"));

            while (ss.hasNext()) {
                String line = ss.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                lines.add(Arrays.asList(values));
            }

            ss.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // the following code lets you iterate through the 2-dimensional array
        int lineNom = 1;
        for (List<String> line : lines) {
            int columnNom = 1;
            for (String value : line) {
                System.out.println("Line " + lineNom + " Column " + columnNom + ": " + value);
                columnNom++;
            }
            lineNom++;
        }

    }

    double calcStandardDeviation() {
        private int numDataItems = mydataArray.length;
        private double total = 0;
        private double sum = 0;
        private double endresult;
    }
        for (int i = 0; i < 1; i++) {
            for (int g = 0; g < mydataArray.length; i++) {
                total = sum + mydataArray[0][g];
                double mean = total / mydataArray.length;                   // calculate the mean
                // calculate squared difference from mean
                double squareDiffMean = endresult / mydataArray.length;// squared diff from mean
                double standardDev = Math.sqrt(squareDiffMean);
                // sum the values from above
                sum += endresult;
                // divide by the number of dAta points
                double dividedvalues = sum / mydataArray.length;
                // CALCULATE THE SQUARE ROOT
                double squareroot = Math.sqrt(dividedvalues / mydataArray.length - 1);
                // System.out.println(squareroot);
                // return the square root of the squared difference(standard deviation)
                // System.out.println("Your square diff is");
                // System.out.println(squareDiffMean);
                // System.out.println("You're standard deviation is");
                System.out.println(standardDev);
                return standardDev;
            }


    }
    */

/*
package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.company.ProjectConstants.*;

public class PERT {

    // data fields
    private double[][] data = new double[MAXTASKS][MAXCOLUMNS];
    private boolean expectedTimeDone;
    private boolean forwardPassDone;
    private boolean backwardPassDone;
    private boolean slackDone;

    // public methods

    public void addTask(int id, )


}
*/

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.company.ProjectConstants.*;

public class PERT {

    // data fields
    private double[][] data = new double[MAXTASKS][MAXCOLUMNS];
    private boolean expectedTimeDone;
    private boolean forwardPassDone;
    private boolean backwardPassDone;
    private boolean slackDone;

    // public methods

    public void addTask(int id,double opt, double pess, double ml, int [] pred, int [] succ ){

    }

    public void displayTask(int id){

    }

    public void displayAllTaskData(){

    }


    public void displayAllPaths(){

    }




    }









    



