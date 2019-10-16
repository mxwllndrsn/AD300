/*
    Max Anderson
    AD300-5202
    Assignment #1

    Assignment purpose: ArrayList implementation exploring 
    util.collections sort/min/max/shuffle methods and duplicate
    entry elimination. 
*/

import java.util.*;

public class MaxAndersonMA1{
    public static void main(String[] args){

        // Let's create a new ArrayList and scanner object in order to 
        // read in ten integers from the user for use in our assignment 
        ArrayList<Integer> newList = new ArrayList<>();
        Scanner cons = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        for(int i=0; i<10; i++){
            newList.add(cons.nextInt());
        }
    
        // call our removeDuplicate method
        removeDuplicate(newList);

        // display our results using util.collections built-ins 
        System.out.println("The distinct integers are: " + newList);
        Collections.sort(newList);
        System.out.println("Sorted in ascending: " + newList);
        System.out.println("Maximum element in a list: " + Collections.max(newList));
        System.out.println("Minimal element in a list: " + Collections.min(newList));
        Collections.shuffle(newList);
        System.out.println("Random shuffle for the elements in the list: " + newList);
    }

    public static void removeDuplicate(ArrayList<Integer> list){
        // we need a new temporary list to store non-duplicate entries
        ArrayList<Integer> cleanList = new ArrayList<>();
        // loop through the original list and check for duplicates 
        for(int i=0; i<list.size(); i++){
            if(!cleanList.contains(list.get(i)))
                cleanList.add(list.get(i));
        }
        // now we can clear the original list and repopulate it using the temporary list. 
        // I would normally just return a new list. 
        list.clear();
        for(int i=0; i<cleanList.size(); i++)
            list.add(cleanList.get(i));
    }
}