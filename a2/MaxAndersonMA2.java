/*
    Max Anderson
    AD300-5202
    Assignment #2

    Purpose: Create a 2-Dimensional array of state/capital pairs,
    and map those pairs to a hashmap. Query user 5 times for state names
    and return state capital of name found in map keys. I have used a CSV
    of state/capital pairs to create the initial 2-Dimensional array. 

    !! state_capitals.csv is required (included)
*/

import java.util.*;
import java.io.*;

public class MaxAndersonMA2{
    
    public static String state_capitals = "state_capitals.csv";
    public static String title = "======================\nState Capital Database\n======================";

    public static void main(String[] args)
        throws FileNotFoundException {
            
            // tell everyone what the program is
            System.out.println(title);

            // setup our file scanner, delimiter, and skip csv header
            Scanner inFile = new Scanner(new File(state_capitals));
            inFile.useDelimiter(",");
            inFile.nextLine();
            
            // need to read a split string from each line
            String[] split = new String[2];
            String[][] pairs = new String[50][2];
            int idx = 0;

            // read state/capital pairs into the array
            while(inFile.hasNext()){
                split = inFile.nextLine().split(",");
                pairs[idx] = split;
                idx++;
            }

            // declare our state/capital pairs map and create an iterator
            // for original 2-Dimensional array of state/capital pairs
            Map<String, String> stateCaps = new HashMap<String, String>();
            Iterator<String[]> itArr = Arrays.asList(pairs).iterator();

            // iterate through original array and map key/vals 
            // put each key/val pair into new hashmap 
            while(itArr.hasNext()){
                String[] pair = itArr.next();
                stateCaps.put(pair[0].toUpperCase(), pair[1].toUpperCase());
            }

            // declare a scanner to read user input
            Scanner console = new Scanner(System.in);

            // for 5 intervals, request user input and convert input to lower case
            // use nextLine() to capture entire input including whitespace
            // and trim() leading and trailing whitespaces from input 
            for(int i=0; i<5; i++){
                System.out.print("Please enter a state: ");
                String input = console.nextLine().toUpperCase();
                input = input.trim();

                // check if user input exists in map keys
                // if exists output corresponding val, else inform user not found 
                if(stateCaps.containsKey(input)){
                    System.out.println("State capital is: "+stateCaps.get(input)+"\n");
                } else {
                    System.out.println("State \'"+input+"\' not found.\n");
                }
            }
    }
}