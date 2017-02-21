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
    private ReportService reportService = new ReportService();

    public static void main(String[] args) {
        Startup start = new Startup();
        
        start.addClasses();
    }
    public void addClasses(){
        
        IntroToProgrammingCourse ip = new IntroToProgrammingCourse("Introduction to Programming", "152-107", 2.0, "None", "C-1");
        IntroJavaCourse ij = new IntroJavaCourse("Java Programming", "152-134", 4.0, "Introduction to Programming and Math & Logic");
        AdvancedJavaCourse aj = new AdvancedJavaCourse("Advanced Java Programming", "152-135", 4.0, "Java Programming and Database Concepts");

        College college = new College();    
        
        
        
        college.addNewCourse(ip);
        reportService.addData("This course uses Raspberry Pi's. The cart number is: " + ip.getRaspberryPiCartNumber());
        reportService.outputReport();
        reportService.clearReport();
        
        college.addNewCourse(ij);
        ij.teachClassesContent();
        
        college.addNewCourse(aj);
        aj.teachInheritanceContent();
    }
   
    
    
}
