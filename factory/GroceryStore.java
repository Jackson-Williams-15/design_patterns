package factory;
/**
 * creates cereal grocery store
 * @author Jackson Williams
 */

public class GroceryStore {
/**
 * this creates the cereals
 * @param type this is what type of cereal it is
 * @return if true then return the new class of cereal. returns null if null if none are true
 */
    public Cereal createCereal(String type) {
        if(type.equals("frosted flakes")) {
            return new FrostedFlakes();
        }
        else if(type.equals("fruit loops")) {
            return new FruitLoops();
        }
        else if(type.equals("lucky charms")) {
            return new LuckyCharms();
        }
        return null;
    }
}
