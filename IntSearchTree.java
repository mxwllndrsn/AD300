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
public class IntSearchTree {
    private IntTreeNode overallRoot;
    
    public IntSearchTree(){
        overallRoot = null;
    }
    
    public void add(int val){
        overallRoot = add(overallRoot, val);
    }
    private IntTreeNode add(IntTreeNode root, int val){
        if(root==null){
            root = new IntTreeNode(val);
        }else if(val < root.data){
            root.left = add(root.left, val);
        }else if(val > root.data){
            root.right = add(root.right, val);
        }
        return root;
    }
    public boolean contains(int val){
        return contains(overallRoot, val);
    }
    private boolean contains(IntTreeNode root, int val){
        if(root==null){
            return false;
        }else if(val==root.data){
            return true;
        }else if(val < root.data){
            return contains(root.left, val);
        }else {//(val > root.data)
            return contains(root.right, val);
        }
    }
    public void print(){
        printInOrder(overallRoot);
        System.out.println();
    }
    private void printInOrder(IntTreeNode root){
        if(root!=null){
            printInOrder(root.left);
            System.out.print(root.data+" ");
            printInOrder(root.right);
        }
    }
    public void printSideways(){
        printSideways(overallRoot,"");
    }
    private void printSideways(IntTreeNode root, String indent){
        if(root!=null){
        printSideways(root.right, indent+"    ");
        System.out.print(root.data + indent);
        printSideways(root.left, indent+"    ");
        }
    }
}
