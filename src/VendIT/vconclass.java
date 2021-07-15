package vendIT;

public class vconclass implements vcon {

    private Calc calculator = new CalcProps();

    @Override
    public coinBundle calcChangee(vreqsell request) {
        int total = calculator.calculateTotal(request.coinIn);
        int totalChange = total - request.product.getPrice();
        return calculator.calcChangee(totalChange);
    }
}
