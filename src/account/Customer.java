package account;

import enums.*;
import datatypes.*;
import bank.*;

import atm.Atm;

public class Customer {
    private String _name, _email, _phone;
    private Address _address;
    private CustomerStatus _status;
    private Card _card;
    private Account _account;

    public Customer() {
    }

    public Customer(String _name, String _email, String _phone, Address _address, CustomerStatus _status, Card _card, Account _account) {
        this._name = _name;
        this._email = _email;
        this._phone = _phone;
        this._address = _address;
        this._status = _status;
        this._card = _card;
        this._account = _account;
    }

    public boolean makeTransaction(){
        return false;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    public Address get_address() {
        return _address;
    }

    public void set_address(Address _address) {
        this._address = _address;
    }

    public CustomerStatus get_status() {
        return _status;
    }

    public void set_status(CustomerStatus _status) {
        this._status = _status;
    }

    public Card get_card() {
        return _card;
    }

    public void set_card(Card _card) {
        this._card = _card;
    }

    public Account get_account() {
        return _account;
    }

    public void set_account(Account _account) {
        this._account = _account;
    }
}
