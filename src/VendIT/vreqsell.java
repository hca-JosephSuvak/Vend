package vendIT;

import vendIT.Prdct;
import vendIT.coinBundle;

public class vreqsell {

    public Prdct product;
    public coinBundle coinIn;

    public vreqsell(int selectedProduct, int... coinIn) {
    	this.product = Prdct.valueOf(selectedProduct);
        this.coinIn = new coinBundle(coinIn);
    }
}

