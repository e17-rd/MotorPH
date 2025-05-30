import java.util.List;

public class Payroll {
    private int payrollId;
    private Employee employee;
    private List<Attendance> attendance;
    private double totalHours;
    private double grossPay;
    private double deduction;

    public Payroll(int payrollId, Employee employee, List<Attendance> attendance, double deduction) {
        this.payrollId = payrollId;
        this.employee = employee;
        this.attendance = attendance;
        this.deduction = deduction;
    }

    public void calculatePayroll() {
        totalHours = 0.0;
        for (Attendance a : attendance) {
            totalHours += a.getWorkedHours();
        }

        double hourlyRate = employee.getDailyRate() / 8.0;
        grossPay = totalHours * hourlyRate;
    }

    public String generatePayslip() {
        return "Payroll ID: " + payrollId + "\n" +
               employee.getDetails() + "\n" +
               "Total Hours Worked: " + totalHours + "\n" +
               "Gross Pay: " + grossPay + "\n" +
               "Deductions: " + deduction + "\n" +
               "Net Pay: " + (grossPay - deduction);
    }
}
