package pro.sky.domRab2_8;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements EmployeeInterface {

    private List<Departament> departamentList = new ArrayList<>(List.of(
            new Departament(1, "Административный"),
            new Departament(2, "Производственный"),
            new Departament(3, "Бухгалтерия"),
            new Departament(4, "Транспортный"),
            new Departament(5, "ОТК")
    ));
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


    @Override
    public String toString() {
        return employeeBook + " ";
    }

    @Override
    public Employee employeeSalaryMax(int depart) {
        return null;
    }

    @Override
    public Employee employeeSalaryMin(int depart) {
        return null;
    }

    @Override
    public Employee employeesDepart(int depart) {
        return null;
    }

    @Override
    public Employee employeesDepart() {
        return null;
    }

}
