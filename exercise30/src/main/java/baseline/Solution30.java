package baseline;

public class Solution30 {
    /*
    for loop to 12
        for loop to 12
            output i * j + /t
     */
    public static void main(String[] args) {
    for (int i=1;i<=12;i++)
    {
        for(int j=1;j<=12;j++)
            {
                System.out.print(i*j + "\t");
            }
        System.out.print("\n");
    }
    }

}
