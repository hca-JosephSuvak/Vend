package VendIT;
import java.util.Scanner;
import VendIT.tvint;
import VendIT.vint;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        vint machineInterface = new tvint();

        machineInterface.displayProducts();

        String selectedProduct = scanner.nextLine();
        machineInterface.selectProduct(Integer.parseInt(selectedProduct));

        machineInterface.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();
        int[] enteredCoins = coin.parseCoins(userEnteredCoins);
        machineInterface.enterCoins(enteredCoins);

        machineInterface.displayChangeMessage();

    }
}