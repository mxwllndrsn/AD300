/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.binarysearch;

/**
 *
 * @author maxwell.m.anderson
 */
public class BinarySearchR {
    public static void main(String[] args) {
        int [] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
        System.out.println(binarySearchR(list, 2));
        System.out.println(binarySearchR(list, 5));
        System.out.println(binarySearchR(list, 6));
        System.out.println(binarySearchR(list, 7));
        System.out.println(binarySearchR(list, 30));
        
    }

    public static int binarySearchR(int[] list, int key){
        return binarySearchR(list, key, 0, list.length-1);
    }
    public static int binarySearchR(int[] list, int key, int low, int high){
        if(low>high)
            return -low-1;
        else{
            int mid=(low+high)/2;
            if(key==list[mid])
                return mid;
            else if(key>list[mid]){
                low=mid+1;
                return binarySearchR(list, key, low, high);
            } else {
                high=mid-1;
                return binarySearchR(list, key, low, high);
            }
        }
    }
}
