package account;

public class SavingAccount extends Account {
    private double _withdrawalLimit;

    public SavingAccount(double _withdrawalLimit) {
        this._withdrawalLimit = _withdrawalLimit;
    }

    public SavingAccount(int _accountNumber, double _totalBalance, double _availableBalance, double _withdrawalLimit) {
        super(_accountNumber, _totalBalance, _availableBalance);
        this._withdrawalLimit = _withdrawalLimit;
    }

    public double get_withdrawalLimit() {
        return _withdrawalLimit;
    }

    public void set_withdrawalLimit(double _withdrawalLimit) {
        this._withdrawalLimit = _withdrawalLimit;
    }
}
