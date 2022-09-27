package iterator;

public class Course {
    private int count = 0;
    private Assignment[] assignments = new Assignment[10];
    private String name;
    private String title;

    /**
     * assigns generic name and title to instance of name and title
     * @param name name of assignment
     * @param title title of the assignment
     */
    public Course(String name, String title) {
        this.name = name;
        this.title = title;
    }

    /**
     * adds and assignment to the array of assignments
     * grows the array if array of assignments is full
     * @param title title of the assignment
     * @param description description of assignment
     * @param topic topic the assignment is in i.e. all, design pattern, git ...
     */
    public void addAssignment(String title, String description, Topic topic) {
        Assignment assignment = new Assignment(title, description, topic);
        if(count == assignments.length) {
            assignments = growArray(assignments);
        }
        assignments[count] = assignment;
        count += 1;
    }

    /**
     * creates the iterator for assignment
     * @return new instance of assignment iterator
     */
    public AssignmentIterator createIterator() {
        return new AssignmentIterator(assignments);
    }

    /**
     * returns the string of assignmnet being printed out
     */
    public String toString() {
        return title + name;
    }

    /**
     * doubles the size of the array
     * @param first array being doubled
     * @return new array that is double the length of first
     */
    private Assignment[] growArray(Assignment[] first) {  
        int len = first.length;
        Assignment[] newArray = new Assignment[len*2];
        System.arraycopy(first, 0, newArray, 0, len);
        return newArray;
    }
}
