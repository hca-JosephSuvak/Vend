package VendIT;

import vendIT.CalcProps;
import vendIT.Calc;
import vendIT.coinBundle;
import vendIT.vcon;
import vendIT.vreqsell;

public class vconclass implements vcon {

    private Calc calculator = new CalcProps();

    @Override
    public coinBundle calcChange(vreqsell request) {
        int total = calculator.calcTotal(request.coinIn);
        int totalChange = total - request.product.getPrice();
        return calculator.calcChange(totalChange);
    }
}
