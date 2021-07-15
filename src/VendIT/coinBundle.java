package vendIT;

public class coinBundle {
	
    public int number5CentsCoins;
    public int number10CentsCoins;
    public int number20CentsCoins;
    public int number50CentsCoins;
    public int number100CentsCoins;

    public coinBundle(int... coinIn) {
        this.number5CentsCoins = coinIn[0];
        this.number10CentsCoins = coinIn[1];
        this.number20CentsCoins = coinIn[2];
        this.number50CentsCoins = coinIn[3];
        this.number100CentsCoins = coinIn[4];

    }


    public int getTotal(){
        int total = 0;
        total = total+this.number5CentsCoins*coin.FIVE_CENTS.getValue();
        total = total+this.number10CentsCoins*coin.TEN_CENTS.getValue();
        total = total+this.number20CentsCoins*coin.TWENTY_CENTS.getValue();
        total = total+this.number50CentsCoins*coin.FIFTY_CENTS.getValue();
        total = total+this.number100CentsCoins*coin.HUNDRED_CENTS.getValue();
        return total;
    }
}
