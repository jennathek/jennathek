
package lab3;

import java.util.Random;

public class ShoppingCart {
    private int numOfItems;

    public ShoppingCart() {
        Random rand = new Random();
        numOfItems = rand.nextInt(50) + 1;
    }
}