package pro.sky.domRab2_8;

import java.util.List;

public interface EmployeeInterface  {

    Employee employeeSalaryMax(int depart);

    Employee employeeSalaryMin(int depart);

    Employee employeesDepart(int depart);

    Employee employeesDepart();
}
