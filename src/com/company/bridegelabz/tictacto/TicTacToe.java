package com.company.bridegelabz.tictacto;

public class TicTacToe
{
    public static char board[][];
    public static void printMatrix()
    {
        board=new char[4][4];
        for(int i=1;i<board.length;i++)
        {
            for(int j=1;j<4;j++)
            {
                System.out.print("___"+board[i][j]+"|");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Welcome");
        printMatrix();

    }
}
