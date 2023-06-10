class Employee {
    private String NameOfEmpoloyee;
    private double PayMent;

    public Employee(String name, double salary) {
        this.NameOfEmpoloyee = name;
        this.PayMent = salary;
    }

    public String getName() {
        return NameOfEmpoloyee;
    }

    public double getPayMent() {
        return PayMent;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + NameOfEmpoloyee + '\'' + ", salary=" + PayMent + '}';
    }
}