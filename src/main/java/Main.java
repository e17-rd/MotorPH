import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Cruz", "Maria", "Cashier", 800.00);

        Attendance att1 = new Attendance(LocalDate.now(), LocalTime.of(9, 0), LocalTime.of(17, 0), emp);
        Attendance att2 = new Attendance(LocalDate.now().minusDays(1), LocalTime.of(9, 0), LocalTime.of(17, 0), emp);

        Payroll payroll = new Payroll(1, emp, Arrays.asList(att1, att2), 200.00);
        payroll.calculatePayroll();
        System.out.println(payroll.generatePayslip());
    }
}
