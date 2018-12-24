package com.amz.backtracking;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] board = new int[][] 
		{ 
            {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
            {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
            {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
            {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
            {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
	    }; 
		
		int N= board.length;
		System.out.println(N);
		
		 if (solveSudoku(board, N)) 
		    { 
		        print(board, N); // print solution 
		    }  
		    else
		    { 
		        System.out.println("No solution"); 
		    } 
				

	}

	private static void print(int[][] board, int n) {
		// TODO Auto-generated method stub
		
	}

	private static boolean solveSudoku(int[][] board, int n) {
		// TODO Auto-generated method stub
		return false;
	}

}
