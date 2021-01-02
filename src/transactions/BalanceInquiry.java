package transactions;

import enums.TransactionStatus;
import account.*;

import java.time.LocalDate;

public class BalanceInquiry extends Transaction {
    private double _accountId;

    public BalanceInquiry(double _accountId) {
        this._accountId = _accountId;
    }

    public BalanceInquiry(int _transactionId, TransactionStatus _status, LocalDate _creationDate, double _accountId) {
        super(_transactionId, _status, _creationDate);
        this._accountId = _accountId;
    }

    public double get_accountId() {
        return _accountId;
    }

    public void set_accountId(double _accountId) {
        this._accountId = _accountId;
    }
}
