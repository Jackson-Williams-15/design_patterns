package iterator;
/**
 * iterator for the assignments
 * @author Jackson Williams
 */
import java.util.Iterator;
public class AssignmentIterator {
    private Assignment[] assignments = new Assignment[5];
    private int position;

/**
 * creates the assignmnet iterator
 * @param assignments initializes array of assignments 
 */
public AssignmentIterator(Assignment[] assignments) {
        this.assignments = assignments;
    }
    
    /**
     * makes sure to have the next index
     * @return returns the position less than the length of the array and if the position is not null.
     */
public boolean hasNext(){
        return position < assignments.length && assignments[position] != null;
    }

    /**
     * moves to the next index
     * @return moves the index by one in the assignmnet array. 
     */
 public Assignment next() {
       return assignments[position++];
    }
}
