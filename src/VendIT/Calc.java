package vendIT;

import vendIT.coinBundle;

public interface Calc {

    int calcTotal(coinBundle coinIn);
    coinBundle calcChange(int enteredByUserMoney);

}
