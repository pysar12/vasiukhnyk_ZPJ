import java.util.Arrays;
import java.util.Comparator;

public class SortEployee {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Lilly", 10000),
                new Employee("Mark", 20000),
                new Employee("Nazar", 30000),
                new Employee("Marta", 40000),
                new Employee("Evan", 5000)
        };
        System.out.println("Ascending sort : ");
        Arrays.sort(employees, Comparator.comparing(Employee::getPayMent).thenComparing(Employee::getName));
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Descending sort : ");
        Arrays.sort(employees, Comparator.comparing(Employee::getPayMent).thenComparing(Employee::getName).reversed());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


}
