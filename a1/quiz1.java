import java.util.*;

public class quiz1{

    private static String element = "red";

    public static void main(String[] args){
        ArrayList<String> test = new ArrayList<>();
        test.add("red");
        test.add("red");
        test.add("green");

        q6(test);
        q7(test);
        q8(test);
        q9();
        q10();
    }

    @SuppressWarnings("unchecked")
    static void q6(ArrayList<String> aList){
        ArrayList<String> newList = (ArrayList<String>) aList.clone();

        for(int i=0;i<newList.size();i++){
            if(newList.get(i).equals(element))
                newList.remove(element);
        }
        System.out.println("Question 6: " + newList);
    }

    @SuppressWarnings("unchecked")
    static void q7(ArrayList<String> aList){
        ArrayList<String> newList = (ArrayList<String>) aList.clone();

        for(int i=0;i<newList.size();i++){
            if(newList.get(i).equals(element)){
                newList.remove(element);
                i--;
            }
        }
        System.out.println("Question 7: " + newList);
    }

    @SuppressWarnings("unchecked")
    static void q8(ArrayList<String> aList){
        ArrayList<String> newList = (ArrayList<String>) aList.clone();

        for(int i=newList.size()-1; i>=0; i--){
            if(newList.get(i).equals(element));
                newList.remove(element);
        }
        System.out.println("Question 8: " + newList);
    }

    static void q9(){
        String[] array={"red", "green", "blue"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        list.add(0, "red");
        System.out.println("Question 9: " + list);
    }

    static void q10(){
        Integer[] c = {3,5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(c));
        java.util.Collections.shuffle(list);
        System.out.println("Question 10: " + list);
    }
}