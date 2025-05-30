public class Employee {
    private int employeeId;
    private String lastName;
    private String firstName;
    private String position;
    private double dailyRate;

    public Employee(int employeeId, String lastName, String firstName, String position, double dailyRate) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.dailyRate = dailyRate;
    }

    public String getDetails() {
        return "ID: " + employeeId +
               ", Name: " + firstName + " " + lastName +
               ", Daily Rate: " + dailyRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getDailyRate() {
        return dailyRate;
    }
}
