package lab1;

import javax.swing.JOptionPane;

public abstract class Course {    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    /*
    Getters and setters are all concrete. Tried to make them abstract,
    but was unable to access the relative fields because they were private in Course. 
    eg) I thought having abstract setPrereq would be a good idea since we dont know how that's really defined
    for different schools. 
    */
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }    

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    public double getCredits(){
        return credits;
    }

    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }       
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return courseName;
    } 

    public void setCourseNumber(String courseNumber) {        
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }    
}
