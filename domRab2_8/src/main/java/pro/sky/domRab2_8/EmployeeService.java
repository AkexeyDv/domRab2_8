package pro.sky.domRab2_8;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements EmployeeInterface {


    private List<Employee> employeeBook = new ArrayList<>(List.of(
            new Employee("Иванов", "Степан", "Никифорович",
                    1, 120000),
            new Employee("Куликов", "Михаил", "Лефонтович",
                    2, 180000),
            new Employee("Измаилов", "Изидор", "Рамехович",
                    3, 120000),
            new Employee("Деньщиков", "Емельян", "Васильевич",
                    4, 80000),
            new Employee("Коньков", "Василий", "Прохорович",
                    4, 90000),
            new Employee("Линейкин", "Александр", "Николаевич",
                    5, 80000),
            new Employee("Распутин", "Емельян", "Давидович",
                    1, 125000)
    ));
    private Validator employeeCheck = new Validator("Ошибка");

    @Override
    public String toString() {
        return employeeBook + " ";
    }

    @Override
    public Employee employeeSalaryMax(int depart) {
        return employeeBook.stream()
                .filter(employee -> employee.getDepartEmployee() == depart)
                .max(Comparator.comparing(Employee::getSalaryEmployee))
                .orElseThrow();
    }

    @Override
    public Employee employeeSalaryMin(int depart) {
        return employeeBook.stream()
                .filter(employee -> employee.getDepartEmployee() == depart)
                .min(Comparator.comparing(Employee::getSalaryEmployee))
                .orElseThrow();
    }

    @Override
    public List<Employee> employeesDepart(int depart) {
        return employeeBook.stream()
                .filter(employee -> employee.getDepartEmployee() == depart).toList();
    }

    @Override
    public Map<Integer, List<Employee>> employeesDepartAll() {
        return employeeBook.stream()
                .collect(Collectors.groupingBy(Employee::getDepartEmployee));
    }

    public Employee addEmployee(List<Departament> departList,
                                String lastName,
                                String name,
                                String surName,
                                int depart,
                                float salary) {
        try {
            employeeCheck.checkAddEmployeeSign(employeeBook,
                    lastName + name + surName);
        } catch (EmployeeException e) {
            throw new RuntimeException("Пользователь с такими данными уже существует");
        }
        try {
            employeeCheck.checkAddEmployeeDepart(departList, depart);
        } catch (EmployeeException e) {
            throw new RuntimeException("Такого отдела нет");
        }
        Employee newEmployee = new Employee(lastName, name, surName, depart, salary);
        employeeBook.add(newEmployee);
        return newEmployee;
    }

}





