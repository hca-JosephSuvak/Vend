package vendIT;

public class vconclass implements vcon {

    private Calc calculator = new CalcProps();

    @Override
    public coinBundle calcChange(vreqsell request) {
        int total = calculator.calcTotal(request.coinIn);
        int totalChange = total - request.product.getPrice();
        return calculator.calcChange(totalChange);
    }
}
