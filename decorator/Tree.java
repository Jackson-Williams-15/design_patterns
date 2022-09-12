package decorator;

import java.util.ArrayList;
/**
 * Class for a tree
 * @author Jackson Williams
 */
public abstract class Tree {
    protected ArrayList<String> lines = new ArrayList<String>();
    
    /**
     * creates a new tree
     * @param lines establishes the lines to make up the tree.
     */
    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }
 
    /**
     * String representation of the tree
     */
    public String toString() {
        String print = "";
        for(int j = 0; j < lines.size(); j++){
          print += '\n';
          print += lines.get(j);
        }
        return print;
    }
}
