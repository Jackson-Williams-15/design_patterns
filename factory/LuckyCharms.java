package factory;

/**
 * creates the lucky charms 
 * @author Jackson Williams
 */
public class LuckyCharms extends Cereal{

    /*
     * adds name and price of cereal. Also adds toys to the arraylist
     */
    public LuckyCharms() {
        super("Lucky Charms",1.55);
        toys.add("My little pony stickers");
        toys.add("Elsa ring");
        toys.add("Play doe");
        toys.add("Tiny truck");
    }
    
     /**
         * describes the preparation of the lucky charms
         * @return the prep string for the lucky charms including the name 
         */
    public String prepare() {
       return "Preparing the "+this.name+ " \n\t - gather the grain\n\t - shape into Xs and Ds\n\t -" +
        "create marshmallow shapes\n\t - mix grain and marshmallows\n";
    }

}
