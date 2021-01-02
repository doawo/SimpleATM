package transactions;

import enums.*;
import account.Account;
import atm.Atm;

import java.time.LocalDate;
import account.Account;

public class Transaction {
    private int _transactionId;
    private TransactionStatus _status;
    private LocalDate _creationDate;

    private Atm _atm;

    public Transaction() {
    }

    public Transaction(int _transactionId, TransactionStatus _status, LocalDate _creationDate) {
        this._transactionId = _transactionId;
        this._status = _status;
        this._creationDate = _creationDate;
    }

    public boolean saveTransaction(){
        return false;
    }

    public int get_transactionId() {
        return _transactionId;
    }

    public void set_transactionId(int _transactionId) {
        this._transactionId = _transactionId;
    }

    public TransactionStatus get_status() {
        return _status;
    }

    public void set_status(TransactionStatus _status) {
        this._status = _status;
    }

    public LocalDate get_creationDate() {
        return _creationDate;
    }

    public void set_creationDate(LocalDate _creationDate) {
        this._creationDate = _creationDate;
    }
}
