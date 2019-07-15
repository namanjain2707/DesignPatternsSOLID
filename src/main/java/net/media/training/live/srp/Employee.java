package net.media.training.live.srp;


public class Employee {
    private int empId;

    private double monthlySalary;
    private String name;
    Address employeeAddress;
    Leaves leaves;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;


    public Employee(int empId, double monthlySalary, String name, Address employeeAddress, Leaves leaves) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.employeeAddress = employeeAddress;
        this.leaves = leaves;
        this.yearsInOrg = leaves.getLeavesLeftPreviously().length;
    }

    public Employee() {
    }

    public int getLeavesRemaining(){
        return this.getTotalLeaveAllowed() - this.getLeaveTaken();
    }

    public String getManagerName(){
        if(this.manager!=null){
            return this.manager;
        }
        else return "None";
    }

    public int getTotalLeaveLeftPreviously() {
        int totalLeaveLeftPreviously = 0;
        for (int year = 0; year < this.getYears(); year++) {
            totalLeaveLeftPreviously += this.leaves.getLeavesLeftPreviously()[yearsInOrg-year-1];
        }
        return totalLeaveLeftPreviously;
    }

    public int getYears(){
        int years = 3;
        if (yearsInOrg < 3) {
            years = yearsInOrg;
        }

        return years;
    }

    public long getYearlySalary(){
        return Math.round(12*this.monthlySalary);
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getTotalLeaveAllowed() {
        return this.leaves.getTotalLeaveAllowed();
    }

    public int getLeaveTaken() {
        return this.leaves.getLeaveTaken();
    }
//other method related to customer
}
