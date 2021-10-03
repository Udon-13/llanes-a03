package baseline;
import java.util.Scanner;

public class Solution27 {
    /*
    method: validName (String)
        if string length is less than 2
            output statement
     */
    static int validFirstName (String fName)
    {
        int check=0;
        if(fName.length() < 2)
        {
            badOutput(1);
            check++;
        }
        if(fName.isEmpty())
        {
            badOutput(2);
            check++;
        }
        return check;
    }

    static int validLastName (String lName)
    {
        int check=0;
        if(lName.length() < 2)
        {
            badOutput(3);
            check++;
        }
        if(lName.isEmpty())
        {
            badOutput(4);
            check++;
        }
        return check;
    }
    /*
    method: validZIP (String)
        if string != int
            output statement
     */
    static int validZIP (String zip)
    {
        int limit = zip.length();
        char[] array = zip.toCharArray();
        if(limit != 5)
        {
            badOutput(6);
            return 1;
        }
        for(int i=0; i<limit;i++)
        {
            if(!(array[i] >= '0' && array[i] <= '9'))
            {
                badOutput(6);
                return 1;
            }
        }
        return 0;
    }
    /*
    method: validID (String)
        if length != 7
            output statement
        if String[2] != '-'
            output statement
        if string 0 & 1 are not letters(capital)
            output statement
        if string[3-6] is not number
            output statement

     */
    static int validID (String id)
    {
        char[] array = id.toCharArray();
        if(id.length() != 7)
        {
            badOutput(5);
            return 1;
        }

        if(array[2] != '-')
        {
            badOutput(5);
            return 1;
        }
        for(int i=0;i<2;i++)
        {
            if(!(array[i] >= 'A' && array[i] <= 'Z'))
            {
                badOutput(5);
                return 1;
            }
        }
        for(int i = 3;i<7;i++)
        {
            if(!(array[i] >= '0' && array[i] <= '9'))
            {
                badOutput(5);
                return 1;
            }
        }
        return 0;
    }
    /*
    method: validateInput
        validName(last) - - - - - - all valid functions return +1 if not valid to count for errors
        validName(first)
        validID (id)
        validZIP (zip)
     */
    static void validateInput(String fName, String lName, String id, String zip)
    {
        int errorNum =0;
        errorNum += validFirstName(fName);
        errorNum += validLastName(lName);
        errorNum += validID(id);
        errorNum += validZIP(zip);

        if(errorNum==0)
        {
            System.out.println("There were no errors found.");
        }
        else
        {
            System.out.println("There were " + errorNum + " error(s) found.");
        }
    }
    /*
    method: badOutput (check)
        switch(check)
        1 : 2 chars more
        2 : filled in
        3 : format!
        4 : 5 numbers
     */
    static void badOutput (int check)
    {
        switch (check){
            case 1 -> System.out.println("The first name must be at least 2 characters long.");
            case 2 -> System.out.println("The first name must be filled in.");
            case 3 -> System.out.println("The last name must be at least 2 characters long.");
            case 4 -> System.out.println("The last name must be filled in.");
            case 5 -> System.out.println("The employee ID must be in the format of AA-1234");
            case 6 -> System.out.println("The zipcode must be a 5 digit number");
        }
    }

    public static void main(String[] args) {
    /*
    call valid function
     */
        Scanner input = new Scanner(System.in);
        String fName;
        String lName;
        String zip;
        String id;

        System.out.print("Enter the first name: ");
        fName = input.nextLine();
        System.out.print("Enter the last name: ");
        lName = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        id = input.nextLine();

        validateInput(fName, lName, id, zip);
    }
}
