package decorator;

import java.util.ArrayList;
/**
 * Decorates the tree
 * @author Jackson Williams
 */
public abstract class TreeDecorator extends Tree {
    /**
     * connects the tree to tree decorator
     * @param lines lines from the tree.
     */
    public TreeDecorator(ArrayList<String>lines) {
        super(lines);
    }

    /**
     * supposed to read each character in text file and print out the decorations with the spaces 
     * separating them to fit on the tree.
     * @param decor for the array of decorations to go onto tree.
     */
    protected void indegrateDecor(ArrayList<String>decor){
        for(int j =0; j < decor.size(); j++){ 
            if(this.lines.size() > j) {
                for(int i = 0; i < decor.get(j).length();i++)
                {
                    if(this.lines.get(j).length() < i && decor.get(i).charAt(j) == ' '){
                        char[] Char = decor.get(j).toCharArray();
                        Char[i] = decor.get(j).charAt(i);
                         String Decor = Char.toString();
                        this.lines.set(i, Decor);
                    }
                    }
                }
            }
        }
       
    }
