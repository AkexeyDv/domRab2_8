package pro.sky.domRab2_8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(path = "/departments")
public class EmployeeController {
    private final EmployeeInterface employeeInterface;

    public EmployeeController(EmployeeInterface employeeInterface) {
        this.employeeInterface = employeeInterface;
    }

    @GetMapping(path = "/max-salary")
    // /departments/max-salary?departmentId=5
    public Employee employeeSalaryMax(@RequestParam("departmentId") int depart) {
        return employeeInterface.employeeSalaryMax(depart);
    }

    @GetMapping(path = "/min-salary")
    // /departments/max-salary?departmentId=5
    public Employee employeeSalaryMin(@RequestParam("departmentId") int depart) {
        return employeeInterface.employeeSalaryMin(depart);
    }

    @GetMapping(path = "/all-for-departs")
    // /departments/max-salary?departmentId=5
    public List<Employee> employeesDepart(@RequestParam("departmentId") int depart) {
        return employeeInterface.employeesDepart(depart);
    }

    @GetMapping(path = "/all")
    // /departments/max-salary?departmentId=5
    public Map<Integer, List<Employee>> employeesDepart() {
        return employeeInterface.employeesDepartAll();
    }


}
