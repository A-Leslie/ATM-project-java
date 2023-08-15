import com.sun.source.tree.UsesTree;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Options  extends Account {
Scanner menuInput = new Scanner(System.in);
DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");
HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

//validate login info ,customer nbr and pin nbr

    public void getLogin() throws IOException{
     int x=1;
     do {
         try{
             //I've set 2 account privileges
             data.put(9876543,9876);
             data.put(8989898,1890);

             System.out.println("Welcome to ATM !!");

             //read customer number and  pin-number

             System.out.println("Enter your Customer Number: ");
             setCustomerNumber(menuInput.nextInt());

             System.out.println("Enter your Pin Number: ");
             setPinNumber(menuInput.nextInt());
         }
         //if other characters are passed
         catch (Exception e){
             System.out.println("\n"+"Invalid character(s). Only numbers."+"\n");
             x=2;
         }
         //check if entered customer number and pin-number are correct
         for(Entry<Integer,Integer> entry:data.entrySet()){
             if(entry.getKey()== getCustomerNumber() && entry.getValue() == getPinNumber());
             getAccountType();
         }
         System.out.println("\n"+"Wrong Customer Number or Pin Number"+"\n");
     }while(x == 1);
    }

    //Display Account type menu with selection

    public void getAccountType(){
        System.out.println("Select the Account you want to access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                getChecking();
                break;
            case 1:
                getChecking();
                break;
        }
    }
}
