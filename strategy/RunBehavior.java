package strategy;
import java.util.ArrayList;

/**
 * A children class of MoveBehavior. Specifying for moving quickly. 
 * @author Jackson Williams
 * 
 */
public class RunBehavior extends MoveBehavior {

    @Override
    /**
     * Takes character string and moves that specific character using a corresponding speed value. 
     * @param character the corresponding character to be moved.
     */
    public void move(ArrayList<String> character) {
        int speed = 3;
        for(int j = 0; j < speed;j++ )
        {
            move(character, speed);
        }
    }
        
    }
    

