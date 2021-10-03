package baseline;

public class Solution26 {
    public static void main(String[] args) {
        /*
            int month = call method from paymentCalc class
            output the months
         */
        PaymentCalculator payCalc = new PaymentCalculator();
        System.out.println("It will take you " + payCalc.calculateMonthsUntilPaidOff() + "months to pay off this card.");
    }
}
