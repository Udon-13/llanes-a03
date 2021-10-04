/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Max Llanes
 */


package baseline;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Solution32 {
    static int count =0;
    /*
        do loop while answer != N or n
            prompt for difficult
            rand func set to switch case for diff
            prompt for first answer
            do loop while guess != randNum
                if statement for >
                    too high!
                else
                    too low!
            prompt for playAgain
     */

    static int checkIfInt(int check)
    {
        Scanner input = new Scanner(System.in);
        String str;
        int temp=0;
        int hold = 0;
        do{
            output(check);
            if(input.hasNextInt())
            {
                temp = input.nextInt();
                if(temp >0)
                {
                    break;
                }
            }
            str = input.nextLine();
            if(check != 1)
            {
                count++;
            }
            System.out.println("Sorry. That's not a valid input");
        }while(hold == 0);
        return temp;
    }

    static void output (int check)
    {
        switch (check)
        {
            case 1 -> System.out.print("Enter the difficulty level (1, 2, or 3):");
            case 2 -> System.out.print("I have my number. What's your guess? ");
            case 3 -> System.out.print("Too low. Guess again: ");
            case 4 -> System.out.print("Too high. Guess again: ");
        }
    }

    static int randomLimit (int check)
    {
        switch (check)
        {
            case 1: return 11;
            case 2: return 101;
            case 3: return 1001;
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String answer;
        int guess;
        int diff;
        int randomNum;

        do
        {
            count =0;
            diff = checkIfInt(1);
            randomNum = rand.nextInt(randomLimit(diff)-1)+1;
            guess = checkIfInt(2);
            count++;
            do
            {
                if(guess>randomNum)
                {
                    guess = checkIfInt(4);
                    count++;
                }
                else if(guess<randomNum)
                {
                    guess = checkIfInt(3);
                    count++;
                }
            }while(guess != randomNum);
            System.out.println("You got it in " + count + " guesses!\n");
            System.out.println("Do you wish to play again (Y/N)? ");
            answer = input.nextLine();
        }while(!Objects.equals(answer, "N") && !Objects.equals(answer, "n"));
    }
}
