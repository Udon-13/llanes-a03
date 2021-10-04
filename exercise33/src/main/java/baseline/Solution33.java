package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    /*
    prompt for question
    random obj to get int between 0 - 3
    call switch case with 4 outputs
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int rNum;
        int check;
        String str;
        System.out.println("What's your question?");
        str = input.nextLine();
        check = rand.nextInt(4);
        switch (check)
        {
            case 0-> System.out.println("Yes");
            case 1-> System.out.println("No");
            case 2-> System.out.println("Maybe");
            case 3-> System.out.println("Ask again later.");
        }

    }
}
