import java.util.*;

public class removeDuplicate{
    
    public static void main(String[] args){
        ArrayList<Integer> newList = new ArrayList<>();
        Scanner cons = new Scanner(System.in);
        int val;

        ArrayList<Integer> tempList = new ArrayList<>();
        System.out.println("Enter 10 numbers: ");
        for(int i=0; i<10; i++){
            tempList.add(cons.nextInt());
        }
        /*
        do{
            System.out.println("Enter a number: ");
            val = cons.nextInt();
            if(val!=0&&!newList.contains(val))
                newList.add(val);
        } while(val!=0);
        System.out.println("Your list: " + newList);
        */

        System.out.println("tempList: " + tempList);
        System.out.println("maxVal: " + findMax(tempList));
        System.out.println("minVal: " + findMin(tempList));
        System.out.println("avgVal: " + findAvg(tempList));
        System.out.println();

        ArrayList<Integer> cleanList = noDupes(tempList);
        
        System.out.println("unduplicated list: " + cleanList);
        System.out.println("maxVal: " + findMax(cleanList));
        System.out.println("minVal: " + findMin(cleanList));
        System.out.println("avgVal: " + findAvg(cleanList));
        System.out.println("sortAscend: " + sortAscend(cleanList));
        System.out.println("sortDescend: " + sortDescend(cleanList));
    }

    static int findMax(ArrayList<Integer> aList){
        int maxVal = aList.get(0);
        for(int i=0; i<aList.size(); i++){
            if(aList.get(i)>maxVal)
                maxVal = aList.get(i);
        }
        return maxVal;
    }
    static int findMin(ArrayList<Integer> aList){
        int minVal = aList.get(0);
        for(int i=0; i<aList.size(); i++){
            if(aList.get(i)<minVal)
                minVal = aList.get(i);
        }
        return minVal;
    }
    static int findAvg(ArrayList<Integer> aList){
        int sum=0;
        for(int i=0; i<aList.size(); i++)
            sum += aList.get(i);
        return sum/aList.size();
    }
    static ArrayList<Integer> noDupes(ArrayList<Integer> aList){
        ArrayList<Integer> cleanList = new ArrayList<>();
        for(int i=0; i<aList.size(); i++){
            if(!cleanList.contains(aList.get(i)))
                cleanList.add(aList.get(i));
        }
        return cleanList;
    }
    @SuppressWarnings("unchecked")
    static ArrayList<Integer> sortAscend(ArrayList<Integer> aList){
        ArrayList<Integer> listCopy = (ArrayList<Integer>) aList.clone();
        ArrayList<Integer> sortedList = new ArrayList<>();
        int LENGTH = listCopy.size();
        for(int i=0; i<LENGTH; i++){
            sortedList.add(findMax(listCopy));
            listCopy.remove(listCopy.indexOf(findMax(listCopy)));
        }
        return sortedList;
    }
    @SuppressWarnings("unchecked")
    static ArrayList<Integer> sortDescend(ArrayList<Integer> aList){
        ArrayList<Integer> listCopy = (ArrayList<Integer>) aList.clone();
        ArrayList<Integer> sortedList = new ArrayList<>();
        int LENGTH = listCopy.size();
        for(int i=0; i<LENGTH; i++){
            sortedList.add(findMin(listCopy));
            listCopy.remove(listCopy.indexOf(findMin(listCopy)));
        }
        return sortedList;
    }
/*    static ArrayList<Integer> sortList(ArrayList<Integer> toSort){
        ArrayList<Integer> sorted = new ArrayList<>();
        for(int i=0; i<toSort.length; i++){
            for(int k=0; k<toSort.length; k++){

            }
        }
    }
*/
}