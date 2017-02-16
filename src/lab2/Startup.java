package lab2;

import lab1.*;

/**
 *Create a startup class to test your code. In this startup class create 
   instances of each sub-class and set all properties. Then create a College
   object and call the method to add courses to semester inventory. Add each
   course, one at a time.
 * 
 * @author cscherbert1
 */
public class Startup {

    public static void main(String[] args) {
        Startup start = new Startup();
        
        start.addClasses();
    }
    public void addClasses(){
        
        IntroToProgrammingCourse ip = new IntroToProgrammingCourse("Introduction to Programming", "152-107", "None");
        ip.setCredits(2.0);
        IntroJavaCourse ij = new IntroJavaCourse("Java Programming", "152-134", "Introduction to Programming and Math & Logic");
        ij.setCredits(4.0);
        AdvancedJavaCourse aj = new AdvancedJavaCourse("Advanced Java Programming", "152-135", "Java Programming and Database Concepts");
        aj.setCredits(4.0);

        College college = new College();    
        
        
        
        college.addNewCourse(ip);
        college.addNewCourse(ij);
        college.addNewCourse(aj);
    }
   
    
    
}
