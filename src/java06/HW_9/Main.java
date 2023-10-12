package java06.HW_9;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Ann", 1500.00);
        worker1.getSalary();

        Manager manager1 = new Manager("Sergey", 3000.0, 7);

        Director director1 = new Director("Tania", 4000.0, 11);
        Employee[] arEmp = new Employee[] {manager1, director1, worker1};

        System.out.println(EmployeeUtils.findEmployeeByName("Ann", arEmp));
/// Is this a javadoc?

        /*! Is this a javadoc? */

        /* Is this a javadoc? */

/* Is this a javadoc? */
    }

}
