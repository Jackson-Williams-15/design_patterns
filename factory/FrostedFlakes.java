package factory;

/**
 * creates the frosted flakes
 * @author Jackson Williams
 */
  public class FrostedFlakes extends Cereal {

     /*
     * adds name and price of cereal. Also adds toys to the arraylist
     */
        public FrostedFlakes() {
            super("Frosted Flakes",2.99);
            toys.add("Spider-man tattoo");
            toys.add("Barbie tattoo");
            toys.add("Snap bracelet");
            toys.add("Happy feet figurine");
        }

        /**
         * describes the preparation of the frosted flakes 
         * @return the prep string for the frosted flakes including the name 
         */
        public String prepare() {
          return "Preparing the " + this.name + "\n\t - gather the grain\n\t - shape into flakes\n\t -" + 
          "sprinkle with frosting\n";
        }
       
}
