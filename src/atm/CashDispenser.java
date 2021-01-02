package atm;

public class CashDispenser {
    private int _totalFiveDollarBills, _totalTwentyDollarBills;

    public CashDispenser() {
    }

    public CashDispenser(int _totalFiveDollarBills, int _totalTwentyDollarBills) {
        this._totalFiveDollarBills = _totalFiveDollarBills;
        this._totalTwentyDollarBills = _totalTwentyDollarBills;
    }

    public boolean dispenseCash(){
        return false;
    }

    public boolean canDispenseCash(){
        return false;
    }

    public int get_totalFiveDollarBills() {
        return _totalFiveDollarBills;
    }

    public void set_totalFiveDollarBills(int _totalFiveDollarBills) {
        this._totalFiveDollarBills = _totalFiveDollarBills;
    }

    public int get_totalTwentyDollarBills() {
        return _totalTwentyDollarBills;
    }

    public void set_totalTwentyDollarBills(int _totalTwentyDollarBills) {
        this._totalTwentyDollarBills = _totalTwentyDollarBills;
    }
}
