package net.media.training.live.srp;

public class EmployeeInformationHTML implements EmployeeInformation {
    Employee employee;

    public EmployeeInformationHTML(Employee employee){
        this.employee = employee;
    }

    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName()+ "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + employee.getLeavesRemaining() + "</span>";
        str += "<span>" + employee.getYearlySalary() + "</span>";
        str += "<span>" + employee.getManagerName() + "</span>";
        str += "<span>" + employee.getTotalLeaveLeftPreviously() + "</span>";
        return str + "</div> </div>";
    }
}
