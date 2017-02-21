package lab1;

import java.util.ArrayList;

/**
 *
 * @author cscherbert1
 */
public class College {
    //List keeps track of all courses at the college
    private ArrayList<Course> courseInventory = new ArrayList<>();
    private ReportService reportService = new ReportService();
    
    public void addNewCourse(Course course){
        courseInventory.add(course);
        reportService.addData("New course added for this semester: " + course.getCourseName());
    }
    
    public void outputNewCourseReport(){
        reportService.outputReport();
        reportService.clearReport();
    }
    
}
