package bank;

import java.time.LocalDate;

public class Card {
    private String _cardNumber, _customerName;
    private LocalDate _cardExpiry;
    private int _pin;

    public Card() {
    }

    public Card(String _cardNumber, String _customerName, LocalDate _cardExpiry, int _pin) {
        this._cardNumber = _cardNumber;
        this._customerName = _customerName;
        this._cardExpiry = _cardExpiry;
        this._pin = _pin;
    }

    public String get_cardNumber() {
        return _cardNumber;
    }

    public void set_cardNumber(String _cardNumber) {
        this._cardNumber = _cardNumber;
    }

    public String get_customerName() {
        return _customerName;
    }

    public void set_customerName(String _customerName) {
        this._customerName = _customerName;
    }

    public LocalDate get_cardExpiry() {
        return _cardExpiry;
    }

    public void set_cardExpiry(LocalDate _cardExpiry) {
        this._cardExpiry = _cardExpiry;
    }

    public int get_pin() {
        return _pin;
    }

    public void set_pin(int _pin) {
        this._pin = _pin;
    }
}
