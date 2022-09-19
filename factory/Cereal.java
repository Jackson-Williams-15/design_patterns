package factory;

import java.util.ArrayList;
import java.util.Random;
/**
 * creates standards for cereals
 * @author Jackson Williams
 */
public abstract class Cereal extends GroceryStore{
   protected String name;
   protected double price;
   protected ArrayList<String> toys = new ArrayList<String>();

   /**
    * sets the parameters for the cereal
    * @param name this is the name of the cereal
    * @param price this is the price of the cereal
    */
    public Cereal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * preparing the cereal
     * @return returns an empty space 
     */
    public String prepare() {
     return " ";
    }
    /**
     * prints out the boxing of the cereal and uses a random function to reanomly select from toy array
     * list.
     * @return returns the print out of the boxing cereal.
     */
    public String boxCereal() {
        Random r = new Random();
        int randomitem = r.nextInt(toys.size());

        return "Boxing the " + name + "\n\t - drawing fun pictures of " + name + " on the box\n\t -"+
         "pouring the " + name + " into the box\n\t - adding the surprise " + toys.get(randomitem) +"\n";
    }

    /**
     * sets the price of the particular cereal
     * @return returns the price of cereal
     */
    public String priceCereal() {
        return "Putting the price tag of "+price+" on the "+name+ " box";
    }
}
