package account;

public class Account {
    private int _accountNumber;
    private double _totalBalance, _availableBalance;

    public Account() {
    }

    public Account(int _accountNumber, double _totalBalance, double _availableBalance) {
        this._accountNumber = _accountNumber;
        this._totalBalance = _totalBalance;
        this._availableBalance = _availableBalance;
    }

    public int get_accountNumber() {
        return _accountNumber;
    }

    public void set_accountNumber(int _accountNumber) {
        this._accountNumber = _accountNumber;
    }

    public double get_totalBalance() {
        return _totalBalance;
    }

    public void set_totalBalance(double _totalBalance) {
        this._totalBalance = _totalBalance;
    }

    public double get_availableBalance() {
        return _availableBalance;
    }

    public void set_availableBalance(double _availableBalance) {
        this._availableBalance = _availableBalance;
    }
}
