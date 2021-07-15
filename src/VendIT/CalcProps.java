package VendIT;

public class CalcProps implements Calc {

    @Override
    public int calculateTotal(coinBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public coinBundle calculateChange(int amountMoneyToReturn) {
        coinBundle change = new coinBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;
        change.number100CentsCoins = remainingAmount / coin.HUNDRED_CENTS.getValue();
        remainingAmount = remainingAmount % coin.HUNDRED_CENTS.getValue();

        change.number50CentsCoins = remainingAmount / coin.FIFTY_CENTS.getValue();
        remainingAmount = remainingAmount % coin.FIFTY_CENTS.getValue();

        change.number20CentsCoins = remainingAmount / coin.TWENTY_CENTS.getValue();
        remainingAmount = remainingAmount % coin.TWENTY_CENTS.getValue();

        change.number10CentsCoins = remainingAmount / coin.TEN_CENTS.getValue();
        remainingAmount = remainingAmount % coin.TEN_CENTS.getValue();

        change.number5CentsCoins = remainingAmount / coin.FIVE_CENTS.getValue();


        return change;
    }
}