package com.techlabs.model;

import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for the board: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        char[][] board = new char[rows][columns];

        createBoard(board, rows, columns);
        gameBegin(board, scanner, rows, columns);
    }

    private static void gameBegin(char[][] board, Scanner scanner, int rows, int columns) {
        boolean gameOver = false;
        char currentPlayer = 'X';
        
        while (!gameOver) {
            printBoard(board, rows, columns);
            System.out.println("Current Player: " + currentPlayer + ", enter your position of row and column from 1-3: ");
            int row = scanner.nextInt() - 1;
            if(row>3) {
             throw new IndexOutOfBoundsException();
            }
            int column = scanner.nextInt() - 1;

            if (validMove(board, row, column)) {
                board[row][column] = currentPlayer;

                if (gameWin(board, row, column, currentPlayer, rows, columns)) {
                    printBoard(board, rows, columns);
                    System.out.println("Player " + currentPlayer + " wins the match!");
                    gameOver = true;
                    return;
                }

                if (boardFull(board, rows, columns)) {
                    printBoard(board, rows, columns);
                    System.out.println("No space left, it's a tie!");
                    return;
                }

                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("This move is not valid");
            }
        }
        
        scanner.close();
    }

    private static boolean boardFull(char[][] board, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean gameWin(char[][] board, int row, int column, char currentPlayer, int rows, int columns) {
        // Check the row
        boolean win = true;
        for (int i = 0; i < columns; i++) {
            if (board[row][i] != currentPlayer) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // Check the column
        win = true;
        for (int i = 0; i < rows; i++) {
            if (board[i][column] != currentPlayer) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // Check the main diagonal
        if (row == column) {
            win = true;
            for (int i = 0; i < rows; i++) {
                if (board[i][i] != currentPlayer) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // Check the secondary diagonal
        if (row + column == rows - 1) {
            win = true;
            for (int i = 0; i < rows; i++) {
                if (board[i][rows - i - 1] != currentPlayer) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        return false;
    }

    private static boolean validMove(char[][] board, int row, int column) {
        return (row >= 0 && row < board.length && column >= 0 && column < board[0].length && board[row][column] == '-');
    }

    private static void createBoard(char[][] board, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = '-';
            }
        }
    }
    
    private static void printBoard(char[][] board, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}