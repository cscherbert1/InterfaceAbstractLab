package lab1;

import java.util.ArrayList;

/**
 *
 * @author cscherbert1
 */
public class College {
    //List keeps track of all courses at the college
    private ArrayList<Course> courseInventory = new ArrayList<>();
    
    public void addNewCourse(Course course){
        courseInventory.add(course);
        System.out.println("New course added for this semester: " + course.getCourseName());
    }
    
}
