package bank;

import java.util.ArrayList;
import atm.Atm;

public class Bank {
    private String _name, _bankCode;
    private ArrayList<Atm> atms = new ArrayList<Atm>();

    public Bank() {
    }

    public Bank(String _name, String _bankCode) {
        this._name = _name;
        this._bankCode = _bankCode;
    }

    public boolean addATM(Atm atm){
        atms.add(atm);
        return false;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_bankCode() {
        return _bankCode;
    }

    public void set_bankCode(String _bankCode) {
        this._bankCode = _bankCode;
    }
}
