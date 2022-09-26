package iterator;
/**
 * creates the assignment 
 * @author Jackson Williams
 */
public class Assignment {
    private String title;
    private String description;
    private Topic topic;
/**
 * creates the assignment using strings and topic. 
 * @param title the title of the assignment
 * @param description the description of assignment
 * @param topic the different topic types of the assignments. 
 */
    public Assignment(String title, String description, Topic topic) {
        this.title = title;
        this.description = description;
        this.topic = topic;
    }

    /**
     * checks if the topic exists.
     * @param topic the topic for an assignment
     * @return returns true if the topic exists and false if topic does not.
     */
    public Boolean hasTopic(Topic topic) {
       if(topic != null ) {
        return true;
       }
       else
        return false;
    }

    /**
     * represents assignment details as a string
     * @return returns the title, description, and the topic as a string. 
     */
    public String toString() {
        return title + description + topic;
    }
}
