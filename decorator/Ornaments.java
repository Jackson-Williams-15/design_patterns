package decorator;
/**
 * Ornaments for tree
 * @author Jackson Williams
 */
public class Ornaments extends TreeDecorator{
private Tree tree;
/**
 * receieves ornaments from file
 * @param tree connects ornaments from file
 */
    public Ornaments(Tree tree) {
        super(tree.lines);
        indegrateDecor(FileReader.getLines("decorator/txt/Ornaments.txt"));    }
    
}
