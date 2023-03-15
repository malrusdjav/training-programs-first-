package com.array.se.two_dim_arr;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class array2 {
    public static void main(String[] args) {
        int cols, rows;
        String text ="Two-dimensional array of random numbers";
        cols=Integer.parseInt(JOptionPane.showInputDialog("The number of columns: "));
        rows=Integer.parseInt(JOptionPane.showInputDialog("The number of rows: "));
        int[][] nums=new int[cols][rows];
        for(int i=0;i< nums.length;i++){
            text+="\n";
            for(int j=0; j<nums[0].length;j++){
                nums[i][j]=(int)(10*Math.random());
                text+=nums[i][j]+" ";
            }
        }
        JOptionPane.showMessageDialog(null, text);
    }
}
