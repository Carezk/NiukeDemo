package com.jianzhi.offer;

import java.util.ArrayList;

import sun.print.resources.serviceui;

/**    
 * @author zk  
 * @date 2018年8月8日  
 * 顺时针打印矩阵
 */
public class MatrixTest {
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
	       ArrayList<Integer> result = new ArrayList<Integer>();
	       if (matrix==null) {
			return result;
	       }
	       int col = matrix.length;//行数
	       int row = 0;//列数
	       if (col>0) {
			row = matrix[0].length;
		}
	       for (int i = 0; i < row; i++) {
			result.add(matrix[0][i]);
		}
	       if (col==1) {
			return result;
		}else {
			int matrix2[][] = new int[col-1][row];
			for (int i = 1; i < col; i++) {
				for (int j = 0; j < row; j++) {
					matrix2[i-1][j] = matrix[i][j];
				}
			}
			result.addAll(printMatrix(rotateMatrix(matrix2, col-1, row)));
		}
	       return result;
    }
	public static int[][] rotateMatrix(int m[][] , int col , int row){
		 if(m==null){
			 return null;
		 }
		 int[][] m2 = new int[row][col];
		 for (int i = 0; i < row; i++) {
			for (int j = 0; j <col; j++) {
				m2[i][j] = m[j][row-i-1];
			}
		}
		 return m2;
	}
	public static void main(String[] args) {
         int m3[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         System.out.println(printMatrix(m3).toString());
	}
}
