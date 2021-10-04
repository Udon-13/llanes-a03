package baseline;
import java.util.Scanner;
import java.util.Objects;

public class Solution34 {
    /*
    pre-made array of workers
    display via for loop
    ask for what name to delete
    compare for each element
    remove same elements from array
    display array
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strArray = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] strArray2 = new String[strArray.length - 1];
        String str;

        System.out.println("There are " + strArray.length + " employees:");
        for(int i =0; i<strArray.length;i++)
        {
            System.out.println(strArray[i]);
        }
        System.out.println();
        System.out.print("Enter an employee name to remove: ");
        str = input.nextLine();
        System.out.println();
        System.out.println("There are " + strArray2.length + " employees:");

        for (int j=0, k=0;j< strArray.length;j++)
        {
            if(Objects.equals(str, strArray[j]))
            {
                continue;
            }
            else
            {
                strArray2[k++] = strArray[j];
            }
        }

        for (int l=0;l< strArray2.length;l++)
        {
            System.out.println(strArray2[l]);
        }

    }
}
