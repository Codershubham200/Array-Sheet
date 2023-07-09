package com.company;

import java.util.ArrayList;
import java.util.List;

public class spiralPrint {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int left=0;
        int right=matrix.length-1;
        int bottom=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        while(top<=bottom && left<=right){
            //print left to right
            for(int i=left;i<=right;i++)
                list.add(matrix[top][i]);

            top++;

            //print top to bottom
            for(int i=top;i<=bottom;i++)
                list.add(matrix[i][right]);

            right--;

            //print right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    list.add(matrix[bottom][i]);

                bottom--;
            }
            if(left<=right){
                //print bottom to top
                for(int i=bottom;i>=top;i--)
                    list.add(matrix[i][left]);

                left++;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        List<Integer> list= spiralOrder(matrix);
        for (int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
