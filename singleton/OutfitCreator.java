package singleton;
/**
 *  makes new outfit
 * @author Jackson Williams
 */
import java.util.ArrayList;
import java.util.Random;

public class OutfitCreator {
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    private Random rand = new Random();
    private static OutfitCreator outfitCreator;
/**
 * calls file reader to initialize all of the arraylists and fill them with correct items
 */
    private OutfitCreator(){
        
         tops = FileReader.getClothing("singleton\\tops.txt", ClothingPart.TOP);
         bottoms =  FileReader.getClothing("singleton\\bottoms.txt", ClothingPart.BOTTOM);
         wholes = FileReader.getClothing("singleton\\wholes.txt", ClothingPart.WHOLE);
    }

    public static OutfitCreator getInstance(){
        if (outfitCreator == null) {
			outfitCreator = new OutfitCreator();
		}
		return outfitCreator;
    }

    /**
     * randomly selects outfit based off season with a chance of it being a whole out fit 
     * or an outfit with top and bottoms. First half of if statement decides whole outfits
     * and the else statement decides top/bottoms. 
     * @param season this is the seasons the clothing items fall under
     * @return returns the outfit as a set of strings
     */
    public String getOutfit(Season season){
        ClothingItem wholeClothes;
        ClothingItem topClothes;
        ClothingItem bottomClothes;
        String outfits = " ";
        if(rand.nextInt(2) == 1){
            wholeClothes = this.wholes.get(rand.nextInt(this.wholes.size()));
            while(!(wholeClothes.hasSeason(season))){
                wholeClothes = this.wholes.get(rand.nextInt(this.wholes.size()));
            }
            outfits = wholeClothes.toString();
        }
        else {
            topClothes = this.tops.get(rand.nextInt(this.tops.size()));
            bottomClothes = this.bottoms.get(rand.nextInt(this.wholes.size()));
            while(!(topClothes.hasSeason(season)&&bottomClothes.hasSeason(season))){
                topClothes = this.tops.get(rand.nextInt(this.tops.size()));
                bottomClothes = this.tops.get(rand.nextInt(this.bottoms.size()));
            }
            outfits = topClothes.toString() + bottomClothes.toString();
        }
        return outfits;
    }
}
