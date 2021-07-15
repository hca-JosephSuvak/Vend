package VendIT;

public class vconclass implements vcon {

    private Calc calculator = new CalcProps();

    @Override
    public coinBundle calculateChange(vreqsell request) {
        int total = calculator.calculateTotal(request.enteredCoins);
        int totalChange = total - request.product.getPrice();
        return calculator.calculateChange(totalChange);
    }
}
