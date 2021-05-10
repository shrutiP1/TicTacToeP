package com.company.bridegelabz.tictacto;
import  java.util.*;
public class TicTacToe
{
    public static char board[];
    public static char[] printMatrix()
    {
        board=new char[10];
        for(int i=1;i<board.length;i++)
        {
            board[i]=' ';
        }
        return board;
    }
    public static char getInput()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Choose between x and 0 ");
        char option=scan.next().charAt(0);
        System.out.println("You choose "+option);
        return option;
    }
    public static void main(String[] args)
    {
        char computer,user;
        System.out.println("Welcome");
        char board[]=printMatrix();
        user=getInput();
        if(user=='x')
        {
            computer='o';
        }
        else
        {
            computer='x';
        }
        System.out.println("computer "+computer);
    }
}
