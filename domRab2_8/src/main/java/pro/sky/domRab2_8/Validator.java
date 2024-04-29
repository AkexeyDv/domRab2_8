package pro.sky.domRab2_8;

import java.util.List;

public class Validator extends RuntimeException {
    public Validator(String message) {
        super(message);
    }

    public void checkAddEmployeeSign(List<Employee> employeeList, String fullNameEmployee) {
        if (employeeList.stream()
                .map(e -> e.getLastNameEmployee() + e.getNameEmployee() + e.getSurnameEmployee())
                .filter(fullName -> fullName.toString().equals(fullNameEmployee)).count() != 0) {
            throw new EmployeeException();
        }

    }

    public void checkAddEmployeeDepart(List<Departament> departList, int depart) {
        if (departList.stream()
                .map(dep -> dep.getNumDepart())
                .filter(numDep -> numDep == depart).count() == 0) {
            throw new EmployeeException();
        }

    }

}
