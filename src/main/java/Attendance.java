import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;

public class Attendance {
    private LocalDate date;
    private LocalTime timeIn;
    private LocalTime timeOut;
    private Employee employee;

    public Attendance(LocalDate date, LocalTime timeIn, LocalTime timeOut, Employee employee) {
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.employee = employee;
    }

    public double getWorkedHours() {
        Duration duration = Duration.between(timeIn, timeOut);
        return duration.toMinutes() / 60.0;
    }

    public Employee getEmployee() {
        return employee;
    }
}
