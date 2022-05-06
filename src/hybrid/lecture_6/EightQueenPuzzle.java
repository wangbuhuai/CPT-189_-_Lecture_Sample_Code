// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-20

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package hybrid.lecture_6;

import java.io.PrintWriter;

public class EightQueenPuzzle {
    // Data fields
    private static final char QUEEN = 'Q';
    private static final char BLANK = '.';
    private final char[][] board;
    private int numOfSolutions;  // Stores the number of solutions found.

    // Default constructor
    public EightQueenPuzzle() {
        board = new char[8][8];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) { board[row][col] = BLANK; }
        }
    }

    // Methods

    /** Tests whether there is another queen in the same column.
        @param col: index of the column to test
        @return: {true} if there is another queen in the same column; {false} otherwise
    */
    private boolean inSameColumn(int col) {
        for (int row = 0; row < 8; row++) {
            if (board[row][col] == QUEEN) { return true; }
        }
        return false;
    }

    /** Tests whether there is another queen in diagonal directions.
        @param row: row index of the current cell
        @param col: column index of the current cell
        @return: {true} if there is another queen in diagonal directions; {false} otherwise
    */
    private boolean inDiagonal(int row, int col) {
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {  // Top-left direction
            if (board[i][j] == QUEEN) { return true; }
        }
        for (int i = row, j = col; i >= 0 && j < 8; i--, j++) {  // Top-right direction
            if (board[i][j] == QUEEN) { return true; }
        }
        for (int i = row, j = col; i < 8 && j < 8; i++, j++) {  // Bottom-right direction
            if (board[i][j] == QUEEN) { return true; }
        }
        for (int i = row, j = col; i < 8 && j >= 0; i++, j--) {  // Bottom-left direction
            if (board[i][j] == QUEEN) { return true; }
        }
        return false;
    }

    /** Writes a found solution to an output file.
        @param writer: a PrintWriter that is linked with an open output file.
    */
    private void printSingleSolution(PrintWriter writer) {
        writer.printf("Solution %d\n\n", ++numOfSolutions);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                writer.print(board[row][col]);
            }
            writer.println();
        }
        writer.println();
    }

    /** Finds all the solutions of the puzzle and writes them to an output file.
        @param row: index of the current row
        @param writer: a PrintWriter that is linked with an open output file.
    */
    private void solve(int row, PrintWriter writer) {
        if (row == 8) {  // Base case (a solution is found)
            printSingleSolution(writer);
        } else {
            for (int col = 0; col < 8; col++) {
                if (inSameColumn(col)) { continue; }  // There is another queen in the same column.
                if (inDiagonal(row, col)) { continue; }  // There is another queen in diagonal directions.
                board[row][col] = QUEEN;  // Place the queen.
                solve(row + 1, writer);  // Recurrence relation
                board[row][col] = BLANK;  // Reset to find more solutions.
            }
        }
    }

    // Wrapper method
    public void solve(PrintWriter writer) { solve(0, writer); }
}