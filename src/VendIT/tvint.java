package vendIT;

import VendIT.vconclass;
import vendIT.Prdct;
import vendIT.vint;
import vendIT.vcon;
import vendIT.coinBundle;
import vendIT.vreqsell;

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
                " num of nickels, num of dimes , num of quarters, num of half-dollars ,num of $$ coins");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter 2 dimes: 0,2,0,0,0");
        System.out.println("Please enter coins:");

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
        System.out.println("    Dollars: " + change.numberDOLLAR);
        System.out.println("    Half-Dollars: " + change.halfDollarCoins);
        System.out.println("    Quarters: " + change.quarterCoins);
        System.out.println("    Dimes: " + change.dimeCoins);
        System.out.println("    Nickels: " + change.nickelCoins);

    }
}