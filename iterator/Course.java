package iterator;
/**
 * creates the course
 * @author Jackson Williams
 */
public class Course {
    private Assignment[] assignments = new Assignment[5];
    private int count;
    private String name;
    private String title;

    /**
     * creates the name and title of course
     * @param name the name of the course
     * @param title the title of the course.
     */
    public Course(String name, String title){
        this.name = name;
        this.title = title;
    }

    /**
     * adds an assignment to array. if the count is not the length of the array it increases the count
     * otherwise it will grow the array. 
     * @param title title of the assignmnet
     * @param description description of the assignment
     * @param topic the topic of assignment 
     */
    public void addAssignment(String title, String description, Topic topic){
        
        if(count != assignments.length){
            Assignment assignment = new Assignment(title, description, topic);
            this.assignments[this.count] = assignment;
            count++;
        }       
            else{
                growArray(assignments);
            }
    }

    /**
     * creates the iterator
     * @return the iterator to go through the assignments. 
     */
    public AssignmentIterator createIterator(){
        AssignmentIterator assignmentIterator = new AssignmentIterator(assignments);
        return assignmentIterator;
    }
    
    /**
     * represents name and title as a string
     * @return returns the name and title of the course as a string
     */
    public String toString(){
        return name + title;
    }

/**
 * grows the array * 2 if the original array length is not big enough by creating a temporary array. 
 * @param first this is the first array to be created. 
 * @return returns the first array. 
 */
    public Assignment[] growArray(Assignment[] first){
       Assignment[] newAssignments = new Assignment[assignments.length * 2];
       if(assignments.length == 5){
       for (int i = 0; i < assignments.length; i++){
        newAssignments[i] = assignments[i];
     }
    }
     assignments = first;
        return first;
    }
}
