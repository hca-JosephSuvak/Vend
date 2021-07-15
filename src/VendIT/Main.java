package vendIT;
import java.util.Scanner;
import vendIT.tvint;
import vendIT.vint;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        vint machineInterface = new tvint();

        machineInterface.displayProducts();

        String selectedProduct = scanner.nextLine();
        machineInterface.selectProduct(Integer.parseInt(selectedProduct));

        machineInterface.displaycoinInMessage();

        String usercoinIn = scanner.nextLine();
        int[] coinIn = coin.parseCoins(usercoinIn);
        machineInterface.coinIn(coinIn);

        machineInterface.displayChangeMessage();

    }
}