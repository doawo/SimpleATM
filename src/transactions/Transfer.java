package transactions;

import enums.TransactionStatus;

import java.time.LocalDate;

public class Transfer extends Transaction{
    private int _destinationAccountNumber, _sourceAccountNumber;
    private double _amount;

    public Transfer(int _destinationAccountNumber, int _sourceAccountNumber, double _amount) {
        this._destinationAccountNumber = _destinationAccountNumber;
        this._sourceAccountNumber = _sourceAccountNumber;
        this._amount = _amount;
    }

    public Transfer(int _transactionId, TransactionStatus _status, LocalDate _creationDate, int _destinationAccountNumber, int _sourceAccountNumber, double _amount) {
        super(_transactionId, _status, _creationDate);
        this._destinationAccountNumber = _destinationAccountNumber;
        this._sourceAccountNumber = _sourceAccountNumber;
        this._amount = _amount;
    }

    public int get_destinationAccountNumber() {
        return _destinationAccountNumber;
    }

    public void set_destinationAccountNumber(int _destinationAccountNumber) {
        this._destinationAccountNumber = _destinationAccountNumber;
    }

    public int get_sourceAccountNumber() {
        return _sourceAccountNumber;
    }

    public void set_sourceAccountNumber(int _sourceAccountNumber) {
        this._sourceAccountNumber = _sourceAccountNumber;
    }

    public double get_amount() {
        return _amount;
    }

    public void set_amount(double _amount) {
        this._amount = _amount;
    }
}
