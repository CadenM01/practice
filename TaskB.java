//Caden Maki
//CS1400
//Assignment 2
//9-20-2024
//TaskB Splitting the bill

import java.text.DecimalFormat;
import java.util.Scanner;

public class TaskB
{
    public static void main (String[]arg)
    {



        //Processing
        double tipAmount = (billAmount * tip);
        double taxAmount = ((billAmount + tipAmount) * tax);
        double totalAmount = billAmount + taxAmount + tipAmount;
        double amountPerPerson = (totalAmount / partySize);

        //limits the decimal value to two places

        //Outputs results
        System.out.print("for a party size of " + partySize
                + " people, the amount due for each person is: $" +
                new DecimalFormat("#.##").format(amountPerPerson)); //Truncates the double variable
        //and limits it to two places
    }
}
