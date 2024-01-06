import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class changeExchange implements Interface {
    private int[] valueOfBills = { 1, 5, 10, 20, 50, 100 };
    private int[] valueOfCoins = { 1, 5, 10, 25 };
    private DecimalFormat dFormat = new DecimalFormat("0.00");
    private Scanner console;
    private String Change;

    @Override
    public void splitAndCount(String Change) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'splitAndCount'");
    }

    @Override
    public void userInput() {
        boolean userFlag = true;
        do {
            System.out.print("please enter the change you want to exchange: ");
            try {
                console = new Scanner(System.in);
                BigDecimal input;
                input = console.nextBigDecimal();
                Change = dFormat.format(input);
                System.out.println(Change);
                userFlag = false;
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
            }
        } while (userFlag);
        splitAndCount(Change);
    }

}
