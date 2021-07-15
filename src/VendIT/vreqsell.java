package VendIT;

public class vreqsell {

    public Prdct product;
    public coinBundle enteredCoins;

    public vreqsell(int selectedProduct, int... enteredCoins) {
    	this.product = Prdct.valueOf(selectedProduct);
        this.enteredCoins = new coinBundle(enteredCoins);
    }
}

