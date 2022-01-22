package student;

import java.util.List;
import java.util.Queue;

class Shopper {
	public List<string> itemsInCart = new List<>();
}

// Checkout lines
List<Queue<Shopper>> checkoutLines = new Queue<>();

public void assignToQueue(Shopper shopper) {
// estimate the checkout time for each queue by calculating number of 
// shoppers in line by the number of items in their cart
int checkoutLine;

// to keep track of the current line with the lowest estimated checkout time
int minCheckoutTime;

for (int i = 0; i < checkoutLines.size(); i++) {
Int estCheckoutTime = 0 ;

For (Shopper shopper : checkoutLine) {
	// add a unit of time for checkout out each item in a 
	// shopper’s cart for every shopper in line.
estCheckoutTime += shopper.itemsInCart.size();	
}

// check if the checkout time for the current line is the shortest
// so far. If it is, then the current line is a candidate for the new
// shopper.
If (estCheckoutTime < minCheckoutTime) {
	minCheckoutTime = estCheckoutTime;
	checkoutLine = i;
}
}

// the checkout line with the lowest estimated checkout time is calculated and
// stored in the checkoutLine variable. This line is now the line that the shopper
// will be queued to.
checkoutLines.get(checkoutLine).enqueue(shopper);
