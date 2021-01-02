package account;

public class CheckingAccount extends Account{
    private String _debitCardNumber;

    public CheckingAccount(String _debitCardNumber) {
        this._debitCardNumber = _debitCardNumber;
    }

    public CheckingAccount(int _accountNumber, double _totalBalance, double _availableBalance, String _debitCardNumber) {
        super(_accountNumber, _totalBalance, _availableBalance);
        this._debitCardNumber = _debitCardNumber;
    }

    public String get_debitCardNumber() {
        return _debitCardNumber;
    }

    public void set_debitCardNumber(String _debitCardNumber) {
        this._debitCardNumber = _debitCardNumber;
    }
}
