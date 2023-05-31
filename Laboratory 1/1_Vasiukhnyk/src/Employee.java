
public class Employee implements Measurable {
    private String surname;
    private String name;
    private double salary;

    public Employee(String surname, String name, double salary) {
        this.surname = surname;
        this.name = name;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public double getMeasure() {
        return salary;
    }

    public static double average(Measurable[] objects) {
        double sum = 0;
        for (int i = 1; i < objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        return sum / objects.length;
    }

    public static Measurable Measurablelargest(Measurable[] objects) {
        Measurable maxElement = objects[0];
        for (int i = 1; i < objects.length; i++) {
            if (objects[i].getMeasure() > maxElement.getMeasure()) {
                maxElement = objects[i];
            }
        }
        return maxElement;
    }
    //Exercise 3

   /* Dla typu Scanner typem nadrzędnym  jest klasa Object.
    Dla typu String typem nadrzędnym  jest klasa Object.
    Dla typu ImageOutputStream typem nadrzędnym  jest interfejs ImageOutputStream.Jego rodzaj nadrzędny to
    interfejs ImageInputStream, który z kolei ma rodzaj nadrzędny
    AutoCloseable. Ostatecznie, wszystkie mają rodzaj nadrzędny Object.
    */
    }
