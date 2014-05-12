/**
 * Created by Giuseppe on 5/11/2014.
 */
public class AssetExample {
    public static void main(String[] args) {
        Asset[] investments = new Asset[2];
        investments[0] = new Cash(500.00);
        investments[1] = new Cash(500.00);

        for (int i = 0; i < investments.length; i++) {
            System.out.println(investments[i]);
            System.out.println("Market value is: " +
                    investments[i].getMarketValue() +
                    ", profit is: " +
                    investments[i].getProfit());
            System.out.println();

        }

        if(investments[0].equals(investments[1]))
            System.out.println("The two investments are equal.");

        else
            System.out.println("The two investments are not equal.");
    }
}


// Represents financial assets that investors hold.
interface Asset {
    // how much the asset is worth
    public double getMarketValue();

    // how much money has been made on this asset
    public double getProfit();
}


// Represents an amount of money held by an investor.
class Cash implements Asset {
    private double amount;   // amount of money held

    // Constructs a cash investment of the given amount.
    public Cash(double amount) {
        this.amount = amount;
    }

    // Returns this cash investment's market value, which
    // is equal to the amount of cash.
    public double getMarketValue() {
        return amount;
    }

    // Since cash is a fixed asset, it never has any profit.
    public double getProfit() {
        return 0.0;
    }

    // Sets the amount of cash invested to the given value.
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean equals(Object o) {
        if (o instanceof Cash) {
            Cash other = (Cash) o;
            return amount == other.amount;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "cash@ $" + amount;
    }

}