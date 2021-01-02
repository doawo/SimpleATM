package transactions;

import enums.TransactionStatus;

import java.time.LocalDate;

public class Withdraw extends Transaction{
    private double _amount;

    public Withdraw(double _amount) {
        this._amount = _amount;
    }

    public Withdraw(int _transactionId, TransactionStatus _status, LocalDate _creationDate, double _amount) {
        super(_transactionId, _status, _creationDate);
        this._amount = _amount;
    }

    public double get_amount() {
        return _amount;
    }

    public void set_amount(double _amount) {
        this._amount = _amount;
    }
}
