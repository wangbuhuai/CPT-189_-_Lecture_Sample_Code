// Created by Dayu Wang (dwang@stchas.edu) on 2020-04-29

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package hybrid.project_demo_2;

import java.io.PrintWriter;
import java.util.Scanner;

public class Sudoku {
    // Data fields
    private final char[][] board;  // Stores the digits (and blanks) in the puzzle.
    private static final int SIZE = 9;  // This is a 9-by-9 Sudoku puzzle.
    private static final char BLANK = '.';  // Represents a blank cell.
    private boolean solved;  // {true} is the puzzle is solved; {false} otherwise

    // Default constructor
    public Sudoku() { board = new char[SIZE][SIZE]; }

    // Methods

    /** Reads in a puzzle from an input file.
        @param scanner: a Scanner connected with an open input file
    */
    public void loadData(Scanner scanner) {
        for (int row = 0; row < SIZE; row++) {
            String currentRow = scanner.nextLine();
            for (int col = 0; col < SIZE; col++) { board[row][col] = currentRow.charAt(col); }
        }
    }

    /** Tests whether the current digit already appears in the same row.
        @param row: row to check
        @param digit: digit character to search
        @return: {true} if the digit is found in the row; {false} otherwise.
    */
    private boolean appearInRow(int row, char digit) {
        for (int col = 0; col < SIZE; col++) {
            if (digit == board[row][col]) { return true; }
        }
        return false;
    }

    /** Tests whether the current digit already appears in the same column.
        @param col: column to check
        @param digit: digit character to search
        @return: {true} if digit is found in the column; {false} otherwise
    */
    private boolean appearInCol(int col, char digit) {
        for (int row = 0; row < SIZE; row++) {
            if (digit == board[row][col]) { return true; }
        }
        return false;
    }

    /** Tests whether the digit in current cell already appears in the same 3-by-3 grid.
        @param row: row index of the current cell
        @param col: column index of the current cell
        @param digit: digit character to search
        @return: {true} if digit is found in the 3-by-3 grid; {false} otherwise
    */
    private boolean appearInGrid(int row, int col, char digit) {
        int gridStartRow = row / 3 * 3, gridStartCol = col / 3 * 3;
        for (int i = gridStartRow; i < gridStartRow + 3; i++) {
            for (int j = gridStartCol; j < gridStartCol + 3; j++) {
                if (digit == board[i][j]) { return true; }
            }
        }
        return false;
    }

    /** Finds the row index of the next cell (in row-major order) in the 9-by-9 board.
        @param row: row index of the current cell
        @param col: column index of the current cell
        @return: row index of the next cell (in row-major order) in the 9-by-9 board
    */
    private int nextRowIndex(int row, int col) {
        if (col == SIZE - 1) { return row + 1; }  // Next cell is the leftmost cell of the next row.
        else { return row; }  // The next cell is still in the same row.
    }

    /** Finds the column index of the next cell (in row-major order) in the 9-by-9 board.
        @param row: row index of the current cell
        @param col: column index of the current cell
        @return: column index of the next cell (in row-major order) in the 9-by-9 board
    */
    private int nextColIndex(int row, int col) {
        if (col == SIZE - 1) { return 0; }  // The next cell is the leftmost cell of the next row.
        else { return col + 1; }  // The next cell is still in the same row.
    }

    /** Solves the sudoku puzzle.
        @param row: row index of the first blank cell
        @param col: column index of the first blank cell
    */
    private void solve(int row, int col) {
        // Base case
        if (row == SIZE) {
            solved = true;
            return;
        }
        // If the current cell is not a blank, then directly go to the next cell.
        if (board[row][col] != BLANK) { solve(nextRowIndex(row, col), nextColIndex(row, col)); }
        else {  // The current cell is a blank.
            for (char value = '1'; value <= '9'; value++) {
                if (appearInRow(row, value)) { continue; }  // Digit already appears in the same row.
                if (appearInCol(col, value)) { continue; }  // Digit already appears in the same column.
                if (appearInGrid(row, col, value)) { continue; }  // Digit already appears in the 3-by-3 grid.
                board[row][col] = value;  // Fill the cell with the digit.
                solve(nextRowIndex(row, col), nextColIndex(row, col));  // Go to the next cell.
                // If no solution found, change the current cell back to blank and try the next digit.
                if (!solved) { board[row][col] = BLANK; }
            }
        }
    }

    // Wrapper method
    public void solve() { solve(0, 0); }

    /** Writes the solution of the Sudoku puzzle to an output file.
        @param writer: a PrintWriter connected to an open output file
    */
    public void printSolution(PrintWriter writer) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) { writer.print(board[row][col]); }
            writer.println();
        }
    }
}