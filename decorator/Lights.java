package decorator;

/**
 * Lights for the decoration
 * @author Jackson Williams
 */
public class Lights extends TreeDecorator{
    private Tree tree;
/**
 * receieves lights from file
 * @param tree connects lights to tree
 */
    public  Lights(Tree tree) {
        super(tree.lines);
        indegrateDecor(FileReader.getLines("decorator/txt/lights.txt"));
    }
}
