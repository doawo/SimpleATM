package deposit;

import atm.DepositSlot;

public class CashDepositSlot extends DepositSlot{

    public boolean receiveDollarBill(){
        return false;
    }

}
