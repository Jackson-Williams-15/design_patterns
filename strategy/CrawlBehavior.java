package strategy;
import java.util.ArrayList;

/**
 * A children class of MoveBehavior. Specifying for moving slowly. 
 * @author Jackson Williams
 * 
 */
public class CrawlBehavior extends MoveBehavior {
    
    @Override
    /**
     * Takes character string and moves that specific character using a corresponding speed value. 
     * @param character the corresponding character to be moved.
     */
    public void move(ArrayList<String> character) {
        int speed = 1;
        for(int j = 0; j < speed; j++ )
        {
            move(character, speed);
        }
    }        
    }
    

