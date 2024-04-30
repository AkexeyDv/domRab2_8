package pro.sky.domRab2_8;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Validator extends RuntimeException {
    public Validator(String message) {
        super(message);
    }

    public void checkAddEmployeeSign(List<Employee> employeeList, String fullNameEmployee) {
        if (employeeList.stream()
                .map(e -> e.getLastNameEmployee() + e.getNameEmployee() + e.getSurnameEmployee())
                .anyMatch(fullName -> fullName.equals(fullNameEmployee))) {
            throw new EmployeeException();
        }

    }

    public void checkAddEmployeeDepart(List<Departament> departList, int depart) {
        if (departList.stream()
                .map(Departament::getNumDepart).noneMatch(numDep -> numDep == depart)) {
            throw new EmployeeException();
        }

    }

    public void checkNameEmployeeNonAlfa(String fullName) {
        if (!StringUtils.isAlpha(fullName)) {
            throw new EmployeeException();
        }
    }

    public void checkAddDepart(List<Departament> departList, int numDepart, String name) {
        if (departList.stream().map(Departament::getNumDepart)
                .anyMatch(numDep -> numDep == numDepart)
                || departList.stream().map(Departament::getNameDepart)
                .anyMatch(nameDep -> nameDep.equals(name))) {
            throw new DepartamentException();
        }
    }
}
