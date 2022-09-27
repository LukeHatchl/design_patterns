package iterator;

import java.util.Iterator;

public class AssignmentIterator implements Iterator<Assignment> {
    private Assignment[] assignments;
    private int position = 0;

    /**
     * assigns generic assignments to this instance
     * @param assignments array of assignments
     */
    public AssignmentIterator(Assignment[] assignments) {
        this.assignments = assignments;
    }

    /**
     * determines if array of assignments has a next item
     * @return boolean saying if there is a next assignment
     */
    public boolean hasNext() {
        if(position >= assignments.length || assignments[position] == null) {
			return false;
		} else {
			return true;
		}
    }

    /**
     * gets the next assignment in array of assignments
     * @return
     */
    public Assignment next() {
        Assignment assignment = assignments[position];
        position = position + 1;
        return assignment;
    }
    
}
