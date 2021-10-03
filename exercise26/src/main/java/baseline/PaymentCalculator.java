package baseline;
import java.util.Scanner;
import java.lang.Math;

public class PaymentCalculator {
    /*
    prompt for balance, APR, monthPay
    use formula to get months
    return months rounded up
     */
    int calculateMonthsUntilPaidOff ()
    {
        Scanner input = new Scanner(System.in);
        int balance;
        int apr;
        int monthPayment;
        int months;
        System.out.print("What is your balance? ");
        balance = input.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        apr = input.nextInt();
        System.out.print("What is the monthly payment you can make? ");
        monthPayment = input.nextInt();

        months = (int)Math.ceil(formula(balance, apr, monthPayment));

        return months;
    }

    double formula(int b, int apr, int p)
    {
        double i = apr/100f;
        i /=365;
        double temp;
        double temp2;

        temp = i + 1;
        temp = Math.pow(temp, 30);
        temp = 1 - temp;
        temp2 = (double)b/p;
        temp *= temp2;
        temp += 1;
        temp = Math.log(temp);

        temp2 = 1f/30;
        temp2 *= -1;

        temp *= temp2;

        temp2 = i+1;
        temp2 = Math.log(temp2);

        temp/= temp2;

        return temp;
    }
}
