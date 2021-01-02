package atm;

import datatypes.*;
import bank.*;
import enums.TransactionStatus;
import transactions.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Atm {
    private int _atmID;
    private Address _location;
    private CashDispenser _cashDispenser;
    private Keypad _keypad;
    private Screen _screen;
    private Printer _printer;
    private CardReader _cardReader;
    private DepositSlot _depositSlot;

    private Transaction _transaction;

    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Atm() {
    }

    public Atm(int _atmID, Address _location, CashDispenser _cashDispenser, Keypad _keypad, Screen _screen, Printer _printer, CardReader _cardReader, DepositSlot _depositSlot) {
        this._atmID = _atmID;
        this._location = _location;
        this._cashDispenser = _cashDispenser;
        this._keypad = _keypad;
        this._screen = _screen;
        this._printer = _printer;
        this._cardReader = _cardReader;
        this._depositSlot = _depositSlot;
    }

    public void makeTransaction(int transactionId, TransactionStatus transactionStatus, LocalDate localDate){
        Transaction transaction = new Transaction(transactionId, transactionStatus, localDate);
        transactions.add(transaction);
    }

    public int get_atmID() {
        return _atmID;
    }

    public void set_atmID(int _atmID) {
        this._atmID = _atmID;
    }

    public Address get_location() {
        return _location;
    }

    public void set_location(Address _location) {
        this._location = _location;
    }

    public CashDispenser get_cashDispenser() {
        return _cashDispenser;
    }

    public void set_cashDispenser(CashDispenser _cashDispenser) {
        this._cashDispenser = _cashDispenser;
    }

    public Keypad get_keypad() {
        return _keypad;
    }

    public void set_keypad(Keypad _keypad) {
        this._keypad = _keypad;
    }

    public Screen get_screen() {
        return _screen;
    }

    public void set_screen(Screen _screen) {
        this._screen = _screen;
    }

    public Printer get_printer() {
        return _printer;
    }

    public void set_printer(Printer _printer) {
        this._printer = _printer;
    }

    public CardReader get_cardReader() {
        return _cardReader;
    }

    public void set_cardReader(CardReader _cardReader) {
        this._cardReader = _cardReader;
    }

    public DepositSlot get_depositSlot() {
        return _depositSlot;
    }

    public void set_depositSlot(DepositSlot _depositSlot) {
        this._depositSlot = _depositSlot;
    }
}
