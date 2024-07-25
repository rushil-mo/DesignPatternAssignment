package net.media.training.live.srp;
import java.lang.*;

public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;
    private int[] leavesLeftPreviously;


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }
}
class EmployeeOutput{
    private int empId;
    private double monthlySalary;
    private String name;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private String manager;
    private int yearsInOrg;
    private int[] leavesLeftPreviously;
    public String getHtmlOutput() {
        String str = "<div>" ;
        str +=  "<h1>Employee Info</h1>";
        str +=  "<div id='emp" + empId + "'>"; 
        str +=  "<span>" + name + "</span>" ;
        str +=  "<div class='left'>" ;
        str +=  "<span>Leave Left :</span>"; 
        str +=  "<span>Annual Salary:</span>"; 
        str +=  "<span>Manager:</span>" ;
        str +=  "<span>Reimbursable Leave:</span>"; 
        str +=  "</div>";
        str += "<div class='right'><span>" + (totalLeaveAllowed - leaveTaken) + "</span>";
        str += "<span>" + Math.round(monthlySalary * 12) + "</span>";
        str += "<span>" + ((manager!=null)?manager:"None") + "</span>";
        int years = Math.min(3,yearsInOrg);
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) 
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        str+= "</div> </div>";
        return str;
    }
    //other method related to customer
}
