package lab2;

/**
 *
 * @author cscherbert1   
 */
public class ReportService {       
    private String report = "";
    
    public void addData(String data) {
        report += data;
    }
    
    public void outputReport() {
        System.out.println(report);
    }
    
    public void clearReport() {
        report = "";
    }  
}
