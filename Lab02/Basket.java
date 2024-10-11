
/** Basket.java
 *
 * Part of lab class for COM6516
 * Written by Mark Stevenson mark.stevenson@sheffield.ac.uk
 * Based on code written by Steve Maddock
 * Last modified 19 September 2014
 *
 */
public class Basket {

    public Basket(Item[] it) {
        items = it;
    }

    public double total() {
        double tot = 0.0;
        for (Item item : items) {
            tot += item.getPrice();
        }
        return tot;
    }

    private Item[] items;
}
