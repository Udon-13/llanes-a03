/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Max Llanes
 */


package baseline;

import java.util.Scanner;

public class Solution31 {

    /*
    method: targetHeartRate (int age, int restHR)
        setup statement
        for loop start at 55 inc ++ 5 stop at 95
            intense = i / 100
            int = call formula(age, restHr, intense)
            output statement
     */
    static void targetHeartRate (int age, int restHR)
    {
        double intense;
        System.out.println("Intensity    | Rate\n-------------|--------");
        for (int i=55;i<=95;i+=5)
        {
            intense = i/100f;
            System.out.println(i + "%          | " + formula(age, restHR, intense) + " bpm");
        }
    }

    static int formula(int age, int restHR, double intense)
    {
        double temp = (((220-age)-restHR) * intense) + restHR;
        return (int)Math.round(temp);
    }

    static int restPulsePrompt ()
    {
        Scanner input = new Scanner(System.in);
        String str;
        int temp=0;
        int hold =0;
        do{
            System.out.print("Resting Pulse: ");
            if(input.hasNextInt())
            {
                temp = input.nextInt();
                if(temp >0)
                {
                    break;
                }
            }
            str = input.nextLine();
            System.out.println("Sorry. That's not a valid input");
        }while(hold == 0);
        return temp;
    }

    static int agePrompt ()
    {
        Scanner input = new Scanner(System.in);
        String str;
        int temp=0;
        int hold =0;
        do{
            System.out.print("Age: ");
            if(input.hasNextInt())
            {
                temp = input.nextInt();
                if(temp >0)
                {
                    break;
                }
            }
            str = input.nextLine();
            System.out.println("Sorry. That's not a valid input");
        }while(hold == 0);
        return temp;
    }

    public static void main(String[] args) {
        /*
        prompt for restPulse and age
        run through method check
         */
        int age;
        int restPulse;
        restPulse = restPulsePrompt();
        age = agePrompt();

        targetHeartRate(age, restPulse);


    }
}
