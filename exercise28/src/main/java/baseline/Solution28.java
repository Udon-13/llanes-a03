package baseline;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {
        /*
        for loop to 5
            temp = prompt for number
            total += temp
        output total statement
         */
        Scanner input = new Scanner(System.in);
        int total =0;
        int temp;

        for(int i =0; i<5;i++)
        {
            System.out.print("Enter a number: ");
            temp = input.nextInt();
            total += temp;
        }
        System.out.println("The total is " + total + ".");
    }
}
