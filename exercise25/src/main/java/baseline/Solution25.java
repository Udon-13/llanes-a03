/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Max Llanes
 */

package baseline;

import java.util.Scanner;

/*
    method: passwordValidator (String pWord)
        string length pWord
        call method: arrayMaker
        if pWord length < 8
            int = call veryWeak
            int = call weak
        else
         int = call strong
         int = call veryStrong
        return int
 */

/*
    method: veryWeak (char array, int limit)
        for loop to limit
            if array[i] > '0' and array[i] < '9'
                return 0
        return 1
 */

/*
    method: weak (char array, int limit)
        for loop to limit
            if (array[i] < 'A' and array[i] > 'Z') and (array[i] < 'a' and array[i] > 'z')
                return 0
        return 2
 */

/*
    method: strong (char array, int limit)
        int numCount, letterCount
        for loop to limit
            if array[i] < '0' and array[i] > '9'
                numCount++
            if (array[i] < 'A' and array[i] > 'Z') and (array[i] < 'a' and array[i] > 'z')
                letterCount++
        if numCount >0 and letterCount > 0
            return 3
        else
            return 0

 */

/*
    method: veryStrong (char array, int limit)
        int numCount, letterCount, specialCount
        for loop to limit
            if array[i] < '0' and array[i] > '9'
                numCount++
            else if (array[i] < 'A' and array[i] > 'Z') and (array[i] < 'a' and array[i] > 'z')
                letterCount++
            else
                specialCount++
        if numCount >0 and letterCount > 0 and specialCount > 0
            return 4
        else
            return 0
 */

/*
    method: output (int check, String pWord)
        switch(check)
        0 = "average"
        1 = "very weak"
        2 = "weak"
        3 = "strong"
        4 = "very strong"
 */
public class Solution25 {
    static int passwordValidator (String pWord)
    {
        int limit = pWord.length();
        int check =0;
        char[] array = pWord.toCharArray();
        if(limit < 8)
        {
            check = veryWeak(array, limit);
            check = weak(array, limit);
        }
        else
        {
            check = strong(array, limit);
            check = veryStrong(array, limit, check);
        }
        return check;
    }

    static int veryWeak (char[] array, int limit)
    {
        for(int i=0; i<limit;i++)
        {
            if(array[i] < '0' && array[i] > '9')
            {
                return 0;
            }
        }
        return 1;
    }

    static int weak (char[] array, int limit)
    {
        for(int i=0;i<limit;i++)
        {
            if((array[i] < 'A' && array[i] > 'Z') || (array[i] < 'a' && array[i] > 'z'))
            {
                return 0;
            }
        }
        return 2;
    }

    static int strong (char[] array, int limit)
    {
        int numCount = 0;
        int letterCount = 0;
        for(int i=0;i<limit;i++)
        {
            if(array[i] >= '0' && array[i] <= '9')
            {
                numCount++;
            }
            if((array[i] >= 'A' && array[i] <= 'Z') || (array[i] >= 'a' && array[i] <= 'z'))
            {
                letterCount++;
            }
        }
        if(numCount >0 && letterCount > 0)
        {
            return 3;
        }
        return 0;
    }

    static int veryStrong (char[] array, int limit, int check)
    {
        int numCount =0;
        int letterCount =0;
        int specialCount =0;
        for(int i=0;i<limit;i++)
        {
            if(array[i] >= '0' && array[i] <= '9')
            {
                numCount++;
            }
            else if((array[i] >= 'A' && array[i] <= 'Z') || (array[i] >= 'a' && array[i] <= 'z'))
            {
                letterCount++;
            }
            else
            {
                specialCount++;
            }
        }

        if(numCount >0 && letterCount > 0 && specialCount>0)
        {
            return 4;
        }
        return check;
    }

    static void output (String pWord, int check)
    {
        final String intro = "The password '";
        switch (check) {
            case 0 -> System.out.println(intro + pWord + "' is an average password.");
            case 1 -> System.out.println(intro + pWord + "' is a very weak password.");
            case 2 -> System.out.println(intro + pWord + "' is a weak password.");
            case 3 -> System.out.println(intro + pWord + "' is a strong password.");
            case 4 -> System.out.println(intro + pWord + "' is a very strong password.");
            default -> System.out.println("Your password is irregular!?!");
        }
    }

    public static void main(String[] args) {
        /*
        prompt for password
        call passwordValidator
        call output
     */
        Scanner input = new Scanner(System.in);
        String pWord;
        System.out.print("Enter a password: ");
        pWord = input.next();
        int check = passwordValidator(pWord);
        output(pWord, check);

    }
}
