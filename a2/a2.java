/*
    Assignment 2
    Schema && Test
    AD300

    1) Store pairs of states and capitals in a 2-dimensional array
    2) Retrieve pairs of each state and capital and store in HashMap (Migrate Array -> Hashmap)
    3) Ensure proper case (upper/lower) for hashmap key/val pairs
    4) Prompt user 5 times for state name
        a) display state capital name
        b) display "no such state" if invalid input
    5) Access hashmap using containsKey() and get()

    In this case I will read from CSV of state capitals
    in order to load the array and migrate to hashmap. 
*/

import java.util.*;
import java.io.*;

public class a2{
    
    public static String state_capitals = "state_capitals.csv";
    
    public static void main(String[] args)
        throws FileNotFoundException {
            
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
                //System.out.println(split[0] + " " + split[1]);

                pairs[idx] = split;
                idx++;
            }

            // print state/capital pairs (as individual arrays)
            for(int i=0; i<pairs.length; i++)
                System.out.println(Arrays.toString(pairs[i]));
    }
}