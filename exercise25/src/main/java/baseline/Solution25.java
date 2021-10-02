/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Max Llanes
 */

package baseline;


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
    method: arrayMaker (String pWord)
        char array = pWord to charArray
        return array
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
    /*
        prompt for password
        call passwordValidator
        call output
     */
}
