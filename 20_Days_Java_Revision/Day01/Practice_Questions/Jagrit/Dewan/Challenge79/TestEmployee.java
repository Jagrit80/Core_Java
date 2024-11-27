package Jagrit.Dewan.Challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Jagrit", 30, 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Jaggu");
        System.out.println(emp.getEmployeeDetails());
    }
}
