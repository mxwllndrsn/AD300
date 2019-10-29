/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.binarysearch;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author maxwell.m.anderson
 */
public class binaryListSearch {
    public static void main(String[] args) {
        Integer[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(list));
        
        System.out.println("Index is " + 
                Collections.binarySearch(list1, 2));
        System.out.println("Index is " + 
                Collections.binarySearch(list1, 11));
        System.out.println("Index is " + 
                Collections.binarySearch(list1, 12));
        System.out.println("Index is " + 
                Collections.binarySearch(list1, 1));
        System.out.println("Index is " + 
                Collections.binarySearch(list1, 3));
        
        char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("Index is " +
                Arrays.binarySearch(chars, 't'));
        
        Character[] chars1 = {'a', 'c', 'g', 'x', 'y', 'z'};
        ArrayList<Character> list2 = new ArrayList<>(Arrays.asList(chars1));
        System.out.println("Index is " +
                Collections.binarySearch(list2, 'c'));
    }
}
