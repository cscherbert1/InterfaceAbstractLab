package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course{
    private ReportService reportService = new ReportService();
//    String courseName;
//    private String courseNumber;
//    double credits;
//    String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisite) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisite);
    }
    
    public void teachBasicsOfProgrammingWithClasses(){
        reportService.addData("This course teaches students how to write classes in their programs.");
    }
    
    public void outputProgrammingWithClassesReport(){
        reportService.outputReport();
        reportService.clearReport();
    }

//    public String getCourseNumber() {
//        return courseNumber;
//    }
//
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }
//
//    public double getCredits() {
//        return credits;
//    }
//
//
//    public String getPrerequisites() {
//        return prerequisites;
//    }
//
//    public void setPrerequisites(String prerequisites) {
//        this.prerequisites = prerequisites;
//    }
//
//        public void setCredits(double credits) {
//        if(credits < 0 || credits > 5.0) {
//            System.out.println(
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
//        }
//        this.setCredits(credits);
//    }


    
    

}
