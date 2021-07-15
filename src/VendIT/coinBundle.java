package vendIT;

public class coinBundle {
	
    public int nickelCoins;
    public int dimeCoins;
    public int quarterCoins;
    public int halfDollarCoins;
    public int numberDOLLAR;

    public coinBundle(int... coinIn) {
        this.nickelCoins = coinIn[0];
        this.dimeCoins = coinIn[1];
        this.quarterCoins = coinIn[2];
        this.halfDollarCoins = coinIn[3];
        this.numberDOLLAR = coinIn[4];

    }


    public int getTotal(){
        int total = 0;
        total = total+this.nickelCoins*coin.FIVE_CENTS.getValue();
        total = total+this.dimeCoins*coin.TEN_CENTS.getValue();
        total = total+this.quarterCoins*coin.TWENTYFIVE_CENTS.getValue();
        total = total+this.halfDollarCoins*coin.FIFTY_CENTS.getValue();
        total = total+this.numberDOLLAR*coin.DOLLAR.getValue();
        return total;
    }
}
