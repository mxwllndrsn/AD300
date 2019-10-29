/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.selectionsort;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author maxwell.m.anderson
 */
public class colSort {
    public static void main(String[] args) {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 5.5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"foo", "bar", "baz", "ball"};
        ArrayList<String> words2 = new ArrayList<>(Arrays.asList(words));
        Collections.sort(words2);
        System.out.println(words2);
    }
}
