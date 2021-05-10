package com.company.bridegelabz.tictacto;

import java.util.*;

public class TicTacToe {
    public static char board[] = new char[10];
    public static char[] printMatrix() {
        board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }

    public static char getInput(Scanner userInput) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose between x and 0 ");
        return userInput.next().toUpperCase().charAt(0);
    }

    public static void displayBoard() {
        int k = 1;
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                //System.out.print(k);
                System.out.print(board[k]);
                k++;
                if (j < 3) {
                    System.out.print(" | ");
                }

            }
            System.out.println();
            System.out.println("____________");


        }
        System.out.println("  |   |   ");
    }

    public static int getUserMove(char[] board, Scanner userInput) {
        Integer[] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        while (true) {
            System.out.println("What is your next move");
            int index = userInput.nextInt();
            if (Arrays.asList(validCells).contains(index) && isSpaceFree(board, index)) {
                return index;
            }
            else
            {
                System.out.println("Position is already filled");
            }
        }
    }
    private static void checkFreePosition(int userMove)
    {
        Scanner scan=new Scanner(System.in);
        board[userMove]=getInput(scan);
        displayBoard();

    }
    private static boolean isSpaceFree(char[] board, int index) {
        return board[index] == ' ';
    }

    public static void main(String[] args) {
        char computer, user;
        System.out.println("Welcome");
        char board[] = printMatrix();
        Scanner userInput = new Scanner(System.in);
        char userLetter = getInput(userInput);
        char computerLetter = (userLetter == 'X') ? '0' : 'X';
        System.out.println("computerLetter" + computerLetter);
        displayBoard();
        //UC4
        int userMove = getUserMove(board, userInput);
        userLetter = getInput(userInput);
        board[userMove] = userLetter;
        displayBoard();
        //UC5
        userMove=getUserMove(board,userInput);
        checkFreePosition(userMove);
    }
}
