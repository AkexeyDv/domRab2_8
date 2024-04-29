package pro.sky.domRab2_8;

import java.util.List;
import java.util.Map;

public interface EmployeeInterface {

    Employee employeeSalaryMax(int depart);

    Employee employeeSalaryMin(int depart);

    List<Employee> employeesDepart(int depart);

    Map<Integer, List<Employee>> employeesDepartAll();

    public Employee addEmployee(List<Departament> departament,
                                String lastName,
                                String name,
                                String surName,
                                int depart,
                                float salary);
}
