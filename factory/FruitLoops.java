package factory;

/**
 * creates the froot loops
 * @author Jackson Williams
 */
public class FruitLoops extends Cereal {

     /*
     * adds name and price of cereal. Also adds toys to the arraylist
     */
    public FruitLoops() {
        super("Fruit Loops",1.89);
        toys.add("Paw patrol stickers");
        toys.add("Batman ring");
        toys.add("Silly putty");
        toys.add("Tiny car");
    }

     /**
         * describes the preparation of the fruit loops 
         * @return the prep string for the fruit loops including the name 
         */
    public String prepare() {
        return ("Preparing the "+this.name+ " \n\t - gather the grain\n\t - shape into circles\n\t -" +
         "randomly color circles\n\t - let circles dry\n");
    }
}
