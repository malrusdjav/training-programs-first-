package com.array.se.one_dim_arr;

import javax.swing.*;

public class array1 {
    public static void main(String[] args) {
        int size;
        int sum=0;
        String text1="One-dimensional array of random numbers:";
        String text2="Sum";
        size=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements: "));
        int[] nums=new int[size];
        for(int i=0; i< nums.length; i++){
                nums[i] = (int) (10 * Math.random());
                text1 += nums[i] + " ";
                sum += nums[i];
        }
        text2+="="+sum;
        JOptionPane.showMessageDialog(null, text1);
        JOptionPane.showMessageDialog(null, text2);
    }
}
