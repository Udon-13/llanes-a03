/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Max Llanes
 */

package baseline;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

public class Solution24 {
    /*
        method: charCheck (int limit int currentCheck, String word1, String word2)
            for (i; 0 to limit; step)
                if word1[i] == word2[i]
                    bool check = true
            if check = false
                false output statement
                exit
     */
    static void falseStatement(int check)
    {
        switch (check)
        {
            case 1:
                System.out.println("Your words aren't the same size.");
            case 2:
                System.out.println("Your words aren't anagrams.");
        }
    }

    static void charCheck (int limit, char word1[], char word2[])
    {
        for (int i=0; i<limit; i++)
        {
            if(word1[i] != word2[i])
            {
                falseStatement(2);
                System.exit(0);
            }
        }
    }


    /*
        method: sortStrings(String str1)
            make str1 char array
            use prebuilt sorting array method
            return str1
     */

    static char[] sortStrings(String str)
    {
        char sortedArray[] = str.toCharArray();
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    /*
        method: lengthCheck (String str1 String str2)
            if str1 length == str2 length
                return str length
            else
                false statement
                exit
     */

    static int lengthCheck (String str1, String str2)
    {
        if(str1.length() == str2.length() )
        {
            return str1.length();
        }
        else
        {
            falseStatement(1);
            System.exit(0);
        }
        return 0;
    }

    /*
        method: isAnagram (String str1 String str20
            limit = lengthCheck
            str1 = sortStrings
            str2 = sortStrings
            charCheck
            output true

     */

    static boolean isAnagram (String str1, String str2)
    {
        int limit = lengthCheck(str1, str2);
        char array1[] = sortStrings(str1);
        char array2[] = sortStrings(str2);
        charCheck(limit, array1, array2);
        return true;
    }

    public static void main(String[] args) {
        /*
            prompt for two strings
            check = isAnagram
            if check
                true statement
         */
        Scanner input = new Scanner(System.in);
        String str1, str2;
        boolean check =false;
        System.out.print("Type your first word: ");
        str1 = input.nextLine();
        System.out.print("Type your second word: ");
        str2 = input.nextLine();

         check = isAnagram(str1,str2);
         if(check)
         {
             System.out.println("\"" + str1 + "\"" + " and " + "\"" + str2 + "\" are anagrams." );
         }
    }
}
