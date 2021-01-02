package deposit;

import enums.TransactionStatus;
import transactions.Deposit;

import java.time.LocalDate;

public class CashDeposit extends Deposit{
    private double _cashDepositLimit;

    public CashDeposit(double _amount, double _cashDepositLimit) {
        super(_amount);
        this._cashDepositLimit = _cashDepositLimit;
    }

    public CashDeposit(int _transactionId, TransactionStatus _status, LocalDate _creationDate, double _amount, double _cashDepositLimit) {
        super(_transactionId, _status, _creationDate, _amount);
        this._cashDepositLimit = _cashDepositLimit;
    }

    public double get_cashDepositLimit() {
        return _cashDepositLimit;
    }

    public void set_cashDepositLimit(double _cashDepositLimit) {
        this._cashDepositLimit = _cashDepositLimit;
    }
}
