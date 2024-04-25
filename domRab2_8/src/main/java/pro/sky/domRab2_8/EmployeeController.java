package pro.sky.domRab2_8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/departments")
public class EmployeeController {
    private final EmployeeInterface employeeInterface;

    public EmployeeController(EmployeeInterface employeeInterface) {
        this.employeeInterface = employeeInterface;
    }

    @GetMapping("/max-salary")
    // /departments/max-salary?departmentId=5
    public Employee employeeSalaryMax(@RequestParam("departmentId") int depart) {
        return employeeInterface.employeeSalaryMax(depart);
    }
    @GetMapping("/min-salary")
    // /departments/max-salary?departmentId=5
    public Employee employeeSalaryMin(@RequestParam("departmentId") int depart) {
        return employeeInterface.employeeSalaryMin(depart);
    }

    @GetMapping("/all")
    // /departments/max-salary?departmentId=5
    public Employee employeesDepart(@RequestParam("departmentId") int depart) {
        return employeeInterface.employeesDepart(depart);
    }

    @GetMapping("/all")
    // /departments/max-salary?departmentId=5
    public Employee employeesDepart() {
        return employeeInterface.employeesDepart();
    }




}
