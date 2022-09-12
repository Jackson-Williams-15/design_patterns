package decorator;

import java.util.ArrayList;
/**
 * For the christmas tree
 * @author Jackson Williams
 */
public class ChristmasTree extends Tree {
/**
 * Grabs tree from file
 */
    public ChristmasTree() {
        super(FileReader.getLines("decorator/txt/tree.txt"));

    }
    
}
