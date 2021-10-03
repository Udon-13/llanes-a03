package baseline;

import java.util.Scanner;

public class Solution29 {
    /*
        prompt for rate
        use hasNextInt to check
        do while loop
            if hasNextInt && !=0
                output statement
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        double temp =0;
        int hold = 0;
        do{
            System.out.print("What is the rate of return? ");
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
        temp = 72f/temp;
        System.out.println("It will take " + (int)temp + " years to double your initial investment.");

    }

}
