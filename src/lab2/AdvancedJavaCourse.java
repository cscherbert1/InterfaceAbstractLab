package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse implements Course{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private ReportService reportService = new ReportService();

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisite) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisite);
    }
    
    public void teachInheritanceContent(){
        reportService.addData("This course teaches students about the joys of inheritence.");
    }
    
    public void outputInheritenceContentReport(){
        reportService.outputReport();
        reportService.clearReport();
    }

//    public String getCourseNumber() {
//        return courseNumber;
//    }
//
//    public final void setCourseNumber(String courseNumber) {
//        if(courseNumber == null || courseNumber.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseNumber cannot be null of empty string");
//            System.exit(0);
//        }
//        this.courseNumber = courseNumber;
//    }
//
//    public double getCredits() {
//        return credits;
//    }
//
//    public void setCredits(double credits) {
//        if(credits < 0.5 || credits > 4.0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
//        }
//        this.credits = credits;
//    }
//
//    public String getPrerequisites() {
//        return prerequisites;
//    }
//
//    public void setPrerequisites(String prerequisites) {
//        if(prerequisites == null || prerequisites.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: prerequisites cannot be null of empty string");
//            System.exit(0);
//        }
//        this.prerequisites = prerequisites;
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public final void setCourseName(String courseName) {
//        if(courseName == null || courseName.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseName cannot be null of empty string");
//            System.exit(0);
//        }
//        this.courseName = courseName;
//    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }       
        this.courseName = courseName;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    
}
