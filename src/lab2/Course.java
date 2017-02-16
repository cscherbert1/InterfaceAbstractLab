package lab2;

/**
 *
 * @author cscherbert1
 */
public interface Course {
    //no properties, interfaces can't have them
    
    public abstract void setPrerequisites(String prerequisites);
    
    public abstract String getPrerequisites(); 

    public abstract void setCredits(double credits);
    
    public abstract double getCredits();

    public abstract void setCourseName(String courseName);
    
    public abstract String getCourseName();

    public abstract void setCourseNumber(String courseNumber);

    public abstract String getCourseNumber();
    
}
