package java06.HW_7_1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Вася";
        p.sex = 'M';
        System.out.println(p.getName());

        Employee employee1 = new Employee();
        employee1.name = "Dan";

        Employee employee2 = new Employee();
        employee2.name = "Dan";
        System.out.println(employee2.isSameName(employee1));
        employee2.name = "Vania";
        System.out.println(employee2.isSameName(employee1));

        Employee[] arrayEmp = {employee1, employee2};
        Salary s = new Salary();

        System.out.println(s.getSum(arrayEmp));
    }
}
