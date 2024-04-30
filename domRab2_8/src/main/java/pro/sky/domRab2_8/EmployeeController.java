package pro.sky.domRab2_8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class EmployeeController {
    private final EmployeeInterface employeeInterface;
    private final DepartamentInterface departamentInterface;

    public EmployeeController(EmployeeInterface employeeInterface,
                              DepartamentInterface departamentInterface) {
        this.employeeInterface = employeeInterface;
        this.departamentInterface = departamentInterface;
    }

    @GetMapping(path = "/departments/max-salary")
    // /departments/max-salary?departmentId=5
    public Employee employeeSalaryMax(@RequestParam("departmentId") int depart) {
        return employeeInterface.employeeSalaryMax(depart);
    }

    @GetMapping(path = "/departments/min-salary")
    // /departments/max-salary?departmentId=5
    public Employee employeeSalaryMin(@RequestParam("departmentId") int depart) {
        return employeeInterface.employeeSalaryMin(depart);
    }

    @GetMapping(path = "/departments/all-for-departs")
    public List<Employee> employeesDepart(@RequestParam("departmentId") int depart) {

        return employeeInterface.employeesDepart(depart);
    }

    @GetMapping(path = "/departments/all")
    // /departments/max-salary?departmentId=5
    public Map<Integer, List<Employee>> employeesDepart() {
        return employeeInterface.employeesDepartAll();
    }

    @GetMapping(path = "/departments/add")
    public String addDepart(@RequestParam("departNum") int numDepart, @RequestParam("departName") String nameDepart) {
        return departamentInterface.addDepart(numDepart, nameDepart);
    }

    @GetMapping(path = "employees/add")
    public String addEmployee(@RequestParam("lastName") String lastName,
                              @RequestParam("name") String name,
                              @RequestParam("surName") String surname,
                              @RequestParam("depart") int depart,
                              @RequestParam("salary") float salary) {
        return employeeInterface.addEmployee(departamentInterface.getDepartamentList(), lastName, name, surname, depart, salary).toString();
    }


}
