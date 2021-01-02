package atm;

import enums.*;
import java.util.Scanner;

public class Screen {
    public boolean showMessage(){
        System.out.println("What do you want to do?");
        System.out.println("1. Balance Inquiry");
        System.out.println("2. Cash Deposit");
        System.out.println("3. Check Deposit");
        System.out.println("4. Withdraw");
        System.out.println("5. Transfer");
        return true;
    }

    public TransactionType getInput(){
        Scanner sc = new Scanner(System.in);

        showMessage();

        int inp = sc.nextInt();

        switch (inp){
            case 1:
                return TransactionType.BALANCEUINQUIRY;
            case 2:
                return TransactionType.DEPOSITCASH;
            case 3:
                return TransactionType.DEPOSITCHECK;
            case 4:
                return TransactionType.WITHDRAW;
            case 5:
                return TransactionType.TRANSFER;
            default:
                return TransactionType.NONE;
        }

    }
}
