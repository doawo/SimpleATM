package deposit;

import enums.TransactionStatus;
import transactions.Deposit;

import java.time.LocalDate;

public class CheckDeposit extends Deposit{
    private String _checkNumber, _bankCode;

    public CheckDeposit(double _amount, String _checkNumber, String _bankCode) {
        super(_amount);
        this._checkNumber = _checkNumber;
        this._bankCode = _bankCode;
    }

    public CheckDeposit(int _transactionId, TransactionStatus _status, LocalDate _creationDate, double _amount, String _checkNumber, String _bankCode) {
        super(_transactionId, _status, _creationDate, _amount);
        this._checkNumber = _checkNumber;
        this._bankCode = _bankCode;
    }

    public String get_checkNumber() {
        return _checkNumber;
    }

    public void set_checkNumber(String _checkNumber) {
        this._checkNumber = _checkNumber;
    }

    public String get_bankCode() {
        return _bankCode;
    }

    public void set_bankCode(String _bankCode) {
        this._bankCode = _bankCode;
    }
}
