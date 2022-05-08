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

    public void addTask(int id,double opt, double pess, double ml, int [] pred, int [] succ ){

    }

    public void displayTask(int id){

    }

    public void displayAllTaskData(){

    }


    public void displayAllPaths(){

    }




    }
*/

package com.company;

import java.io.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.text.DecimalFormat;

import static com.company.ProjectConstants.*;

public class PERT {

    private final static String seperator = "\n===========================================================================\n";

    // data fields
    private double[][] mydataArray = new double[MAXTASKS][MAXCOLUMNS];
    private boolean expectedTimeDone;
    private boolean forwardPassDone;
    private boolean backwardPassDone;
    private boolean slackDone;

    // creation of variables

    private int numDataItems = 0;
    private double pertt = 0;


   /*
    // initializing scanner object




    // first way to storing csv into array (works partially)
    public static void csvarray(){

        // initializing scanner object
        Scanner scanner = null;

         double [][] data = new double[MAXTASKS][MAXCOLUMNS];
         String InputLine = "";
         double xnum = 0;
         String xfileLocation;
         xfileLocation = "C:\\Users\\Mervy\\IdeaProjects\\Java Assignment 3 - PERT\\STDnegative.csv";
         System.out.println("This is STD negative\n");
         System.out.println("\n ***** Setting up Array *******");

         try
         {
             scanner = new Scanner(new BufferedReader(new FileReader(xfileLocation))); // set up a scanner


            while (scanner.hasNextLine()){
                // while ((InputLine = scanner.nextline()) != null)\

                InputLine = scanner.nextLine(); // Read line in from file
                String[] InArray = InputLine.split(","); // split the inputline into an array at the commas.

                for (int i = 0; i < InArray.length; i++){ // copy and store the content store in the "InArray" into the main array
                    data [0][ MAXCOLUMNS] = Double.parseDouble(InArray[i]);
                }
                System.out.println(seperator);

                // increment the row in the array

                System.out.println();

            }


         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }

         catch (Exception e){
             System.out.println(e);
         }
    }

    */

    // String path = "C:\\Users\\Mervy\\IdeaProjects\\Java Assignment 3 - PERT\\STDnegative.csv";
    // String line = "";



   /* public static void submain() {
        double[][] data = new double[MAXTASKS][MAXCOLUMNS];

        String path = "C:\\Users\\Mervy\\IdeaProjects\\Java Assignment 3 - PERT\\STDnegative.csv";
        String line = "";

        try {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(path));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                for (int i = 0; i < values.length; i++) { // copy and store the content store in the "InArray" into the main array
                    data[0][i] = Double.parseDouble(values[i]);

                    System.out.println(values);


                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    */

    // this is a second test of storing my data in array

    /*
    public static void csvarray() throws Exception{

        double[][] data = new double[MAXTASKS][MAXCOLUMNS];

        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;
        // parsing the CSV file into Scanner class constructor

        System.out.println("\n STD negative values without \n");
        Scanner sc = new Scanner(new File("STDnegative.csv"));
        sc.useDelimiter(","); // sets delimiter pattern
        while (sc.hasNext()) // returns a boolean
        {
            System.out.print(sc.next()); // find and returns the next complete token from this scanner
        }
        sc.close(); // close the scanner

        try{
            System.out.println(" \n STD negative values with array \n ");
            Scanner s = new Scanner(new File("STDnegative.csv"));

            while(s.hasNext()){
                String line= s.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                lines.add(Arrays.asList(values));

                for (int i = 0; i < values.length; i++) { // copy and store the content store in the "InArray" into the main array

                }
            }

            s.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // the following code lets you iterate through the 2-dimensional array
        int lineNo = 1;
        for(List<String> line: lines) {
            int columnNo = 1;
            for (String value: line) {
                System.out.println("Line " + lineNo + " Column " + columnNo + ": " + value);
                columnNo++;
            }
            lineNo++;
        }

        // STD positive

        // parsing the CSV file into Scanner class constructor

        System.out.println("\n\t STD positve values without array \n ");
        Scanner st = new Scanner(new File("STDpositive.csv"));
        st.useDelimiter(","); // sets delimiter pattern
        while (st.hasNext()) // returns a boolean
        {
            System.out.print(st.next()); // find and returns the next complete token from this scanner
        }
        st.close();; // close the scanner

        try{
            System.out.println(" \n STD positive values with array \n");
            Scanner ss = new Scanner(new File("STDpositive.csv"));

            while(ss.hasNext()){
                String line= ss.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                lines.add(Arrays.asList(values));
            }

            ss.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // the following code lets you iterate through the 2-dimensional array
        int lineNom = 1;
        for(List<String> line: lines) {
            int columnNom = 1;
            for (String value: line) {
                System.out.println("Line " + lineNom + " Column " + columnNom + ": " + value);
                columnNom++;
            }
            lineNom++;
        }
    }

     






    // public methods

    public void addDataItem(double data) {
        mydataArray[numDataItems][MAXCOLUMNS] = data;
        numDataItems++;

        System.out.println(data);
    }






    public void addTask(int id,double opt, double pess, double ml, int [] pred, int [] succ ){

    }

    public void displayTask(int id){

    }

    public void displayAllTaskData(){

    }


    public void displayAllPaths(){

    }



}
*/
    
    package com.company;

// importing our secondary classes.
import static com.company.ProjectConstants.*;
import static com.company.PERT.*;

//importing our various utility classes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;
public class Main {

    private final static int INVALID = -1;
    private final static String seperator = "\n===========================================================================\n";


    public static void main(String[] args) {

        double d; // create a double "d"

        boolean haveFileName; // creating a boolean for file name.

        String uInFileName = "datafile2.txt"; // default text file name.

        Scanner s = new Scanner(System.in); // create scanner class.

        PERT pert = new PERT(); // Create secondary class object.

        BufferedReader reader; // initialize buffered reader.

        try{
            do {
                System.out.println("\tPlease enter the name of the file you would like to use: ");
                haveFileName = false;

                //stores user input in file name variable
                if (s.hasNext()){
                    uInFileName = s.next();
                    haveFileName = true;
                }
            } while (!haveFileName);

            reader = new BufferedReader(new FileReader(uInFileName));  // buffer reader reads file data
            String line = reader.readLine();

            while (line !=null){

                try{
                    d = Double.parseDouble(line);                       //converts data txt file values to doubles
                    System.out.println(d + " is a double");
                    System.out.println(line);

                    pert.addDataItem(d);

                } catch (NumberFormatException ex){
                    System.out.println("\tWARNING: Data item from file is not a double... " + line);
                }
                line = reader.readLine();
            }

        } catch (Exception ex){
            System.out.println("User input File Name: " + uInFileName);
            System.out.println(ex.getMessage());
        }



    }
}










    



