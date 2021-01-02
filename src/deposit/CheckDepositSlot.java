package deposit;

import atm.DepositSlot;

public class CheckDepositSlot extends DepositSlot{

    public double _getCheckAmount(){
        return super.get_totalAmount();
    }
}
