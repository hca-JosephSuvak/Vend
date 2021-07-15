package VendIT;

public interface Calc {

    int calculateTotal(coinBundle enteredCoins);
    coinBundle calculateChange(int enteredByUserMoney);

}
