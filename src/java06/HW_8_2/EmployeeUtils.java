package java06.HW_8_2;

public class EmployeeUtils {
//    поиск сотрудника в массиве по его имени

    public int findEmployeeByName(String name, Employee[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
//    поиск сотрудника в массиве по вхождению указанной строки в его имени
public int findEmployeeBySubName(String subName, Employee[] array){
    for (int i = 0; i < array.length; i++){
        if (array[i].getName().contains(subName)){
            return i;
        }
    }
    return -1;
}

//    подсчет зарплатного бюджета для всех сотрудников в массиве
public double countBudget(Employee[] array){
        double budget = 0;
    for (Employee employee : array) {
        budget += employee.getBaseSalary();
    }
    return budget;
}
//    поиск наименьшей зарплаты в массиве

//    поиск наибольшей зарплаты в массиве
public double findMaxSalary(Employee[] array){
    double maxSalary = Double.MIN_VALUE;
    for (Employee employee : array) {
        if (maxSalary < employee.getBaseSalary()){
            maxSalary = employee.getBaseSalary();
        }
    }
    return maxSalary;
}
//    поиск наименьшего количества подчиненных в массиве менеджеров
public int findMinAmountOfSubordinates(Manager[] array){
    int minAmountOfSubordinates = 0;
    for (Manager manager : array) {
        if (minAmountOfSubordinates < manager.getNumberOfSubordinates()){
            minAmountOfSubordinates = manager.getNumberOfSubordinates();
        }
    }
    return minAmountOfSubordinates;
}

//    поиск наибольшего количества подчиненных в массиве менеджеров
//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public double findMaxExtraSalary(Manager[] array){
    double maxExtraSalary = 0.0;
    for (Manager manager : array) {
        if (maxExtraSalary < (manager.getSalaryManager() - manager.getBaseSalary())){
            maxExtraSalary = (manager.getSalaryManager() - manager.getBaseSalary());
        }
    }
    return maxExtraSalary;
}
//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

}
