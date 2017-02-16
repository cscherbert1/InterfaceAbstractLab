package lab1;

/**
 *Create a startup class to test your code. In this startup class create 
   instances of each sub-class and set all properties. Then create a College
   object and call the method to add courses to semester inventory. Add each
   course, one at a time.
 * 
 * @author cscherbert1
 */
public class Startup {
    
    IntroToProgrammingCourse ip = new IntroToProgrammingCourse("Introduction to Programming", "152-107", "None");
    IntroJavaCourse ij = new IntroJavaCourse("Java Programming", "152-134", "Introduction to Programming and Math & Logic");
    AdvancedJavaCourse aj = new AdvancedJavaCourse("Advanced Java Programming", "152-135", "Java Programming and Database Concepts");
    
    College college = new College();
    
    public static void main(String[] args) {
        Startup start = new Startup();
        
        start.addClasses();
    }
    public void addClasses(){
        college.addNewCourse(ip);
        college.addNewCourse(ij);
        college.addNewCourse(aj);
    }
   
    
    
}
