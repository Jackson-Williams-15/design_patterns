package decorator;
/**
 * Star for decoration
 * @author Jackson Williams
 */
public class Star extends TreeDecorator{
    private Tree tree;
/**
 * receives star from file
 * @param tree connects the star to the tree
 */
    public Star (Tree tree){
        super(tree.lines);
        indegrateDecor(FileReader.getLines("decorator/txt/star.txt"));    }
}
