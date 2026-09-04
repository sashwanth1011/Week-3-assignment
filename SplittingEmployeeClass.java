class Employee {
    // Instance fields
    String empName;
    double salary;

    // Static fields shared across all instances
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++; // Increment counter on every instantiation
    }

    // Static method accessing only static context
    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        // Creating three Employee objects
        Employee e1 = new Employee("Divya", 65000);
        Employee e2 = new Employee("Arjun", 30000);
        Employee e3 = new Employee("Karan", 45000);

        // Calling static method via Class name directly
        Employee.printCompanyInfo();
    }
}