package com.main;

import enums.*;
import datatypes.*;

import account.*;
import atm.*;
import bank.*;
import deposit.*;
import transactions.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Customer Creation

        LocalDate newCardExpDate = LocalDate.of(2021, 4, 1);

        Card newCard = new Card("4280 3690", "Eva Brown", newCardExpDate, 6012);
        Account newAcc = new Account(12, 300.0f, 250.0f);
        Address newAdd = new Address("Baker st.", "London", "none", "020401", "United Kingdom");


        Customer eva_brown = new Customer("Eva Brown", "evabrown@mail.com", "+2210101", newAdd, CustomerStatus.ACTIVE, newCard, newAcc);

        //Bank creation

        Bank bank = new Bank("Reserve bank", "60842");

        //ATM creation

        CashDispenser cd = new CashDispenser(100, 100);
        Keypad kp = new Keypad();
        Screen s = new Screen();
        Printer p = new Printer();
        CardReader cr = new CardReader();
        DepositSlot ds = new DepositSlot();


        Atm newATM = new Atm(01, newAdd, cd, kp, s, p, cr, ds);

        bank.addATM(newATM);

        LocalDate transDate = LocalDate.of(2020, 11, 18);

        int amount = 500;

        if (kp.getInput() == newCard.get_pin()){
            switch(s.getInput()){
                case BALANCEUINQUIRY:
                    BalanceInquiry balanceInquiry = new BalanceInquiry(0, TransactionStatus.SUCCESS, transDate, 12);
                    break;
                case DEPOSITCASH:
                    CashDeposit cashDeposit = new CashDeposit(0, TransactionStatus.SUCCESS, transDate, amount, 1000);
                    newAcc.set_totalBalance(newAcc.get_totalBalance() + amount);
                    break;
                case DEPOSITCHECK:
                    CheckDeposit checkDeposit = new CheckDeposit(0, TransactionStatus.SUCCESS, transDate, amount, "1000", bank.get_bankCode());
                    break;
                case WITHDRAW:
                    Withdraw withdraw = new Withdraw(0, TransactionStatus.SUCCESS, transDate, amount);
                    newAcc.set_totalBalance(newAcc.get_totalBalance() - amount);
                    break;
                case TRANSFER:
                    Transfer transfer = new Transfer(0, TransactionStatus.SUCCESS, transDate, 13, 12, 500);
                    newAcc.set_totalBalance(newAcc.get_totalBalance() - amount);
                    break;

            }
        }else
            System.out.println("Wrong Pin");


    }
}
