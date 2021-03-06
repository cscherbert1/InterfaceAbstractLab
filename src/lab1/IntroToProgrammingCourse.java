package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      cscherbert1
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course{
//    private String courseName;
//    private String courseNumber;
//    private double credits;
//    private String prerequisites;
    
    private String raspberryPiCartNumber;

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits, String prerequisite, String raspberryPiCartNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisite);
        this.setRaspberryPiCartNumber(raspberryPiCartNumber);
    }
    
    public String getRaspberryPiCartNumber() {
        return raspberryPiCartNumber;
    }

    public void setRaspberryPiCartNumber(String raspberryPiCartNumber) {
        if(raspberryPiCartNumber == null || raspberryPiCartNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: raspberryPiCartNumber cannot be null of empty string");
            System.exit(0);
        }
        this.raspberryPiCartNumber = raspberryPiCartNumber;
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




    
}
