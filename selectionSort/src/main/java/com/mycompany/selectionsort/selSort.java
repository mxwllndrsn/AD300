/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.selectionsort;

import java.util.*;
import java.io.*;
/**
 *
 * @author maxwell.m.anderson
 */
public class selSort {
    public static void main(String[] args){
	int[] list = new int[10];// = {2,3,7,1,9,6,3,0,0,4,4,4,5,55,88,-22};
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter 10 integers: ");
        for(int i=0; i<10; i++){
            list[i] = console.nextInt();
        }
        System.out.println("Original List: " + Arrays.toString(list));
	selectionSort(list);
	System.out.println("\nSorted list: " + Arrays.toString(list));
    }

    public static void selectionSort(int[] list){
	for(int i=0; i< list.length; i++){
		int currentMin = list[i];
		int currentMinIndex = i;

		for(int j=i+1; j < list.length; j++){
			if(currentMin > list[j]){
				currentMin = list[j];
				currentMinIndex = j;
			}
		}
		if(currentMinIndex != i){
			list[currentMinIndex] = list[i];
			list[i] = currentMin;
		}
	}
    }
}
