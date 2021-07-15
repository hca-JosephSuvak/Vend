package vendIT;

public class tvint implements vint {

    private vcon controller = new vconclass();
    private int selectedProduct;
    private coinBundle change;

    @Override
    public void displayProducts() {
        System.out.println("   ______________________________________________    ");
        System.out.println("     Please Purchase an Item from the Following: ");
        System.out.println("    ____________________________________________ ");
        System.out.println("                  Products:");
        System.out.println("                ____________");
        System.out.println("                                              ");
        for (Prdct product : Prdct.values()) {
            if (!Prdct.EMPTY.equals(product)) {
                System.out.println("     " + product.getSelectNum() + "  " + product.name() + " - Price: "
                        + product.getPrice() + "   ");
            }
        }
        System.out.println("                                              ");
        System.out.println(" Please select your product [Use the assigned numerical value]: ");

    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void displaycoinInMessage() {
        System.out.println(" Please enter coins as follows: ");
        System.out.println(
                " num of 5 cents coins,num of 10 cents coins,num of 20 cents coins,num of 50 cents coins,num of 100 cents coins  ");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter 2 ten cents coins: 0,2,0,0,0");
        System.out.println("Plese enter coins:");

    }

    @Override
    public void coinIn(int... coins) {
        vreqsell request = new vreqsell(selectedProduct, coins);
        change = controller.calcChange(request);

    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                              ");
        System.out.println("Your change is :" + change.getTotal() + "cents split as follows: ");
        System.out.println("    Dollar: " + change.numberDOLLAR);
        System.out.println("    50 cents coins: " + change.halfDollarCoins);
        System.out.println("    25 cents coins: " + change.quarterCoins);
        System.out.println("    10 cents coins: " + change.dimeCoins);
        System.out.println("    5 cents coins: " + change.nickelCoins);

    }
}