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
public class IntTreeNode {
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;
    
    public IntTreeNode(int data){
        this(data, null, null);
    }
    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
}
