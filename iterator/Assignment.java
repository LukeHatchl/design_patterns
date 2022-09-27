package iterator;

public class Assignment {
    private String title;
    private String description;
    private Topic topic;

    /**
     * assigns generic title, description, and topic to this instance
     * @param title title of the assignmnet
     * @param description description of the assignment
     * @param topic  topic the assignment is in i.e. all, design pattern, git ...
     */
    public Assignment(String title, String description, Topic topic) {
        this.title = title;
        this.description = description;
        this.topic = topic;
    }

    /**
     * compares topic of assignment to topic being passed in
     * @param topic topic being compared to topic of the assignment
     * @return return boolean saying if the assignment has a topic or not
     */
    public boolean hasTopic(Topic topic) {
        return topic.equals(this.topic);
    }

    /**
     * returns the string of assignmnet being printed out
     */
    public String toString() {
        return title + ": " + description;
    }
}
