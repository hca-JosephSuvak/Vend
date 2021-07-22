package vendIT;

import vendIT.coinBundle;
import vendIT.Calc;
import vendIT.coin;

public class CalcProps implements Calc {

    @Override
    public int calcTotal(coinBundle coinIn) {
        return coinIn.getTotal();
    }

    @Override
    public coinBundle calcChange(int amountMoneyToReturn) {
        coinBundle change = new coinBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;
        change.numberDOLLAR = remainingAmount / coin.DOLLAR.getValue();
        remainingAmount = remainingAmount % coin.DOLLAR.getValue();

        change.halfDollarCoins = remainingAmount / coin.FIFTY_CENTS.getValue();
        remainingAmount = remainingAmount % coin.FIFTY_CENTS.getValue();

        change.quarterCoins = remainingAmount / coin.TWENTYFIVE_CENTS.getValue();
        remainingAmount = remainingAmount % coin.TWENTYFIVE_CENTS.getValue();

        change.dimeCoins = remainingAmount / coin.TEN_CENTS.getValue();
        remainingAmount = remainingAmount % coin.TEN_CENTS.getValue();

        change.nickelCoins = remainingAmount / coin.FIVE_CENTS.getValue();


        return change;
    }
}