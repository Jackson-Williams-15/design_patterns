package strategy;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class MoveBehavior {
    private static final int DEFAULT_SPEED = 200;
    private static final int NUM_MOVES = 30;

    /**
     * Moves the character across the screen
     * 
     * @param character The String represtation of the character.
     */
    public abstract void move(ArrayList<String> character);

    /**
     * Continouly moves the character accross the screen NUM_MOVE times
     * Will pause inbetween moves, and clear the screen
     * 
     * @param character The ArrayList of String that represents the character
     * @param speed     The speed at which the character moves 1, 2, 3. 1 is slow, 3
     *                  is fast
     */
    public void move(ArrayList<String> character, int speed) {
        for(int j = 0; j < NUM_MOVES; j++ )
        {
            displayCharacter(character);
            pushCharacterForward(character);
            sleep(DEFAULT_SPEED/speed);
            clear();
        }
    }
    

    /**
     * Displays the character, e.g.
     * o
     * -|-
     * / \
     * 
     * @param character An arrayList were index 0 is the first line of character,
     *                  1 is the second line of the character...
     */
    private void displayCharacter(ArrayList<String> character) {
        for (int j = 0; j < character.size(); j++) {
            System.out.println(character.get(j));
        }
    }

    /**
     * Advances each item in the arraylist 1 space forward
     * 
     * @param character The list to move forward
     */
    private void pushCharacterForward(ArrayList<String> character) {
        for (int j = 0; j < character.size(); j++) {
            character.set(j, " " + character.get(j));
        }
    }

    /**
     * Pauses the program
     * 
     * @param num The miliseconds to pause the program for
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }

    /**
     * Clears the console
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
}
