package com.company.bridegelabz.tictacto;
import  java.util.*;
public class TicTacToe
{
    public static char board[]=new char[10];
    public static char[] printMatrix()
    {
        board=new char[10];
        for(int i=1;i<board.length;i++)
        {
            board[i]=' ';
        }
        return board;
    }
    public static char getInput(Scanner userInput)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Choose between x and 0 ");
//        char option=scan.next().charAt(0);
//        System.out.println("You choose "+option);
        return userInput.next().toUpperCase().charAt(0);
    }
    public static void displayBoard()
    {
        int k=1;
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                //System.out.print(k);
                System.out.print(board[k]);
                  k++;
                if(j<3)
                {
                    System.out.print(" | ");
                }

            }
            System.out.println();
            System.out.println("____________");


        }
        System.out.println("  |   |   ");
    }
      public static void moveLocation()
     {
         Scanner scan=new Scanner(System.in);
         System.out.println("At which position you want to insert value ");
         int position= scan.nextInt();
         System.out.println("Enter value ");
         char output=scan.next().charAt(0);
         if(board[position]!='X'&&board[position]!='O')
         {
             TicTacToe.board[position]=output;
             displayBoard();

         }
         else
         {
             System.out.println("Position is already filled choose again");
             moveLocation();

         }

     }
    public static void main(String[] args)
    {
        char computer,user;
        System.out.println("Welcome");
        char board[]=printMatrix();
        Scanner userInput=new Scanner(System.in);
        char userLetter=getInput(userInput);
        char computerLetter=(userLetter=='X')?'0':'X';
        System.out.println("computerLetter"+computerLetter);
        displayBoard();
        //UC4
        moveLocation();
    }
}
