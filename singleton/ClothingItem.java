package singleton;

/**
 * new clothing items 
 * @author Jackson Williams
 */
import java.util.ArrayList;

public class ClothingItem {
    private String name;
    private ClothingPart part;
    private String color;
    private ArrayList<Season> seasons = new ArrayList<Season>();
/**
 * creates the clothing item
 * @param name name of the item
 * @param part what part it is , ie top bottom or whole
 * @param color the color of the items 
 */
    public ClothingItem(String name, ClothingPart part, String color){
        this.name = name;
        this.part = part;
        this.color = color;
    }

    /**
     * determines if there is a season 
     * @param season the season a certain outfit falls under
     * @return if there is a season then true, otherwise return there is no season (false). 
     */
    public boolean hasSeason(Season season){
        if(season != null ) {
            return true;
           }
           else
            return false;
        }
 /**
  * adds seasons to the array list of seasons. 
  * @param season the season that the clothing item is.
  */
    public void addSeason(Season season){
        if(season != null){
        seasons.add(Season.FALL);
        seasons.add(Season.SPRING);
        seasons.add(Season.SUMMER);
        seasons.add(Season.WINTER);
        }
    }

/**
 * prints out the outfit in the order of color and the name of the clothing item. 
 */
    public String toString(){
        return color + " " +  name;
    }
}
