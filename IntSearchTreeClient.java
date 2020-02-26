/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author maxwell.m.anderson
 */
import java.util.*;
public class IntSearchTreeClient {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        IntSearchTree nums = new IntSearchTree();
        System.out.print("next int? (0 to quit)");
        int num = console.nextInt();
        while(num!=0){
            nums.add(num);
            System.out.print("next int? (0 to quit)");
            num = console.nextInt();
        }
        System.out.println();
        System.out.println("tree struct:");
        nums.printSideways();
        System.out.println("sorted list: ");
        nums.print();
        System.out.println("Tree contains 87: "+nums.contains(87));
                
    }
}
